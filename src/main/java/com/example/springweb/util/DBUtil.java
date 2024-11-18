package com.example.springweb.util;
import java.sql.*;

//链接数据库
public class DBUtil {
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/studentManager?characterEncoding=utf8";
    private static final String USER = "root";
    private static final String PASS = "123456";

    static Connection conn = null;
    static PreparedStatement pstmt = null;

    public static Connection getConnection(){
        try{
            Class.forName(DRIVER_NAME);
            conn = DriverManager.getConnection(URL,USER,PASS);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
