package com.pk.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

final public class DButil {

    private static Connection connection;

    private final  static  String URL = "jdbc:mysql://localhost:3306/zeal";
    private final  static  String USER_NAME = "root";
    private final  static  String PASSWORD ="";

    public  static Connection getConnection() throws SQLException {
        if(connection == null)
        {

                connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD);

            return connection;
        }
        return connection;
    }
}
