package it.servlet;

import it.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wqh on 2018/2/23.
 */
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* InputStream resourceAsStream =
                this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        String url = properties.getProperty("url");
        System.out.println(url);*/
        UserDao userDao = new UserDao();
        userDao.add();
        response.getOutputStream().write("第一个sevlet".getBytes());
    }
}
