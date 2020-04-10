package com.yc.test.test1;

import com.yc.Spring.beans.Bean1;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/testBean1")
public class TestWebBean1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        WebApplicationContext context= WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
        Bean1 bean1=(Bean1)context.getBean("bean1");
        System.out.println(bean1.getId());
    }
}
