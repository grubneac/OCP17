package questions;

import java.util.stream.*;

public class RQ9 {
    public static void main(String[] args) {
        IntStream.range('a', 'e')
                .mapToObj(i -> String.valueOf((char) i).toUpperCase())
                .filter(s -> "AEIOU".contains(s))
                .forEach(s -> System.out.print(s));
    }
}

/*
* What is the result?
Select the one correct answer.

a. A
b. AE
c. BCD
d. The program will fail to compile.
* */