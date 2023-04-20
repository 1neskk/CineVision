package org.example.model;

public class Movie {
    private String m_Name;
    private int m_Year;
    private Genre m_Genre;
    private int m_Rating;

    public Movie(String name, int year, Genre genre, int rating) {
        this.m_Name = name;
        this.m_Year = year;
        this.m_Genre = genre;
        this.m_Rating = rating;
    }

    public String getName() {
        return m_Name;
    }

    public void setName(String name) {
        this.m_Name = name;
    }

    public int getYear() {
        return m_Year;
    }

    public void setYear(int year) {
        this.m_Year = year;
    }

    public Genre getGenre() {
        return m_Genre;
    }

    public void setGenre(Genre genre) {
        this.m_Genre = genre;
    }

    public int getRating() {
        return m_Rating;
    }

    public void setRating(int rating) {
        this.m_Rating = rating;
    }
}
