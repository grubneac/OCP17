package org.example.questions;
import java.util.*;
public class RQ400A100 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i : makeCollection()) {
            sum += i;
        }
        System.out.println(sum);
    }

    static Collection<Integer> makeCollection() {
        System.out.println("A collection coming up.");
        Collection<Integer> collection = new ArrayList<>();
        collection.add(10); collection.add(20); collection.add(30);
        return collection;
    }
}

/*
* Select the one correct answer.

a. The program will print
A collection coming up.
60
b. The program will print
    A collection coming up.
    A collection coming up.
    A collection coming up. 60
c. The program will fail to compile.

d. None of the above
* */