package questions;

import java.time.*;
public class RQ6 {
    public static void main(String[] args) {
        LocalTime t = LocalTime.of(8, 15);
        LocalDate d = LocalDate.of(2021, 4, 1);
        LocalDateTime dt = d.atTime(t);
        dt.minusMinutes(30).withDayOfMonth(12);
        System.out.println(dt);
    }
}

/*
* What is the result?
Select the one correct answer.

a. 2021-04-12T08:45
b. 2021-04-12T07:45
c. 2021-04-01T08:15
d. 2021-04-01T07:15
* */
