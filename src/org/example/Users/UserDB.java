package org.example.Users;

import org.example.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDB {
    public boolean UserLogin(User user) throws Exception
    {
        String query = "SELECT name, password FROM tb_users WHERE name = ? AND password = ?";
        try (Connection c = DBConnection.GetConnection();
             PreparedStatement ps = c.prepareStatement(query))
        {
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            try (ResultSet rs = ps.executeQuery())
            {
                return rs.next();
            }
        }
    }

    public void UserRegister(User user) throws Exception
    {
        String query = "INSERT INTO tb_users (name, password, age, gender) VALUES (?, ?, ?, ?)";
        try (Connection c = DBConnection.GetConnection();
             PreparedStatement ps = c.prepareStatement(query))
        {
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getAge());
            ps.setString(4, user.getGender());
            ps.execute();
        }
    }

    public void UserDelete(User user) throws Exception {
        String query = "DELETE FROM tb_users WHERE id = ?";
        try (Connection c = DBConnection.GetConnection();
             PreparedStatement ps = c.prepareStatement(query))
        {
            ps.setInt(1, user.getId());
            ps.execute();
        }
    }

    public void UserSearch(User user) throws Exception
    {
        String query = "SELECT * FROM tb_users WHERE id = ?";
        try (Connection c = DBConnection.GetConnection();
             PreparedStatement ps = c.prepareStatement(query))
        {
            ps.setInt(1, user.getId());
            try(ResultSet rs = ps.executeQuery())
            {
                if(rs.next())
                {
                    user.setUsername(rs.getString("name"));
                    user.setPassword(rs.getString("password"));
                    user.setAge(rs.getInt("age"));
                    user.setGender(rs.getString("gender"));
                }
            }
        }
    }

    public void UserUpdate(User user) throws Exception
    {
        String query = "UPDATE tb_users SET password = ? WHERE id = ?";

        try (Connection c = DBConnection.GetConnection();
             PreparedStatement ps = c.prepareStatement(query))
        {
            ps.setString(1, user.getPassword());
            ps.setInt(2, user.getId());
            ps.execute();
        }
    }

    public boolean isAdmin(User user) {
        return user.getUsername().equals("admin") && user.getPassword().equals("admin");
    }
}
