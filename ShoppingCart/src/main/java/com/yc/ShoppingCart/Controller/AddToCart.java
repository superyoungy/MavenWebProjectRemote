package com.yc.ShoppingCart.Controller;

import com.yc.ShoppingCart.daoImpl.QueryProductImpl;
import com.yc.ShoppingCart.entity.Product;
import com.yc.ShoppingCart.entity.ShoppingCart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/addToCart")
public class AddToCart extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pid=request.getParameter("id");//获取product的id
        Product product=new QueryProductImpl().QueryProductById(pid);//查询product
        //session中得到购物车cart
        HttpSession session=request.getSession();
        ShoppingCart cart=(ShoppingCart)session.getAttribute("cart");
        //如果session域中没有购物车对象cart，创建新对象并保存到session域中
        if(cart==null) {
            cart=new ShoppingCart();
        }
        //购物车添加商品
        cart.addToCart(product);
        session.setAttribute("cart",cart);
        response.sendRedirect("showProducts");
    }
}
