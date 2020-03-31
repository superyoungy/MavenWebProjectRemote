package com.yc.ShoppingCart.Controller;

import com.yc.ShoppingCart.entity.Item;
import com.yc.ShoppingCart.entity.ShoppingCart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.DecimalFormat;

@WebServlet("/showCart")
public class ShowCart extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //请求转发到前端页面
        request.getRequestDispatcher("/WEB-INF/views/showCart.jsp").forward(request,response);
    }
}
