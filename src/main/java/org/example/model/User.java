package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String m_Name;
    private int m_Age;
    private List<String> m_PreferedGenres;

    public User(String name, int age) {
        this.m_Name = name;
        this.m_Age = age;
        this.m_PreferedGenres = new ArrayList<>();
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

    public List<String> getPreferedGenres() {
        return m_PreferedGenres;
    }

    public void setPreferedGenres(List<String> preferedGenres) {
        this.m_PreferedGenres = preferedGenres;
    }
}
