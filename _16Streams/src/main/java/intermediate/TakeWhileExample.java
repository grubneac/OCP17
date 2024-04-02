package intermediate;

import java.util.Set;
import java.util.stream.Stream;

public class TakeWhileExample {
    public static void main(String[] args) {
        // Ordered stream:
        System.out.println("---------------takeWhile ordered--------------------");
        Stream.of(1, 3, 5, 7, 8, 9, 11)                 // (1)

                .takeWhile(n -> n % 2 != 0)               // Takes longest prefix: 1 3 5 7
                .forEach(n -> System.out.print(n + " ")); // 1 3 5 7

        System.out.println("\n---------------dropWhile ordered--------------------");

        Stream.of(1, 3, 5, 7, 8, 9, 11)                 // (2)
                .dropWhile(n -> n % 2 != 0)               // Drops longest prefix:  1 3 5 7
                .forEach(n -> System.out.print(n + " ")); // 8 9 11

        // Unordered stream:
        System.out.println("\n---------------takeWhile Unordered--------------------");
        Set<Integer> iSeq = Set.of(1, 9, 4, 3, 7);      // (3)
        iSeq.stream()
                .takeWhile(n -> n % 2 != 0)                 // Takes any subset of elements.
                .forEach(n -> System.out.print(n + " "));   // Nondeterministic: 1 9 7

        System.out.println("\n---------------dropWhile Unordered--------------------");
        iSeq.stream()
                .dropWhile(n -> n % 2 != 0)                 // Drops any subset of elements.
                .forEach(n -> System.out.print(n + " "));   // Nondeterministic: 4 3

        // All match in ordered stream:                    (4)
        System.out.println("\n---------------takeWhile All match in ordered stream--------------------");
        Stream.of(1, 3, 5, 7, 9, 11)
                .takeWhile(n -> n % 2 != 0)               // Takes all elements.
                .forEach(n -> System.out.print(n + " ")); // Ordered: 1 3 5 7 9 11

        System.out.println("\n---------------dropWhile All match in ordered stream--------------------");
        Stream.of(1, 3, 5, 7, 9, 11)
                .dropWhile(n -> n % 2 != 0)               // Drops all elements.
                .forEach(n -> System.out.print(n + " ")); // Empty stream

// All match in unordered stream:                  (5)
        System.out.println("\n---------------takeWhile All match in unordered stream--------------------");
        Set<Integer> iSeq2 = Set.of(1, 9, 3, 7, 11, 5);
        iSeq2.stream()
                .takeWhile(n -> n % 2 != 0)                // Takes all elements.
                .forEach(n -> System.out.print(n + " "));  // Unordered: 9 11 1 3 5 7

        System.out.println("\n---------------dropWhile All match in unordered stream--------------------");
        iSeq2.stream()
                .dropWhile(n -> n % 2 != 0)                // Drops all elements.
                .forEach(n -> System.out.print(n + " "));  // Empty stream
    }
}
