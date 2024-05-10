package local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExamples {
    public static void main(String[] args) {
// 2021-04-28T12:15
        LocalDateTime dt1 = LocalDateTime.of(2021, 4, 28, 12, 15);
// 2021-08-19T14:00
        LocalDateTime dt2 = LocalDateTime.of(2021, Month.AUGUST, 19, 14, 0);
         LocalDate date1 = LocalDate.of(1969,07,20);
        LocalDateTime dt3 = LocalDateTime.of(date1, LocalTime.NOON); // 1969-07-20T12:00
        System.out.println(dt3);
        LocalDateTime dt4 = LocalTime.of(10, 0).atDate(date1);       // 1969-07-20T10:00
        System.out.println(dt4);
        LocalDateTime dt5 = date1.atTime(LocalTime.NOON);            // 1969-07-20T12:00
        System.out.println(dt5);
        LocalDateTime dt6 = date1.atTime(13, 40);                     // 1969-07-20T13:40
        System.out.println(dt6);

        System.out.println(LocalDateTime.now());
    }
}
