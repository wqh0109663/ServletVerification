package it.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by wqh on 2018/3/2.
 */
public class ServletContentType extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String realPath = this.getServletContext().getRealPath("/te.jpg");
        FileInputStream inputStream = new FileInputStream(realPath);
        OutputStream outputStream = response.getOutputStream();
        response.setHeader("content-type","image/jpeg");
        int len ;
        byte[] buf = new byte[1024];
        while ((len = inputStream.read(buf))!=-1){
            outputStream.write(buf,0,len);
        }

    }
}
