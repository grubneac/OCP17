package q38;

import java.math.*;
import java.util.*;
public class TestThingy {
    public static void main(String[] args) {
        Thingy[] values  = {
                new Thingy<BigDecimal>(BigDecimal.valueOf(12.99)),
                new Thingy<BigDecimal>(BigDecimal.valueOf(7.99)),
                new Thingy<BigDecimal>(BigDecimal.valueOf(7)),
                new Thingy<BigDecimal>(BigDecimal.valueOf(9.99))};
        Arrays.sort(values);
/*        for (Thingy t: values) {
            System.out.print(t + " ");
        }*/
        System.out.println((int)'.');
        System.out.println((int)'9');
    }
}
/*
* What is the result?

Select the one correct answer.
a. 12.99 7.99 7 9.99
b. 12.99 7 7.99 9.99
c. 7 7.99 9.99 12.99
d. 12.99 9.99 7.99 7
e. The code will throw an exception at runtime.
f. The code will fail to compile.
* */