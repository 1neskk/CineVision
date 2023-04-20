package org.example.model;

public class Review {
    private int m_Rating;
    private User m_User;
    private Movie m_Movie;

    public Review(User user, Movie movie, int rating) {
        this.m_Rating = rating;
        this.m_User = user;
        this.m_Movie = movie;
    }

    public int getRating() {
        return m_Rating;
    }

    public void setRating(int rating) {
        this.m_Rating = rating;
    }

    public User getUser() {
        return m_User;
    }

    public void setUser(User user) {
        this.m_User = user;
    }

    public Movie getMovie() {
        return m_Movie;
    }

    public void setMovie(Movie movie) {
        this.m_Movie = movie;
    }
}
