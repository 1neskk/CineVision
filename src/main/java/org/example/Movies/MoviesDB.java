package org.example.Movies;

import org.example.DBConnection;

import java.sql.*;

public class MoviesDB {

    public void registerMovie(Movie movie) {
        String sql = "INSERT INTO tb_movies (title, release_year, director, genre, rating) VALUES (?, ?, ?, ?, ?)";
        try (Connection c = DBConnection.GetConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, movie.getTitle());
            ps.setInt(2, movie.getReleaseYear());
            ps.setString(3, movie.getDirector());
            ps.setString(4, movie.getGenre());
            ps.setArray(5,  (java.sql.Array)movie.getRating());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

