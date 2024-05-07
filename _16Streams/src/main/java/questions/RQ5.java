package questions;

import java.util.*;
import java.util.stream.*;

public class RQ5 {
    public static void main(String[] args) {
        List<String> values = List.of("AA", "BBB", "C", "DD", "EEE");
        Map<Integer, List<String>> map = null;
        // (1) INSERT CODE HERE

        map.forEach((i, s) -> System.out.println(i + " " + s));
    }
}
/*
  Which statement when inserted independently at (1) will result in the output 1 [C]?
  Select the one correct answer.

  a.
  map = values.stream()
            .collect(Collectors.groupingBy(s -> s.length(),
                         Collectors.filtering(s -> !s.contains("C"),
                             Collectors.toList())));
  b.
  map = values.stream()
            .collect(Collectors.groupingBy(s -> s.length(),
                         Collectors.filtering(s -> s.contains("C"),
                             Collectors.toList())));
  c.
  map = values.stream()
            .filter(s -> !s.contains("C"))
            .collect(Collectors.groupingBy(s -> s.length(),
                         Collectors.toList()));
  d.
  map = values.stream()
            .filter(s -> s.contains("C"))
            .collect(Collectors.groupingBy(s -> s.length(),
                         Collectors.toList()));
* */
