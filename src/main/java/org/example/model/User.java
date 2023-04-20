package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String m_Name;
    private String m_Email;
    private int m_Age;
    private boolean m_IsAdmin;
    private List<String> m_PreferredGenres;

    public User(String name, int age, String email, boolean isAdmin) {
        this.m_Name = name;
        this.m_Age = age;
        this.m_Email = email;
        this.m_IsAdmin = isAdmin;
        this.m_PreferredGenres = new ArrayList<>();
    }

    public String getName() {
        return m_Name;
    }

    public void setName(String name) {
        this.m_Name = name;
    }

    public int getAge() {
        return m_Age;
    }

    public void setAge(int age) {
        this.m_Age = age;
    }

    public List<String> getPreferredGenres() {
        return m_PreferredGenres;
    }

    public void setPreferredGenres(List<String> preferredGenres) {
        this.m_PreferredGenres = preferredGenres;
    }

    public String getEmail() {
        return m_Email;
    }

    public void setEmail(String email) {
        this.m_Email = email;
    }

    public boolean getAdmin() {
        return m_IsAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.m_IsAdmin = isAdmin;
    }
}
