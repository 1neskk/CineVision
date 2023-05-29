package org.example.Movies;
import java.util.ArrayList;

public class Movie {

    public Movie(String title, String director, int releaseYear, String genre, ArrayList<Integer> rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.rating = rating;
    }

    public Movie()
    {}

public String getTitle() { return title; }
public String getDirector() { return director; }
public int getReleaseYear() { return releaseYear; }
public String getGenre() { return genre; }
public ArrayList<Integer> getRating() { return rating; }

public void setTitle(String title) { this.title = title; }
public void setDirector(String director) { this.director = director; }
public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }
public void setGenre(String genre) { this.genre = genre; }
public void setRating(ArrayList<Integer> rating) { this.rating = rating; }

private String title;
private String director;
private int releaseYear;
private String genre;
private ArrayList<Integer> rating = new ArrayList<>();
}
