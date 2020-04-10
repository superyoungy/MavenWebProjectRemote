package com.yc.ShoppingCart.Controller;

import com.yc.ShoppingCart.dao.mpl.QueryProductImpl;
import com.yc.ShoppingCart.entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//根据request域中的id值模拟查询指定商品，并将商品信息放到request域中，然后请求转发到显示界面
@WebServlet("/showProductDetails")
public class ShowProductDetails extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //根据id查询product
        String id=request.getParameter("id");
        Product product=new QueryProductImpl().QueryProductById(id);
        /*
        商品的查询记录：
        最新查询的先显示，最多显示5条数据，不能有重复
         */
        Cookie cookie=null;
        Cookie[] cookies=request.getCookies();
        for(Cookie c:cookies) {
            if("ids".equals(c.getName())) {
                cookie=c;
                break;
            }
        }
        if(cookie==null) {
            cookie=new Cookie("ids",id);
//            cookie.setMaxAge(-1);//当前浏览器有效
            cookie.setPath("/");
        }else {
            String[] array=cookie.getValue().split("-");
            if(array==null||array.length==1) {
                if(!id.equals(cookie.getValue())) {
                    cookie.setValue(id+"-"+cookie.getValue());
                }
            }
            else {
                StringBuilder stringBuilder=new StringBuilder(id);
                int count=1;
                for(int i=1;i<=array.length;i++) {
                    if(!id.equals(array[i-1])) {
                        stringBuilder.append("-"+array[i-1]);
                        count++;
                    }
                    if(count>=5) break;
                }
                cookie.setValue(stringBuilder.toString());
            }
        }
        response.addCookie(cookie);
        //将查询到的product放到request域中，请求转发到showProductsDetails.jsp
        request.setAttribute("product",product);
        request.getRequestDispatcher("/WEB-INF/views/showProductDetails.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
