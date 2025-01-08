package questions;
import java.sql.*;
public class RQ10 {
    public static void main(String[] args) {
        final String jdbcUrl = "jdbc:derby:musicDB";
        try (Connection c = DriverManager.getConnection(jdbcUrl);
             PreparedStatement ps = c.prepareStatement(
                     "update questions set answer = ? where question = ?")) {
            ps.setString(2,"What?");          // (1)
            ps.setString(1,"42");             // (2)
            ps.execute();                     // (3)
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
/*
* Which of the following statements is true about this program?
Select the one correct answer.

a. It updates rows in the questions table, setting the answer column value to "42".
b. It throws an exception at (1).
c. It throws an exception at (2).
d. It throws an exception at (3).
* */
