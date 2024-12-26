import java.sql.*;

public class XQTPreparedStatement {
    public static void main(String[] args) {
        final String jdbcURL = "jdbc:derby:musicDB";
        String sql = "select * from compositions where duration > ?";           // (1)
        try (Connection connection = DriverManager.getConnection(jdbcURL);      // (2)
             PreparedStatement pStatement = connection.prepareStatement(sql);) { // (3)
            pStatement.setInt(1, 400);                                            // (4)
            boolean result = pStatement.execute();                                // (5)
            ResultSet resultSet = pStatement.getResultSet();
            System.out.printf("%n%10s %20s %15s%n", "ISRC", "TITLE", "DURATION");
            while (resultSet.next()) {
                System.out.printf("%10s %20s %10d%n",resultSet.getString("ISRC"),
                        resultSet.getString(2),resultSet.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}