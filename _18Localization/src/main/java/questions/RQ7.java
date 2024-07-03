package questions;

import java.math.*;
import java.text.*;
import java.util.*;
public class RQ7 {
    public static void main(String[] args) {
        BigDecimal value = new BigDecimal("9876.545");
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        nf.setMaximumFractionDigits(2);
        nf.setRoundingMode(RoundingMode.HALF_DOWN);
        String s1 = nf.format(value);
        System.out.println();
        nf.setRoundingMode(RoundingMode.HALF_UP);
        String s2 = nf.format(value);
        System.out.println(s1+" "+s2);
    }
}

/*
* What is the result?
Select the one correct answer.

a. $9,876.55 $9,876.55
b. $9,876.54 $9,876.54
c. $9,876.55 $9,876.54
d. $9,876.54 $9,876.55
e. The program will throw an exception at runtime.
* */