package org.example.questions;
import java.util.*;
public class Sets {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        addRange(set1, 1);
        ArrayList<Integer> list1 = new ArrayList<>();
        addRange(list1, 2);
        TreeSet<Integer> set2 = new TreeSet<>();
        addRange(set2, 3);
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        addRange(deque, 5);
        set1.removeAll(list1);
        list1.addAll(set2);
        deque.addAll(list1);
        set1.removeAll(deque);
        System.out.println(set1);
    }
    static void addRange(Collection<Integer> col, int step) {
        for (int i = step * 2; i <= 25; i += step) {
            col.add(i);
        }
    }
}

/*
* Select the one correct answer.

a. The program will fail to compile, since operations are performed on incompatible collection implementations.

b. The program will fail to compile, since no Comparator is supplied to the TreeSet constructor for sorting the elements.

c. The program will compile. When run, it will throw an UnsupportedOperation-Exception.

d. The program will compile. When run, it will print all primes below 25.
* */