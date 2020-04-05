package com.yc.login;

import javafx.application.Application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/loginCheck")
public class LoginTest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //验证码验证
//        Enumeration<String> e= request.getSession().getAttributeNames();
//        while (e.hasMoreElements()) {
//            System.out.println(e.nextElement());
//        }

        System.out.println(request.getSession().getAttribute("vertificationCode").toString());//后写的session会覆盖前面的session

        String checkCode=request.getParameter("vertificationCodeInput");
        String sessionCode=request.getSession().getAttribute("vertificationCode").toString();
        if(!checkCode.equals(sessionCode)) {
            request.setAttribute("info","验证码错误！");
            request.getRequestDispatcher("/index.jsp").forward(request,response);
            return;
        }
        request.getServletContext().removeAttribute("vertificationCode");
        //账号密码验证
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String flag=request.getParameter("flag");//是否记住用户名、密码
        System.out.println(username);
        if("superyoungy".equals(username)&&"8888".equals(password)) {
            if(Boolean.parseBoolean(flag)) {
                Cookie username_cookie=new Cookie("username",username );
                username_cookie.setPath("/");
                Cookie password_cookie=new Cookie("password",password );
                password_cookie.setPath("/");
                response.addCookie(username_cookie);
                response.addCookie(password_cookie);
            }
            response.sendRedirect("/ShoppingCart/showProducts");
        }else {
            request.setAttribute("info","用户名或密码错误！");
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }
    }
}
