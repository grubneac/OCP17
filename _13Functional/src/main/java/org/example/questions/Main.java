package org.example.questions;

import java.util.*;
class Test {
    private List<Integer> values = new ArrayList<>(List.of(1,2,3,4,5));
    public List<Integer> getValues()        { return values; }
    public static boolean isEven(int value) { return value % 2 != 0; }
    public void printValue(int value)       { System.out.print(value + " "); }
}
public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.getValues().removeIf(v -> v % 2 != 0);                // (1)
        test.getValues().forEach(v -> System.out.print(v + " ") ); // (2)
        System.out.println("\n---------------------------");
    }
}
/*
* Which method references are equivalent to lambda expressions at (1) and (2) in the following code?
* Select the one correct answer.

a. test.getValues().removeIf(Test::isEven);
test.getValues().forEach(Test::printValue);

b. test.getValues().removeIf(Test::isEven);
test.getValues().forEach(test::printValue);

c. test.getValues().removeIf(test::isEven);
test.getValues().forEach(test::printValue);

d. test.getValues().removeIf(test::isEven);
test.getValues().forEach(Test::printValue);
* */