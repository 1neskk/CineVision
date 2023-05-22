package org.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/database_name";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try {
            java.sql.Connection conn = establishConnection();
            System.out.println("Connected to the database.");

            

            closeConnection(conn);
        } catch (SQLException e) {
            System.err.println("An error occurred while connecting to the database: " + e.getMessage());
        }
    }

    private static java.sql.Connection establishConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC driver not found.", e);
        }

        return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
    }

    private static void closeConnection(java.sql.Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("An error occurred while closing the database connection: " + e.getMessage());
            }
        }
    }
}
