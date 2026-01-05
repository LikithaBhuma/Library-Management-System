package com.library.dao;

import com.library.util.DBConnection;
import java.sql.*;

public class IssueDAO {

    public void issueBook(int bookId, int memberId) {
        String checkQty = "SELECT quantity FROM books WHERE book_id=?";
        String issueSql = "INSERT INTO issued_books(book_id, member_id, issue_date) VALUES(?,?,CURDATE())";
        String updateQty = "UPDATE books SET quantity = quantity - 1 WHERE book_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps1 = con.prepareStatement(checkQty)) {

            ps1.setInt(1, bookId);
            ResultSet rs = ps1.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                PreparedStatement ps2 = con.prepareStatement(issueSql);
                ps2.setInt(1, bookId);
                ps2.setInt(2, memberId);
                ps2.executeUpdate();

                PreparedStatement ps3 = con.prepareStatement(updateQty);
                ps3.setInt(1, bookId);
                ps3.executeUpdate();

                System.out.println("Book issued successfully.");
            } else {
                System.out.println("Book not available.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
