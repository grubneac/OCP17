package instant;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

import static java.lang.System.out;

public class ModifyInstant {
    public static void main(String[] args) {
        Instant i0, i1, i2, i3;
        i0 = Instant.now();
        out.println(i0);                             // 2021-02-28T08:43:35.864Z
        i1 = i0.with(ChronoField.NANO_OF_SECOND,  500_000_000);// 500000000 ns.
        i2 = i0.with(ChronoField.MICRO_OF_SECOND, 500_000);    // 500000x1000 ns.
        i3 = i0.with(ChronoField.MILLI_OF_SECOND, 500);        // 500x1000000 ns.
        out.println(i1);                             // 2021-02-28T08:43:35.500Z

        out.println(i1.equals(i2));                  // true
        out.println(i1.equals(i3));                  // true

        Instant oneInstant = Instant.now()
                .with(ChronoField.MILLI_OF_SECOND, 500)
                .with(ChronoField.INSTANT_SECONDS, 24L*60*60);
        out.println(oneInstant);                     // 1970-01-02T00:00:00.500Z

        out.println("---------------Arithmetic with Instants------------------");
        Instant event =
                Instant.EPOCH                    //            1970-01-01T00:00:00Z
                        .plusSeconds(7L*24*60*60) // (+7days)   1970-01-08T00:00:00Z
                        .plusSeconds(6L*60*60)    // (+6hrs)    1970-01-08T06:00:00Z
                        .plusSeconds(5L*60)       // (+5mins)   1970-01-08T06:05:00Z
                        .plusSeconds(4L)          // (+4s)      1970-01-08T06:05:04Z
                        .plusMillis(3L*100)       // (+3ms)     1970-01-08T06:05:04.003Z
                        .plusNanos(2L*1_000)      // (+2micros) 1970-01-08T06:05:04.003002Z
                        .plusNanos(1L);           // (+1ns)     1970-01-08T06:05:04.003002001Z
        Instant ptInTime =
                Instant.EPOCH                          // 1970-01-01T00:00:00Z
                        .plus(7L, ChronoUnit.DAYS)      // 1970-01-08T00:00:00Z
                        .plus(6L, ChronoUnit.HOURS)     // 1970-01-08T06:00:00Z
                        .plus(5L, ChronoUnit.MINUTES)   // 1970-01-08T06:05:00Z
                        .plus(4L, ChronoUnit.SECONDS)   // 1970-01-08T06:05:04Z
                        .plus(3L, ChronoUnit.MILLIS)    // 1970-01-08T06:05:04.003Z
                        .plus(2L, ChronoUnit.MICROS)    // 1970-01-08T06:05:04.003002Z
                        .plus(1L, ChronoUnit.NANOS);    // 1970-01-08T06:05:04.003002001Z

        Instant start = Instant.EPOCH
                .plus(20, ChronoUnit.MINUTES);// 1970-01-01T00:20:00Z
        Duration length = Duration.ZERO.plusMinutes(90);     // PT1H30M (90 mins)
        Instant end = start.plus(length);                    // 1970-01-01T01:50:00Z

        long eventDuration1 = start.until(end, ChronoUnit.MINUTES);  // 90 minutes
        long eventDuration2 = start.until(end, ChronoUnit.HOURS);    // 1 hour
        out.println("How many minutes between start an end: " + eventDuration1);
        out.println("How many hours between start an end: " + eventDuration2);

        out.println("---------------Converting Instants------------------");
        Instant instant = Instant.parse("2021-04-28T03:15:00Z");
        ZoneId zid = ZoneId.of("America/New_York");
        LocalTime lt = LocalTime.ofInstant(instant, zid);           // 10:18:30
        LocalDate ld = LocalDate.ofInstant(instant, zid);           // 2021-04-27
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, zid);  // 2021-04-27T23:15
        ZonedDateTime zdt = ZonedDateTime.ofInstant(instant, zid);  // 2021-04-27T23:15-04:00[America/New_York]


    }
}
