package it.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wqh on 2018/3/1.
 */
public class DoServletToJSP extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //使用的跳转刷新技术

        //用meta模拟一个头 将数据带到jsp页面 由浏览器解析数据
        String message = "<meta http-equiv='refresh' content='3,url=/index.jsp'>恭喜注册成功，浏览器将在三秒后自动跳转到登录页面，如果没跳，请点击<a href=''>超链接</a>";
        this.getServletContext().setAttribute("message", message);
        this.getServletContext().getRequestDispatcher("/message.jsp").forward(request, response);
    }
}
