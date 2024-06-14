package questions;

import java.time.LocalDate;
public class RQ1 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2021, 1, 31);
        LocalDate d2 = d1.plusMonths(1);
        LocalDate d3 = d2.minusMonths(1);
        System.out.println(d1.getDayOfYear() + " " + d2.getDayOfYear() + " " +
                d3.getDayOfYear());
    }
}

/*
* What is the result?
Select the one correct answer.

a. 31 61 31
b. 31 59 28
c. 31 59 31
d. The program will throw an exception at runtime.
* */