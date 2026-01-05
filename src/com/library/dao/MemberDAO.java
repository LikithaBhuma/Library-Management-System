package com.library.dao;

import com.library.util.DBConnection;
import java.sql.*;

public class MemberDAO {

    public void addMember(String name, String email) {
        String sql = "INSERT INTO members(name, email) VALUES(?,?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setString(2, email);
            ps.executeUpdate();
            System.out.println("Member registered successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
