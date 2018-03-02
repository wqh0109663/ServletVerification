package it.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wqh on 2018/3/1.
 */
public class ServletCache extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setDateHeader("expries",System.currentTimeMillis() + 1000 * 3600);//设置浏览器缓存一个小时  注意要加上当前的系统时间
        String data = "aaaaaa";
        response.getWriter().write(data);
    }
}
