package it.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by wqh on 2018/3/2.
 */
public class DownloadContinue {

/*使用Range头
* 实现断点下载
*
* */
    public static void main(String[] args) throws IOException {
        URL url= new URL("http://localhost:8080/test.txt");
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
        urlConnection.setRequestProperty("Range","bytes=1-");
        InputStream inputStream = urlConnection.getInputStream();
        FileOutputStream outputStream = new FileOutputStream("D://test.txt", true);
        int len ;
        byte[] buf = new byte[1024];
        while ((len = inputStream.read(buf))!=-1){
            outputStream.write(buf,0,len);
        }
        inputStream.close();
        outputStream.close();

    }


}
