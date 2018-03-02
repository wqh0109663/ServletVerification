package it.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wqh on 2018/3/1.
 */
public class RedirectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*response.setStatus(302); 两行代码可以实现重定向
        response.setHeader("location","/index.jsp");*/
        response.sendRedirect("/index.jsp");//这个也可以实现重定向
        //特点 : 浏览器地址会发生变化 向服务器发送了两次请求 尽量不要用 会加重服务器负担
        //使用 登录 购物  地址栏发生变化
    }
}
