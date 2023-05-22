package org.example;
import java.sql.Connection;

import java.sql.*;

public class User {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/database_name";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    private Connection conn;

    public User() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Connected to the database.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}