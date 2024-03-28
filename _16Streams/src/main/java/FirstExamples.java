import java.time.Year;
import java.util.List;

public class FirstExamples {
    public static void main(String[] args) {
        // Loop-based solution:
        List<String> values = List.of("2001", "1999", "2021");
        for (String s : values) {
            Year y = Year.parse(s);
            if (y.isAfter(Year.of(2000))) {
                System.out.print(s + " ");                      // 2001 2021
            }
        }
        System.out.println("\n-------------------------------------");
// Stream-based solution:
        List<String> values2 = List.of("2001", "1999", "2021");
        values2.stream()                                    // (1)
                .map(s -> Year.parse(s))                     // (2)
                .filter(y -> y.isAfter(Year.of(2000)))       // (3)
                .forEach(y -> System.out.print(y + " "));    // (4) 2001 2021
    }
}
