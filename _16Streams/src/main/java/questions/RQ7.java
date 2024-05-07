package questions;

import java.util.stream.*;

public class RQ7 {
    public static void main(String[] args) {
        Stream<String> values = Stream.generate(() -> "A");
        boolean value = values.peek(v -> System.out.print("B"))
                .takeWhile(v -> !v.equals("A"))
                .peek(v -> System.out.print("C"))
                .anyMatch(v -> v.equals("A"));
        System.out.println(value);
    }
}

/*
* What is the result?
Select the one correct answer.

a. Btrue
b. Ctrue
c. BCtrue
d. Bfalse
e. Cfalse
f. BCfalse
* */