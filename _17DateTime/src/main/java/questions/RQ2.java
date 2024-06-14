package questions;

import java.time.LocalDate;
public class RQ2 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2021, 1, 1);
        d1 = d1.withDayOfMonth(d1.lengthOfMonth()).withMonth(2);
        System.out.println(d1);
    }
}

/*
* What is the result?
Select the one correct answer.

a. 2021-02-28
b. 2021-02-31
c. 2021-03-03
d. The program will throw an exception at runtime.
* */