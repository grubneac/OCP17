package local;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExamples {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1969, 7, 20);            // 1969-07-20
        System.out.println(date1);
        LocalDate date2 = LocalDate.of(-3113, Month.AUGUST, 11);// -3113-08-11
        System.out.println(date2);
//  LocalDate date3 = LocalDate.of(2021, 13, 11);       // DateTimeException
//  LocalDate date4 = LocalDate.of(2021, 2, 29);        // DateTimeException

        System.out.println(LocalDate.now());
    }
}
