package questions;

import java.sql.*;

public class RQ3 {
    public static void main(String[] args) {
        final String jdbcUrl = "jdbc:derby:musicDB";
        String findAnswers = "select * from questions where question like ?";
        try (Connection c = DriverManager.getConnection(jdbcUrl);
             PreparedStatement ps = c.prepareStatement(findAnswers)) {
            ps.setString(1, "Where%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    String question = rs.getObject(2, String.class);   // (1)
                    String answer = rs.getObject(3, String.class);     // (2)
                    answer = (answer == null) ? "No answer." : answer; // (3)
                    System.out.println(question + " - " + answer);
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
b. The program will print two lines.
c. The program will throw an exception at (1).
d. The program will throw an exception at (2).
e. The program will throw an exception at (3).
*
* */
