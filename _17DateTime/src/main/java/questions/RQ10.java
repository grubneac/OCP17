package questions;

import java.time.*;
public class RQ10 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2021, 4, 1);
        // (1) INSERT CODE HERE
//        System.out.println(ldt);
    }
}

/*
* Which of the following statements, when inserted independently at (1), will print the following result: 2021-04-03T00:30?
Select the two correct answers.

a.
LocalDateTime ldt = ld.atTime(LocalTime.of(0, 30))
                      .plus(Duration.ofHours(48));
b.
LocalDateTime ldt = ld.plus(Duration.ofHours(48))
                      .atTime(LocalTime.of(0, 30));
c.
LocalDateTime ldt = ld.atTime(LocalTime.of(48,30));
d.
LocalDateTime ldt = ld.plusDays(3).atTime(LocalTime.of(-23,30));
e.
LocalDateTime ldt = ld.atTime(0, 30).plus(Duration.ofHours(48));
* */