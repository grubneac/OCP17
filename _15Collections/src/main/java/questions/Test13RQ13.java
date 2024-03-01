package questions;

import java.util.*;
import java.util.function.*;
public class Test13RQ13 {
    public static void main(String[] args) {

        Map<Integer, String> values = new HashMap<>();
        values.put(1, "ONE");   values.put(2, "TWO");
        values.put(3, "THREE"); values.put(4, "FOUR");
        values.replaceAll((k, v) -> {
            switch (k) {
                case 1: return "FIRST";
                case 2: return "SECOND";
                case 3: return "THIRD";
                case 4: return "FOURTH";
            }
            return "ZERO";
        });
        values.forEach((Integer x, String y) -> { System.out.print(y + " "); } );
    }
}


/*
* What is the result?

Select the one correct answer.

a. ONE TWO THREE FOUR
b. FIRST SECOND THIRD FOURTH
c. 1 2 3 4
d. The program will compile, but it will produce no result when run.
e. The program will throw an exception at runtime.
f. The program will fail to compile.
* */