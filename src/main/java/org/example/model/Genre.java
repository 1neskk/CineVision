package org.example.model;

public class Genre {
    private String m_Name;

    public Genre(String name) {
        this.m_Name = name;
    }

    public String getName() {
        return m_Name;
    }

    public void setName(String name) {
        this.m_Name = name;
    }
}
