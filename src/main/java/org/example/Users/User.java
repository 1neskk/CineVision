package org.example.Users;

public class User {
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

    public User(int id, String password)
    {
        this.id = id;
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

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String[] getFavMovieGenre() {
        return favMovieGenre;
    }

    private int id;
    private String username;
    private String password;
    private int age;
    private String gender;
    private boolean isAdmin = false;
    private final String[] favMovieGenre = {"Romance", "Comédia", "Terror", "Suspense", "Ação" };
}
