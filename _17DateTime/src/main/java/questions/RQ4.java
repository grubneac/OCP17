package questions;

import java.time.*;
public class RQ4 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDate.of(2021, 4, 1).atStartOfDay();
        ZonedDateTime zdt1 = dt.atZone(ZoneId.of("Europe/Paris"));
        ZonedDateTime zdt2 = dt.atZone(ZoneId.of("Europe/London"));
        Duration d = Duration.between(zdt1.minusMinutes(30), zdt2.plusMinutes(30));
        System.out.println(d);
    }
}

/*
* What is the result, given that the time difference between Paris and London is 1 hour?
Select the one correct answer.

a. PT0H
b. PT1H
c. PT2H
d. PT-2H
e. PT-1H
* */