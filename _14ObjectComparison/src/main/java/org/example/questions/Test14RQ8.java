package org.example.questions;

import java.util.*;
public class Test14RQ8 {
    public static void main(String[] args) {
        Integer[] values = {-42,15,-23,19,11,71};
        Arrays.sort(values, (v1, v2) -> v1.toString().compareTo(v2.toString()));
        System.out.println(Arrays.toString(values));
    }
}

/*
* What is the result?
Select the one correct answer.
a. [71, 19, 15, 11, -23, -42]
b. [-23, -42, 11, 15, 19, 71]
c. [-42, -23, 11, 15, 19, 71]
d. [71, 19, 15, 11, -42, -23]
e. [-42, 15, -23, 19, 11, 71]
f. The program will throw an exception at runtime.
g. The program will fail to compile.
*
* */
