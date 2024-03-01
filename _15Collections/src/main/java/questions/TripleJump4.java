package questions;

import java.util.*;
public class TripleJump4 {
    public static void main(String[] args) {

        NavigableSet<String> set1 = new TreeSet<>(Collections.reverseOrder());
        Collections.addAll(set1, "Step", "Jump", "Hop");
        NavigableSet<String> set2 = new TreeSet<>((Collection<String>)set1);
        while (!set1.isEmpty()) {
            System.out.print(set1.pollLast() + " ");
        }
        while (!set2.isEmpty()) {
            System.out.print(set2.pollFirst() + " ");
        }
    }
}

/*
* What is the result?
Select the one correct answer.

a. Hop Jump Step Hop Jump Step
b. Hop Jump Step Step Hop Jump
c. Step Jump Hop Step Jump Hop
d. Step Jump Hop Hop Jump Step
e. The program will throw an exception at runtime.
* */