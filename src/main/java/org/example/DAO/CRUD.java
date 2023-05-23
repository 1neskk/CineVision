package org.example.DAO;

import org.example.DBConnection;
import org.example.User;
import java.sql.*;

public class CRUD {
    public boolean Login(User user) throws Exception
    {
        String sql = "SELECT name, password FROM tb_users WHERE name = ? AND password = ?";
        try (Connection c = DBConnection.GetConnection();
             PreparedStatement ps = c.prepareStatement(sql))
        {
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            try (ResultSet rs = ps.executeQuery())
            {
                return rs.next();
            }
        }
    }

}
