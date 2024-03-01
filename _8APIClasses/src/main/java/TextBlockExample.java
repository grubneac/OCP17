public class TextBlockExample {
    public static void main(String[] args) {
        String sql1 = """
                SELECT *
                FROM Programmers
                WHERE Language = 'Java';
                """;
        System.out.println(sql1);
        System.out.println("-------------------------");

        String sql2 = """
                SELECT *
                FROM Programmers\nWHERE Language = 'Java';""";
        System.out.println(sql2);
        System.out.println("-------------------------");

        String sql3 = """ 
                SELECT * \
                FROM Programmers \
                WHERE Language = 'Java'; \
                """;
        System.out.println(sql3);
        System.out.println("-------------------------");

        String sql6 = """
                SELECT *
                FROM Programmers   \s     """;                   // (1) No line termination.
        // sql6 ==> "SELECT *\nFROM Programmers    "

        String sql7 = "WHERE Language = 'Java';\n";
        System.out.print(sql6 + sql7);
        System.out.println("-------------------------");

        String fact = """
                The sequence \"""
                has "special" meaning in a text block.
                """;
// fact ==> "The sequence \"\"\"\nhas \"special\" meaning in a text block.\n"
        System.out.print(fact);
        System.out.println("-------------------------");

        String query = """
                SELECT *
                FROM %s
                WHERE %s = '%s';
                """.formatted("Customers", "Country", "Norway");
        System.out.print(query);

        String ttt = "   Fjkdhf\n       Sdhfhfhhg     \n   Finish";
        System.out.println(ttt.stripIndent());
    }
}
