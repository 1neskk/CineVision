package org.example.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String HOST = "localhost";
    private static final String PORT = "3306";
    private static final String DATABASE = "cinevision";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "anima123";

    public static Connection GetConnection() throws SQLException {
        Connection conn = null;
        String DB_URL = String.format("jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=America/Sao_Paulo", HOST, PORT, DATABASE);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
