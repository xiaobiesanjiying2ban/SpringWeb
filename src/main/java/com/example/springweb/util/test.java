package com.example.springweb.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

//测试用

public class test {
    public static void performDatabaseOperation() {
        DBUtil dbUtil = new DBUtil();

        Connection connection = dbUtil.getConnection();

        String sql = "SELECT * FROM admin_table";
        ResultSet rs = null;
        try {
            rs = DBUtil.query(sql, null);

            while (rs != null && rs.next()) {
                int id = rs.getInt("id");
                String user = rs.getString("user");
                String password = rs.getString("password");
                System.out.println("编号: " + id + ", 用户: " + user + "，密码：: " + password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭所有数据库资源
            DBUtil.closeAll(rs, null, connection);
        }
    }

    public static void main(String[] args) {
        performDatabaseOperation();
    }
}