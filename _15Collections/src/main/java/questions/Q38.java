package questions;

import java.util.*;
public class Q38 {
    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<>();
        prices.add(1);
        prices.add(2);
        prices.add(2, null);
        prices.add(3, 3);
        prices.add(2, 4);
        prices.set(2, 3);
        prices.remove(2);
        prices.add(2, 2);
        System.out.print(prices);
    }
}

/*
* What is the result?
Select the one correct answer.

a. [1, 2, null, 3]
b. [1, 2, 3]
c. [1, 2, 2, 3]
d. [1, 2, 2, null, 3]
e. [1, 2, null, null]
f. [1, null, 2, 2, 3]
g. The program will throw an exception at runtime.
h. The program will fail to compile.
* */
