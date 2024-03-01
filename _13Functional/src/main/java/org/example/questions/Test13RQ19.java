package org.example.questions;

import java.util.function.Function;
public class Test13RQ19 {
    public static void main(String[] args) {
        Function f1 = (x) -> "<" + x;
        Function f2 = (x) -> x + ">";
        System.out.print(f2.compose(f1).apply(42));
    }
}

/*
* What is the result?

Select the one correct answer.
a. <42>
b. >42<
c. The program will throw an exception at runtime.
d. The program will fail to compile.
* */