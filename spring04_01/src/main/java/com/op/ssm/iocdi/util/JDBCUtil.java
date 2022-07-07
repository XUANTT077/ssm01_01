package com.op.ssm.iocdi.util;

import java.sql.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.iocdi.util.JDBCUtil
 * @Author : cjgong
 * @Time : 2022/6/5 11:31
 * @desc :
 */

public class JDBCUtil {
    // 加载驱动
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    // 获取数据库链接对象
    public  static Connection getConnection(){
        Connection connection=null;
        try {
            connection = DriverManager.getConnection(ConstantClass.URL, ConstantClass.USER_NAME, ConstantClass.USER_PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return connection;
    }


    // 关闭资源
    public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
        try {
            if(connection!=null){
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                if(preparedStatement!=null){
                    preparedStatement.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally{
                try {
                    if(resultSet!=null){
                        resultSet.close();
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }
}
