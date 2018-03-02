package it.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

/**
 * Created by wqh on 2018/3/1.
 */
public class RefreshServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //refreshTime(response);
        //下面两行代码解决乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");//通知浏览器以u8解析
        response.setHeader("refresh", "3;url='/index.jsp'");//三秒自动刷新
        response.getWriter().write("恭喜注册成功，浏览器将在三秒后自动跳转到登录页面，如果没跳，请点击<a href=''>超链接</a>");
    }

    private void refreshTime(HttpServletResponse response) throws IOException {

        int i = new Random().nextInt(1000);
        String data = "abcdef" + i;
        /* response.setContentType();*/
        response.setHeader("refresh", "3");//三秒自动刷新
        response.getWriter().write(data);
    }
}
