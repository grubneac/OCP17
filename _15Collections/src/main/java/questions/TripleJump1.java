package questions;

import java.util.*;
public class TripleJump1 {
    public static void main(String[] args) {

        NavigableSet<String> set = new TreeSet<>(Collections.reverseOrder());
        Collections.addAll(set, "Step", "Jump", "Step", "Hop");
        System.out.println(set);
    }
}

/*
* What is the result?

Select the one correct answer.

a. [Step, Step, Jump, Hop]
b. [Step, Jump, Hop]
c. [Hop, Jump, Step, Step]
d. [Hop, Jump, Step]
e. The result is unpredictable.
f. The code will throw an exception at runtime.
* */