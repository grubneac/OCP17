package questions;

import java.util.*;
public class Q37 {
    public static void main(String[] args) {
        Integer x = 1, y = 2, z = 3;
        Set<Integer> coordinates = new TreeSet<>();
        coordinates.add(x);
        coordinates.add(y);
        coordinates.add(y);
        coordinates.add(z);
        coordinates.remove(x);
        System.out.print(coordinates);
    }
}

/*
* What is the result?

Select the one correct answer.

a. [1, 2, 3]
b. [2, 3]
c. [2, 2, 3]
d. [1, 2, 2, 3]
e. The program will throw an exception at runtime.
f. The program will fail to compile.
* */