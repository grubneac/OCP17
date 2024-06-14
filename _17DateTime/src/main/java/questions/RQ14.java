package questions;

import java.time.*;
import static java.time.temporal.ChronoUnit.DAYS;
public class RQ14 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2021, Month.APRIL, 2, 15, 15);
        // (1) INSERT CODE HERE
        System.out.println(ldt);

    }
}

/*
* Which statement inserted at (1) will not give the following result: 2021-04-03T16:15?
Select the one correct answer.

a.
ldt = ldt.plusHours(1).with(LocalDate.of(2021, Month.APRIL, 3));
b.
ldt = ldt.plusDays(1).with(LocalTime.of(16, 15));
c.
ldt = ldt.plus(Duration.of(2, DAYS)).minus(Duration.parse("PT23H"));
d.
ldt = ldt.plus(Duration.of(2, DAYS))
         .minus(Duration.ofMinutes(15).ofHours(16));
e.
ldt = ldt.plus(Duration.parse("PT25H"));
f.
ldt = ldt.plus(Duration.ofMinutes(25 * 60));
* */
