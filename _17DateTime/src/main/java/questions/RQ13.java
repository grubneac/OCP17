package questions;

import java.time.*;
public class RQ13 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(17,30);
        LocalDateTime ldt = LocalDateTime.of(2021, Month.APRIL, 2, 15, 15);
        Duration d = Duration.between(lt, ldt);
        System.out.println(d);
    }
}
/*
* What is the result?
Select the one correct answer.

a. PT-1H-45M
b. PT1H-45M
c. PT2H-15M
d. PT-2H-15M
e. The program will throw an exception at runtime.
* */
