package zone;

import java.time.*;
import java.time.temporal.ChronoField;

public class ZonedDateTimeExamples {
    public static void main(String[] args) {
        ZonedDateTime defaultZDT = ZonedDateTime.now();                          // (1a)
        ZonedDateTime utcZDT     = ZonedDateTime.now(ZoneId.of("UTC"));          // (2a)
        ZonedDateTime edtZDT     = ZonedDateTime.now(ZoneId.of("US/Eastern"));   // (3a)
        System.out.println("Default Zone Date-time:  " + defaultZDT);
        System.out.println("UTC Date-time:           " + utcZDT);
        System.out.println("EDT Zone Date-time:      " + edtZDT);

        LocalTime concertTime = LocalTime.of(00, 10);                  // 00:10
        LocalDate concertDate = LocalDate.of(1973, Month.JANUARY, 14); // 1973-01-14
        LocalDateTime concertDT = LocalDateTime.of(concertDate,
                concertTime);  // 1973-01-14T00:10
        ZoneId hwZID = ZoneId.of("US/Hawaii");                    // US/Hawaii
        Instant instantZ = Instant.ofEpochSecond(95854200);       // 1973-01-14T10:10:00Z
        System.out.println(instantZ);

        ZonedDateTime concertZDT0 = ZonedDateTime.of(concertDate, concertTime, hwZID);
        System.out.println(concertZDT0);
        ZonedDateTime concertZDT1 = ZonedDateTime.of(concertDT, hwZID);
        System.out.println(concertZDT1);
        ZonedDateTime concertZDT2 = ZonedDateTime.ofInstant(instantZ, hwZID);
        System.out.println(concertZDT2);
// 1973-01-14T00:10-10:00[US/Hawaii]
        boolean areEqual = concertZDT0.equals(concertZDT1)
                && concertZDT0.equals(concertZDT2);      // true
        System.out.println(areEqual);
        ZonedDateTime concertZDT3 = concertDT.atZone(hwZID);
        System.out.println(concertZDT3);
        ZonedDateTime concertZDT4 = instantZ.atZone(hwZID);
        System.out.println(concertZDT4);

        ZonedDateTime concertZDT5
                = ZonedDateTime.parse("1973-01-14T00:10-10:00[US/Hawaii]");

        // Using ChronoField constants:
        int theDay = concertZDT0.get(ChronoField.DAY_OF_MONTH);          // 14
        int theMonthValue = concertZDT0.get(ChronoField.MONTH_OF_YEAR);  // 1
        int theYear = concertZDT0.get(ChronoField.YEAR);                 // 1973

// Using specific get methods:
        int theMonthValue2 = concertZDT0.getMonthValue();                // 1
        Month theMonth     = concertZDT0.getMonth();                     // JANUARY

// Extracting constituent parts:
        LocalTime theTime     = concertZDT0.toLocalTime();         // 00:10
        LocalDate theDate     = concertZDT0.toLocalDate();         // 1973-01-14
        LocalDateTime theDT   = concertZDT0.toLocalDateTime();     // 1973-01-14T00:10
        ZoneId theZID         = concertZDT0.getZone();             // US/Hawaii
        ZoneOffset theZoffset = concertZDT0.getOffset();           // -10:00
        DayOfWeek dayOfWeek = concertZDT0.getDayOfWeek();          //SUNDAY
        System.out.println(dayOfWeek);

        ZonedDateTime theZDT = concertZDT0         // 1973-01-14T00:10-10:00[US/Hawaii]
                .withYear(1977)                        // 1977-01-14T00:10-10:00[US/Hawaii]
                .with(ChronoField.MONTH_OF_YEAR, 8)    // 1977-08-14T00:10-10:00[US/Hawaii]
                .withDayOfMonth(16)                    // 1977-08-16T00:10-10:00[US/Hawaii]
                .with(ChronoField.HOUR_OF_DAY, 9)      // 1977-08-16T09:10-10:00[US/Hawaii]
                .with(ChronoField.MINUTE_OF_HOUR, 30); // 1977-08-16T09:30-10:00[US/Hawaii]
        System.out.println(theZDT);

        System.out.println("-----------withZoneSameLocal---------------------");
        ZoneId cTZ = ZoneId.of("US/Central");
        ZonedDateTime zdtSameLocal = theZDT.withZoneSameLocal(cTZ);            // (1)
        System.out.printf("%23s %25s%n", "ZonedDateTime", "Instant");
        System.out.printf("%-35s %s%n", theZDT, theZDT.toInstant());
        System.out.printf("%-35s %s%n", zdtSameLocal, zdtSameLocal.toInstant());

        System.out.println("-----------withZoneSameInstante---------------------");
        ZonedDateTime zdtSameInstant = theZDT.withZoneSameInstant(cTZ);        // (2)
        System.out.printf("%23s %25s%n", "ZonedDateTime", "Instant");
        System.out.printf("%-35s %s%n", theZDT, theZDT.toInstant());
        System.out.printf("%-35s %s%n", zdtSameInstant, zdtSameInstant.toInstant());
    }
}
