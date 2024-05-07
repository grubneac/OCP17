package questions;

import java.util.stream.*;

import java.util.stream.*;

public class RQ4 {
    public static void main(String[] args) {
        IntStream values = IntStream.range(0, 5);
        // (1) INSERT CODE HERE
//        System.out.println(value);
    }
}

/*
* Which of the following statements, when inserted independently at (1), will result in the value 4 being printed?

Select the two correct answers.
a. int value = values.reduce(0, (x, y) -> x + 1);
b. int value = values.reduce((x, y) -> x + 1).orElse(0);
c. int value = values.reduce(0, (x, y) -> y + 1);
d. int value = values.reduce(0, (x, y) -> y);
e. int value = values.reduce(1, (x, y) -> y + 1);
f. long value = values.count();
*
* */