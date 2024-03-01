package questions;

import java.util.*;
public class TripleJump2 {
    public static void main(String[] args) {

        NavigableSet<String> set1 = new TreeSet<>(Collections.reverseOrder());
        Collections.addAll(set1, "Step", "Jump", "Hop");
        NavigableSet<String> set2 = new TreeSet<>(set1);
        System.out.println(set2);
    }
}

/*
* What is the result?
Select the one correct answer.

a. [Hop, Jump, Step]
b. [Step, Jump, Hop]
c. The program will compile, but it will produce an unpredictable result when run.
d. The program will throw an exception at runtime.
e. The program will fail to compile.
* */