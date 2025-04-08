package q11;

import java.util.List;

class Person implements Comparable<Person> {
    public int compareTo(Person p) {
        return 1;
    }
}

class Student extends Person {
    public int compareTo(Student s) {
        return 2;
    }
}

public class Calling {
    public static void main(String[] args) {
        Person  p1 = new Person();
        Student s1 = new Student();
        Student s2 = new Student();
        Person  p2 = s1;
        System.out.println(List.of(
                p1.compareTo(s1), p1.compareTo(p2),
                p2.compareTo(s1), p2.compareTo(p1),
                s1.compareTo(p1), s1.compareTo(p2),
                s1.compareTo(s2)));
    }
}
/*
* What will be the result from the following program?
* Select the one correct answer.

a. [1, 1, 2, 1, 1, 1, 2]
b. [1, 1, 1, 1, 1, 1, 2]
c. [1, 1, 2, 1, 1, 2, 2]
d. [1, 1, 1, 1, 1, 2, 2]
e. [1, 1, 1, 1, 2, 2, 2]
* */