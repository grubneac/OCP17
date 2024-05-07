package questions;

import java.util.stream.*;

public class RQ2 {
    public static void main(String[] args) {
        IntStream values = IntStream.range(0, 5);
        // (1) INSERT CODE HERE

//        System.out.println(sum);
    }
}
/*
Which of the following statements when inserted independently at (1) will result in a compile-time error?

* Select the two correct answers.
a. int sum = values.reduce(0, (x, y) -> x + y);
b. int sum = values.parallel().reduce(0, (x, y) -> x + y);
c. int sum = values.reduce((x, y) -> x + y).orElse(0);
d. int sum = values.reduce(0, (x, y) -> x + y).orElse(0);
e. int sum = values.parallel().reduce((x, y) -> x + sum).orElse(0);
f. int sum = values.sum();
* */