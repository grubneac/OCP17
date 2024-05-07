package questions;

import java.util.function.*;
import java.util.stream.*;

public class RQ11 {
    public static void main(String[] args) {
        Stream<String> abc = Stream.of("A", "B", "C");
        Stream<String> xyz = Stream.of("X", "Y", "Z");
        String value = Stream.concat(xyz, abc).reduce((a, b) -> b + a).get();
        System.out.println(value);
    }
}

/*
* What is the result?
Select the one correct answer.

a. ABCXYZ
b. XYZABC
c. ZYXCBA
d. CBAZYX
* */