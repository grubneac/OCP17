import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static void main(String[] args) {
        final String jdbcURL = "jdbc:derby:musicDB;create=true;";
        try (Connection connection = DriverManager.getConnection(jdbcURL)) {
            /* use the connection. */
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}