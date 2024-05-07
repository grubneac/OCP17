package questions;

import java.util.stream.*;

public class RQ10 {
    public static void main(String[] args) {
        IntStream.range(0, 5)
                .filter(i -> i % 2 != 0)
                .forEach(i -> System.out.println(i));
    }
}

/*
* Which of the following statements will produce the same result as the program?
* Select the two correct answers.
*
* a
* IntStream.rangeClosed(0, 5)
         .filter(i -> i % 2 != 0)
         .forEach(i -> System.out.println(i));
*b
* IntStream.range(0, 10)
         .takeWhile(i -> i < 5)
         .filter(i -> i % 2 != 0)
         .forEach(i -> System.out.println(i));
*c
* IntStream.range(0, 10)
         .limit(5)
         .filter(i -> i % 2 != 0)
         .forEach(i -> System.out.println(i));
*d
* IntStream.generate(() -> {int x = 0; return x++;})
         .takeWhile(i -> i < 4)
         .filter(i -> i % 2 != 0)
         .forEach(i -> System.out.println(i));
*e
* var x = 0;
IntStream.generate(() -> return x++)
         .limit(5)
         .filter(i -> i % 2 != 0)
         .forEach(i -> System.out.println(i));
* */