package questions;

import java.time.*;
public class RQ3 {
    public static void main(String[] args) {
        LocalDateTime d1 = LocalDate.of(2021, 4, 1).atStartOfDay();
        Instant i1 = d1.toInstant(ZoneOffset.of("+18:00"));
        LocalDate d2 = LocalDate.ofInstant(i1, ZoneId.of("UTC"));
        System.out.println(d2);
    }
}


/*
* What is the result?
Select the one correct answer.

a. 2021-04-1
b. 2021-04-2
c. 2021-03-30
d. 2021-03-31
* */