package org.example.Movies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MoviesDB {
    private static final String DB_URL = "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=America/Sao_Paulo";
    private static final String HOST = "localhost";
    private static final String PORT = "3306";
    private static final String DATABASE = "cinevision";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "anima123";

    public void registerMovie(Movie movie) {
        try (Connection connection = DriverManager.getConnection(String.format(DB_URL, HOST, PORT, DATABASE), DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO tb_movies (title, year, director, genre, rating) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, movie.GetTitle());
            statement.setInt(2, movie.GetReleaseYear());
            statement.setString(3, movie.GetDirector());
            statement.setString(4, movie.GetGenre());
            statement.setArray(5, (java.sql.Array) movie.GetRating());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

