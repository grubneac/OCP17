package questions;

import java.time.*;
public class RQ9 {
    public static void main(String[] args) {
        Duration d  = Duration.parse("PT-24H");
        LocalDate ld = LocalDate.of(2021, 4, 1).plus(d);
        System.out.println(ld);
    }
}

/*
* What is the result?
Select the one correct answer.

a. 2021-03-31
b. 2021-04-01
c. 2021-04-02
d. The program will throw an exception at runtime.
e. The program will fail to compile.
* */