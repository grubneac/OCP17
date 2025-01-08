package questions;

import java.sql.*;

public class RQ4 {
    public static void main(String[] args) {
        final String jdbcUrl = "jdbc:derby:musicDB";
        String findQuestion = "select * from questions where id = ?";
        int id = 109;
        try (Connection c = DriverManager.getConnection(jdbcUrl);
             PreparedStatement ps = c.prepareStatement(findQuestion)) {
            ps.setInt(1, id);                                  // (1)
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {                                 // (2)
                    String question = rs.getObject(2, String.class);
                    System.out.println(question);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
/*
* Select the one correct answer.

a. The program will print one line.
b. The program will print nothing.
c. The program will throw an exception at (1).
d. The program will throw an exception at (2).
* */