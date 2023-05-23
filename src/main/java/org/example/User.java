package org.example;

import java.util.ArrayList;

public class User {
    private int id;
    private String username;
    private String password;
    private int age;
    private String gender;
    private ArrayList<String> favMovieGenre = new ArrayList<>();


    public User(String username, String password, int age, String gender) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int id) { this.id = id; }

    public User()
    {}


    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getUsername() { return username; }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }
}
