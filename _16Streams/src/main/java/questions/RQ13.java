package questions;

import java.util.stream.*;

public class RQ13 {
    public static void main(String[] args) {
        Stream<String> strings = Stream.of("i", "am", "ok").parallel();
        IntStream chars = strings.flatMapToInt(line -> line.chars()).sorted();
        chars.forEach(c -> System.out.print((char)c));
    }
}

/*
* What is the result?
Select the one correct answer.

a. iamok
b. aikmo
c. amiok
d. The result from running the program is unpredictable.
e. The program will throw an exception at runtime.
* */