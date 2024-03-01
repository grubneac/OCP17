package org.example.questions;

import java.util.*;
import java.util.function.*;
public class Test13RQ9 {
    public static void main(String[] args) {
        List<String> values
                = new ArrayList<>(List.of("PLOT","FLOP","LOOP","LEAP"));
        Predicate<String> filter1 = s -> s.contains("O");
        Predicate<String> filter2 = s -> s.endsWith("P");
        values.removeIf(filter1.and(filter2).negate());
        System.out.println(values);
    }
}

/*
* What is the result?
Select the one correct answer.
a. [LEAP]
b. [PLOT]
c. [FLOP, LOOP]
d. [PLOT, FLOP, LOOP]
e. [PLOT, FLOP, LOOP, LEAP]
f. The program will compile, but it will not produce any output when run.
g. The program will throw an exception at runtime.
h. The program will fail to compile.
* */
