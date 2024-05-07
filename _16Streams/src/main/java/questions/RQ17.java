package questions;

import java.util.stream.*;

public class RQ17 {
    public static void main(String[] args) {
        Stream<String> values = Stream.of("is", "this", "", null, "ok", "?");
        // (1) INSERT CODE HERE
        int c = values.mapToInt(v -> 1).sum();
        System.out.println(c);
    }
}

/*
* Which statement inserted independently at (1) produces the output 6?
Select the one correct answer.

a. long c = values.count();
b. long c = values.collect(Collectors.counting());
c. int c = values.mapToInt(v -> 1).reduce(0, (x, y) -> x + 1);
d. long c = values.collect(Collectors.reducing(0L, v -> 1L, Long::sum));
e. int c = values.mapToInt(v -> 1).sum();
f. Insert any of the above.
* */