package org.example.repo;

import org.example.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    public void addUser(User user) {
        try{
            //Connection connection = // TODO: Get connection from ConnectionPool
            String sql = "INSERT INTO user (name, age, email, admin) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user.getName());
            statement.setInt(2, user.getAge());
            statement.setString(3, user.getEmail());
            statement.setBoolean(4, user.getAdmin());
            statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try{
            //Connection connection = // TODO: Get connection from ConnectionPool
            String sql = "SELECT * FROM user";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String email = resultSet.getString("email");
                boolean isAdmin = resultSet.getBoolean("admin");
                User user = new User(name, age, email, isAdmin);
                users.add(user);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
