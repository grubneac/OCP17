import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {
    public static void main(String[] args) {
        final String jdbcURL = "jdbc:derby:musicDB";
        try (Connection connection = DriverManager.getConnection(jdbcURL);     // (1)
             Statement statement = connection.createStatement()) {             // (2)
            String sql = "update compositions set duration = duration * 2";      // (3)
            int count = statement.executeUpdate(sql);                            // (4)
            System.out.println("Rows modified: " + count);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
