package org.example.questions;

import java.util.*;
import java.util.function.*;
public class Test13RQ11 {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("ALICE","BOB","JOHN","JANE");
        UnaryOperator<String> f1 = v -> v.toLowerCase();
        values.replaceAll(f1);
        Consumer<String> c1 = s -> s = s.substring(0,1).toUpperCase();
        Consumer<String> c2 = s -> System.out.print(s + " ");
        values.forEach(c1.andThen(c2));
    }
}

/*
* What is the result?
Select the one correct answer.
a. Alice Bob John Jane
b. alice bob john jane
c. A B J J
d. The program will throw an exception at runtime.
e. The program will fail to compile.*/