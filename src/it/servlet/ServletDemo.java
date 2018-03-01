package it.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

/**
 * Created by wqh on 2018/3/1.
 */
public class ServletDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String realPath = this.getServletContext().getRealPath("//download/bean的生命周期.jpg");
        System.out.println(realPath);//C:\Users\wqh\IdeaProjects\servletTestday01\out\artifacts\web_war_exploded\download\bean的生命周期.jpg
        String substring = realPath.substring(realPath.lastIndexOf("\\") + 1);
        //String path = this.getServletContext().getResource("//download/bean的生命周期.jpg").getPath();
        //  /C:/Users/wqh/IdeaProjects/servletTestday01/out/artifacts/web_war_exploded/download/bean的生命周期.jpg
        response.setHeader("content-disposition","attachment;substring=" + URLEncoder.encode(substring,"UTF-8"));
        //System.out.println(path);
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {

            inputStream = new FileInputStream(realPath);

            outputStream = response.getOutputStream();

            byte[] buf = new byte[1024];
            int ch  ;
            while ((ch=inputStream.read(buf))!=-1)
            {
                outputStream.write(buf,0,ch);

            }

        }finally {
            if (inputStream!=null)
            {
                inputStream.close();
            }
            if (outputStream!=null)
            {
                outputStream.close();
            }

        }
        //response.getOutputStream().write("haha".getBytes());

    }
}
