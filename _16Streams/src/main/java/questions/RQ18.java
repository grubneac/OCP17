package questions;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RQ18 {
    public static void main(String[] args) {
//        Which code produces identical results? Select the two correct answers.
//        a
        Set<String> set1 = Stream.of("XX", "XXXX", "", null, "XX", "X")
                .filter(v -> v != null)
                .collect(Collectors.toSet());
        set1.stream()
                .mapToInt(v -> v.length())
                .sorted()
                .forEach(v -> System.out.print(v));
        System.out.println("\n---------------------------------------");
//        b
        Set<Integer> set2 = Stream.of("XX", "XXXX", "", null, "XX", "X")
                .map(v -> (v == null) ? 0 : v.length())
                .filter(v -> v != 0)
                .collect(Collectors.toSet());
        set2.stream()
                .sorted()
                .forEach(v -> System.out.print(v));
        System.out.println("\n---------------------------------------");
//        c
        List<Integer> list1 = Stream.of("XX", "XXXX", "", null, "XX", "X")
                .map(v -> (v == null) ? 0 : v.length())
                .filter(v -> v != 0)
                .toList();
        list1.stream()
                .sorted()
                .forEach(v -> System.out.print(v));
        System.out.println("\n---------------------------------------");
//        d
        List<Integer> list2 = Stream.of("XX", "XXXX", "", null, "XX", "X")
                .map(v -> (v == null) ? 0 : v.length())
                .filter(v -> v != 0)
                .distinct()
                .toList();
        list2.stream()
                .sorted()
                .forEach(v -> System.out.print(v));
        System.out.println("\n---------------------------------------");

    }
}
