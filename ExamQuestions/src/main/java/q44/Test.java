package q44;

import java.nio.file.*;
public class Test {
    public static void main(String[] args) {
        Path p1 = Path.of("/users/joe");
        Path p2 = Path.of("/users/bob");
        Path p3 = p1.resolve(p1.relativize(p2));
        Path p4 = p3.normalize();
        System.out.println(p3.getName(1) + " " + p4.getName(1));
    }
}
/*
* What is the result?
Select the one correct answer.

a. users bob
b. joe users
c. joe bob
d. users users
* */