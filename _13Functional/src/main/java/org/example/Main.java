package org.example;

import java.util.function.Consumer;
import java.util.function.IntPredicate;

public class Main {

    public static <T> boolean testPredicate(T par, Predicate<T> predicate) {
        return predicate.test(par);
    }
    // An anonymous class implementation of Predicate<String>.
    static Predicate<String> testLength = new Predicate<>() {
        public boolean test(String str) {
            return str.length() < 4;                  // (2)
        }
    };
    static Predicate<Object> checkIfString = a->a instanceof Integer;

    static Predicate<Integer> p1 = new Predicate<>() {  // Anonymous class
        public boolean test(Integer i) {
            return i % 2 == 0;
        }
    };
    static IntPredicate p2 = i -> i % 2 == 0;        // (2) Target type: IntPredicate

    public static void main(String[] args) {
        System.out.println(testPredicate("Anna", new PredicateTest()));
        System.out.println(testPredicate("Anna", testLength));
        System.out.println(testPredicate("Anna", checkIfString));
        System.out.println(testPredicate(10, checkIfString));

        System.out.println("----------------------------");
        System.out.println(p1 == p2);
        System.out.println(p1.test(2021));
        System.out.println(p2.test(2020));

        System.out.println("------------------------------");
        Consumer<Double> formatter = d -> System.out.printf("Value: %.2f%n", d);
        formatter.accept(3.145);                     // Value: 3.15
        System.out.println("------------------------------");

    }

}

// Class implementation of Predicate<String>.
class PredicateTest implements Predicate<String> {
    public boolean test(String str) {
        return str.startsWith("A");               // (1)
    }
}


@FunctionalInterface
interface Predicate<T> {
    boolean test(T element);                                // Functional method.

    // ...
}