package org.example.questions;

import java.util.Comparator;
import java.util.Comparator;
class Person  implements Comparable<Person > {
    private String name;

    private int age;
    Person (String name, int age) { this.name = name; this.age = age; }

    public int compareTo(Person  p2) {
        Comparator<String> strCmp = Person.cmp();
        int status = strCmp.compare(this.name, p2.name);
        if (status == 0) {
            Comparator<Integer> intCmp = Person.cmp();
            status = intCmp.compare(this.age, p2.age);
        }
        return status;
    }

    public static <E extends Comparable<E>> Comparator<E> cmp() {
        return  (e1, e2) -> e2.compareTo(e1);
    }
}

class Main {
    public static void main(String[] args) {
        Person  p1 = new Person ("Tom", 20);
        Person  p2 = new Person ("Dick", 30);
        Person  p3 = new Person ("Tom", 40);
        System.out.println((p1.compareTo(p2) < 0) + " " + (p1.compareTo(p3) < 0));
    }
}