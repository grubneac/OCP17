package questions;

import java.sql.*;

public class RQ5 {
    public static void main(String[] args) {
        final String jdbcUrl = "jdbc:derby:musicDB";
        String findQuestion = "select question from questions where id = ?";
        String provideAnswer = "update questions set answer = ? where id = ?";
        int id = 102;
        try (Connection c = DriverManager.getConnection(jdbcUrl);
             PreparedStatement ps1 = c.prepareStatement(findQuestion);
             PreparedStatement ps2 = c.prepareStatement(provideAnswer)) {
            c.setAutoCommit(false);
            ps2.setString(1, "Look and you will find!");
            ps2.setInt(2, id);
            ps2.executeUpdate();
            ps1.setInt(2, id);
            try (ResultSet rs = ps1.executeQuery()) {
                while (rs.next()) {
                    String question = rs.getString(1);
                    String answer = rs.getString(2);
                    System.out.println(question + " - " + answer);
                }
            }
            c.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
/*
* Select the one correct answer.

a. The program updates one row, executes the query, and commits the transaction.
b. The program updates one row, throws a SQLException, and commits the transaction.
c. The program updates one row, throws a SQLException, and rolls back the transaction.
d. The program throws a SQLException, executes the query, and commits the transaction.
e. The program throws a SQLException, executes the query, and rolls back the transaction.
* */