package questions;

import java.text.*;
import java.util.*;
public class RQ11 {
    public static void main(String[] args) {
        double x = 0.987654321;
        NumberFormat nf = NumberFormat.getPercentInstance(Locale.US);
        System.out.println(nf.format(x));
    }
}

/*
* What is the result?
Select the one correct answer.

a. 0.98%
b. 0.99%
c. 98%
d. 99%
e. 0.987654321%
f. 987654321%
* */