package questions;

import java.time.*;
public class RQ11 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate foolsDay = LocalDate.of(2021, Month.APRIL, 1);
        LocalDateTime tomorrowAfternoon = now.plusDays(1)
                .atTime(LocalTime.of(12, 01));
        LocalDate anotherDay = foolsDay.withDayOfMonth(2).minusDays(1);
    }
}

/*
* How many LocalDate objects are created in this example?
Select the one correct answer.

a. 3
b. 4
c. 5
d. 6
* */
