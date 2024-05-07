package questions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RQ12 {
    public static void main(String[] args) {
        /*
        * Which statement produces a different result from the other statements?
            Select the one correct answer.
        * */
        //a
        Stream.of("A", "B", "C", "D", "E")
                .filter(s -> s.compareTo("B") < 0)
                .collect(Collectors.groupingBy(s -> "AEIOU".contains(s)))
                .forEach((x, y) -> System.out.println(x + " " + y));
        System.out.println("------------------------------------");
        //b
        Stream.of("A", "B", "C", "D", "E")
                .filter(s -> s.compareTo("B") < 0)
                .collect(Collectors.partitioningBy(s -> "AEIOU".contains(s)))
                .forEach((x, y) -> System.out.println(x + " " + y));
        System.out.println("------------------------------------");
        //c
        Stream.of("A", "B", "C", "D", "E")
                .collect(Collectors.groupingBy(s -> "AEIOU".contains(s),
                        Collectors.filtering(s -> s.compareTo("B") < 0,
                                Collectors.toList())))
                .forEach((x, y) -> System.out.println(x + " " + y));
        System.out.println("------------------------------------");
        //d
        Stream.of("A", "B", "C", "D", "E")
                .collect(Collectors.partitioningBy(s -> "AEIOU".contains(s),
                        Collectors.filtering(s -> s.compareTo("B") < 0,
                                Collectors.toList())))
                .forEach((x, y) -> System.out.println(x + " " + y));
    }
}
