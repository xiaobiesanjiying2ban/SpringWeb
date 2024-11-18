package com.example.springweb.util;

import java.sql.*;

public class DBUtil {
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/dianyingxitong?characterEncoding=UTF-8&allowPublicKeyRetrieval=true";
//    链接问题可以修改以下两条属性
    private static final String USERNAME = "dahuang";
    private static final String PWD = "096303";

    static Connection conn = null;
    static PreparedStatement pstmt = null;

    /**
     * 获取数据库连接对象的方法。
     * 该方法尝试使用指定的数据库驱动名称、URL、用户名和密码来建立数据库连接。
     *
     * @return 返回数据库连接对象；如果连接失败，则返回null。
     * @throws ClassNotFoundException 如果指定的数据库驱动类未找到，则会抛出此异常
     * @throws SQLException 如果数据库连接过程中发生SQL错误，则会抛出此异常
     * @throws Exception 可能会抛出其他未预见的异常
     * 注意：此方法依赖于类级别的静态变量DRIVER_NAME、URL、USERNAME和PWD，这些变量应在调用此方法之前被正确初始化。
     */
    // 通用的，获取数据库连接对象的方法
    public static Connection getConnection() {
        try {
            // 加载数据库驱动
            Class.forName(DRIVER_NAME);
            // 获取数据库连接
            conn = DriverManager.getConnection(URL, USERNAME, PWD);
        } catch (ClassNotFoundException e) {
            // 捕获类未找到异常
            e.printStackTrace();
        } catch (SQLException e) {
            // 捕获SQL异常
            e.printStackTrace();
        } catch (Exception e) {
            // 捕获其他异常
            e.printStackTrace();
        }
        // 返回数据库连接对象
        return conn;
    }


    /**
     * 通用的，获取 PreparedStatement 对象的方法。
     *
     * @param sql SQL 语句，用于创建 PreparedStatement 对象。
     * @param os  一个包含 SQL 语句参数的 Object 数组。如果为 null，则不会为 PreparedStatement 设置参数。
     * @return 返回一个 PreparedStatement 对象，该对象已根据提供的 SQL 语句和参数设置完毕。
     * @throws SQLException 如果在执行 SQL 语句或设置参数时发生 SQL 错误。
     * @throws Exception   如果发生其他异常，例如无法获取数据库连接。
     * 注意：此方法依赖于 getConnection() 方法来获取数据库连接，并且使用 pstmt 静态变量来存储 PreparedStatement 对象。
     */
    // 通用的，获取 PreparedStatement 对象的方法
    public static PreparedStatement createPreparedStatement(String sql, Object[] os) {
        try {
            // 获取数据库连接并创建 PreparedStatement 对象
            pstmt = getConnection().prepareStatement(sql);

            // 如果 os 参数不为空
            if (os != null) {
                // 遍历 os 数组
                for (int i = 0; i < os.length; i++) {
                    // 为 PreparedStatement 设置参数值
                    pstmt.setObject(i + 1, os[i]);
                }
            }
        } catch (SQLException e) {
            // 捕获 SQL 异常并打印堆栈跟踪
            e.printStackTrace();
        } catch (Exception e) {
            // 捕获其他异常并打印堆栈跟踪
            e.printStackTrace();
        }
        // 返回 PreparedStatement 对象
        return pstmt;
    }


    /**
     * 通用的，关闭访问数据库相关对象的方法。
     * 该方法用于安全地关闭 ResultSet、Statement 和 Connection 对象，
     * 以释放数据库资源并避免内存泄漏。
     * 注意：PreparedStatement 继承自 Statement，因此该方法同样适用于 PreparedStatement 对象。
     *
     * @param rs ResultSet 对象，可能为 null。
     * @param stmt Statement 对象，可能为 null。
     * @param conn Connection 对象，可能为 null。
     */
    // 通用的，关闭访问数据库相关对象的方法（注意 PreparedStatement 继承自 Statement）
    public static void closeAll(ResultSet rs, Statement stmt, Connection conn) {
        try {
            // 如果 ResultSet 对象不为空，则关闭它
            if (rs != null) {
                rs.close();
            }
            // 如果 Statement 对象不为空，则关闭它
            if (stmt != null) {
                stmt.close();
            }
            // 如果 Connection 对象不为空，则关闭它
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            // 捕获并处理 SQL 异常，打印堆栈跟踪
            e.printStackTrace();
        }
    }


    /**
     * 通用的增加、删除、修改数据库记录的方法。
     *
     * @param sql  要执行的SQL语句，通常是INSERT、UPDATE或DELETE语句。
     * @param os   一个包含SQL语句参数的Object数组。参数将按照顺序被设置到PreparedStatement中。
     * @return     如果操作成功，则返回true；如果操作失败（例如，由于SQL错误或数据库连接问题），则返回false。
     * @throws     Exception 如果在执行过程中发生任何异常，该方法将捕获该异常并打印堆栈跟踪，
     */
    // 通用的，增加、删除、修改方法
    public static boolean execute(String sql, Object[] os) {
        // 初始化操作成功标志为 true
        boolean flag = true;

        try {
            // 调用 createPreparedStatement 方法创建 PreparedStatement 对象
            // 注意：这里 createPreparedStatement 是一个外部定义的方法，用于创建 PreparedStatement
            pstmt = createPreparedStatement(sql, os);
            // 执行 SQL 更新操作（INSERT、UPDATE、DELETE）
            pstmt.executeUpdate();
        } catch (Exception e) {
            // 捕获所有异常并打印堆栈跟踪
            e.printStackTrace();
            // 设置操作成功标志为 false
            flag = false;
        } finally {
            // 无论是否发生异常，都执行关闭操作
            // 注意：这里传入 null 作为 ResultSet 参数，因为 executeUpdate 方法不返回 ResultSet
            // 同时传入 pstmt 和 conn 参数以关闭它们
            closeAll(null, pstmt, conn);
        }
        // 返回操作成功标志
        return flag;
    }


    /**
     * 通用的查询方法，用于执行 SQL 查询并返回查询结果集 ResultSet 对象。
     *
     * @param sql  要执行的 SQL 查询语句。
     * @param os   一个包含 SQL 语句参数的 Object 数组。参数将按顺序设置到 PreparedStatement 中。
     * @return     返回查询结果集 ResultSet 对象，如果查询失败或发生异常，则返回 null。
     * @throws     SQLException 如果在执行 SQL 查询时发生 SQL 异常。
     */
    // 通用的查询方法，返回查询的结果集 ResultSet 对象
    public static ResultSet query(String sql, Object[] os) {
        // 初始化 ResultSet 对象为 null
        ResultSet rs = null;
        try {
            // 调用 createPreparedStatement 方法创建 PreparedStatement 对象
            pstmt = createPreparedStatement(sql, os);
            // 执行 SQL 查询操作，并将结果集赋值给 rs
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            // 捕获 SQL 异常并打印异常信息
            System.out.println("SQLException：" + e);
        } catch (Exception e) {
            // 捕获其他异常并打印异常信息
            System.out.println("查询发生异常：" + e);
        }
        // 返回 ResultSet 对象
        return rs;
    }

}