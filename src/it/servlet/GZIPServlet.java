package it.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 * Created by wqh on 2018/3/1.
 */
public class GZIPServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String data = "adsgsdgdsgdshssssssssssssssssssssssssssssssssssssssssssgggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg";
        System.out.println("压缩前的" + data.getBytes().length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gzipOutputStream.write(data.getBytes());
        gzipOutputStream.close();
        byte[] bytes = byteArrayOutputStream.toByteArray();
        System.out.println("压缩后的大小" + bytes.length);
        //告诉浏览器是压缩格式的数据
        //以压缩格式发出能省很多流量
        response.setHeader("Content-Encoding", "gzip");
        response.setHeader("Content-Length", bytes.length + "");
        response.getOutputStream().write(bytes);
        //压缩前的289
        //压缩后的大小37
    }
}
