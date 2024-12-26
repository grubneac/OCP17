import java.sql.*;

public class JDBCStatment {
    public static void main(String[] args) {
        final String jdbcURL = "jdbc:derby:musicDB";
        try (Connection connection = DriverManager.getConnection(jdbcURL);
             Statement statement
                     = connection.createStatement()) {      // Obtain a Statement object.
            String sql = "select * from compositions";    // SELECT query: select all rows.
            boolean isSelectStmt = statement.execute(sql);          // (1) Execute the query
            System.out.println("SELECT statement? " + isSelectStmt);// (2) SELECT statement?
           if (isSelectStmt) {
               ResultSet resultSet = statement.getResultSet();
               System.out.printf("%n%10s %20s %15s%n", "ISRC", "TITLE", "DURATION");
               while (resultSet.next()) {
                   System.out.printf("%10s %20s %10d%n",resultSet.getString("ISRC"),
                           resultSet.getString(2),resultSet.getInt(3));
               }
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
