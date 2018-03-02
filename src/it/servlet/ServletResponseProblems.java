package it.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wqh on 2018/3/1.
 */
public class ServletResponseProblems extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         /* response.getWriter(); 文本输出 这两个流不用自己关闭 response摧毁的时候系统会自己关闭
            这两个不同同时调用 互斥java.lang.IllegalStateException: getWriter() has already been called for this response
            response.getOutputStream() 二进制数据  注意在转发里面别这样搞（一个servlet转发给另一个servlet） 同一次请求
            ;*/
        response.getWriter();
        response.getOutputStream();
    }
}
