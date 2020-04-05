package com.yc.ShoppingCart.Controller;

import com.yc.ShoppingCart.daoImpl.QueryProductImpl;
import com.yc.ShoppingCart.entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/showProducts")
public class ShowProducts extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        List<Product> list = new QueryProductImpl().QueryAll();
        request.setAttribute("products",list);
        request.getRequestDispatcher("/WEB-INF/views/showProducts.jsp").forward(request,response);
    }
}
