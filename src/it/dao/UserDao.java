package it.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by wqh on 2018/2/23.
 */
public class UserDao {

    public void add() throws IOException {
        //读配置文件的方式（更新了会实时更新）
        String path = UserDao.class.getClassLoader().getResource("db.properties").getPath();
        FileInputStream inputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(inputStream);
        String url = properties.getProperty("url");
        System.out.println(url);
    }
}
