package questions;

import java.util.*;
public class Test12_01 {
    public static void main(String[] args) {

        String[] data1 = {"A","B","B","A"};
        List<String> data2 = new ArrayList<>();
        for (String s : data1) {
            data2.add(s);
        }
        data2.set(1, "X");
        data2.add(1, "X");
        data2.remove(2);
        System.out.println(data2);
    }
}

/*
* Select the one correct answer.

a. [X, B, B, A]

b. [A, X, B, A]

c. [A, X, A]

d. [A, X, X]

e. The program will throw an exception at runtime.

f. The program will fail to compile.
* */