package questions;

import java.util.*;
public class Test12_02 {
    public static void main(String[] args) {
        String[] data1 = {"A","B","B","A"};
        List<String> data2 = Arrays.asList(data1);
        data2.set(1, "X");
        data2.set(2, "X");
        System.out.println(data2);
    }
}
/*
* Select the one correct answer.

a. [A, X, X, A]

b. [X, X, B, A]

c. [A, X, X, B, B, A]

d. [X, X, A, B, B, A]

e. The program will throw an exception at runtime.

f. The program will fail to compile.
* */