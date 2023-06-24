package com.example.demo.repo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection  {
    static Connection connection;

    public static Connection createConnection(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String user = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:/sms";

            connection = DriverManager.getConnection(url, user, password);

        }
        catch (Exception e){
            e.printStackTrace();
        }

        return connection;
    }
}
