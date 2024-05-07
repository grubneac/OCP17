package questions;

import java.util.*;

public class RQ1 {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("X", "XXX", "XX", "XXXX");
        int value = values.stream()
                .mapToInt(v -> v.length())
                .filter(v -> v != 4)
                .reduce(1, (x, y) -> x * y);
        System.out.println(value);
    }
}

/*
* Select the one correct answer.
a. 4
b. 6
c. 24
id. The program will throw an exception at runtime.
* */