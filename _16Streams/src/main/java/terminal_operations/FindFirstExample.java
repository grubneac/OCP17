package terminal_operations;

import util.CD;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.out;

public class FindFirstExample {
    public static void main(String[] args) {
        Optional<CD> firstCD1 = CD.cdList.stream().findFirst();         // (1)
        out.println(firstCD1.map(CD::title).orElse("No first CD."));    // (2) Java Jive

        boolean anyJazzCD = CD.cdList.stream().anyMatch(CD::isJazz);              // (5)
        out.println("Any Jazz CD: " + anyJazzCD);   // Any Jazz CD: true

        Optional<CD> optJazzCD = CD.cdList.stream().filter(CD::isJazz).findAny(); // (6)
        optJazzCD.ifPresent(out::println);          // <Jaav, "Java Jam", 6, 2017, JAZZ>

        IntStream numStream = IntStream.of(50, 55, 65, 70, 75, 77);
        OptionalInt intOpt = numStream.filter(n -> n % 7 == 0).findAny();
        intOpt.ifPresent(System.out::println);      // 70

//        Stream.generate(() -> 1).filter(n -> n == 0).findAny();       // Never terminates.

        Optional<CD> minCD = CD.cdList.stream().min(Comparator.naturalOrder());
        minCD.ifPresent(out::println);      // <Funkies, "Lambda Dancing", 10, 2018, POP>
        out.println(minCD.map(CD::artist).orElse("No min CD."));    // Funkies

        Optional<CD> maxCD = CD.cdList.stream().max(Comparator.naturalOrder());
        maxCD.ifPresent(out::println);      // <Jaav, "Java Jive", 8, 2017, POP>
        out.println(maxCD.map(CD::artist).orElse("No max CD."));    // Jaav
    }
}
