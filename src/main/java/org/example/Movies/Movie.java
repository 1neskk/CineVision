package org.example.Movies;
import java.util.ArrayList;

public class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private String genre;
    private ArrayList<Integer> rating = new ArrayList<>();


    public Movie(String title, String director, int releaseYear, String genre, ArrayList<Integer> rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.rating = rating;
    }


public String GetTitle() { return title; }
public String GetDirector() { return director; }
public int GetReleaseYear() { return releaseYear; }
public String GetGenre() { return genre; }
public ArrayList<Integer> GetRating() { return rating; }

public void SetTitle(String title) { this.title = title; }
public void SetDirector(String director) { this.director = director; }
public void SetReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }
public void SetGenre(String genre) { this.genre = genre; }
public void SetRating(ArrayList<Integer> rating) { this.rating = rating; }
}
