package questions;

import java.sql.*;

public class RQ8 {
    public static void main(String[] args) {
        String findQuestion
                = "select question, answer from questions where answer is null";
        final String jdbcUrl = "jdbc:derby:musicDB";
        try (Connection c = DriverManager.getConnection(jdbcUrl);
             PreparedStatement ps = c.prepareStatement(findQuestion,
                     ResultSet.TYPE_FORWARD_ONLY,
                     ResultSet.CONCUR_UPDATABLE,
                     ResultSet.CLOSE_CURSORS_AT_COMMIT)) {
            c.setAutoCommit(false);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    rs.updateString("answer", "no answer");
                    rs.updateRow();
                }
            }
            c.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
/*
* Which of the following statements are true about this code (assuming the database supports all designated ResultSet features)?
Select the two correct answers.

a. It selects all rows from the questions table that have no value set for the answer column.
b. It updates all rows in the questions table that have no value set for the answer column.
c. It sets the "no answer" value for the answer column in all rows in the questions table.
d. It will roll back changes if an exception is thrown inside the while loop.
* */