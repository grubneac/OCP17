package durations;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

public class DurationExample {
    public static void main(String[] args) {
        Duration d1 = Duration.ofDays(1L);                               // PT24H
        Duration d2 = Duration.ofHours(24L);                             // PT24H
        Duration d3 = Duration.ofMinutes(24L*60);                        // PT24H
        Duration d4 = Duration.ofSeconds(24L*60*60);                     // PT24H
        Duration d5 = Duration.ofMillis(24L*60*60*1000);                 // PT24H
        Duration d6 = Duration.ofSeconds(24L*60*60 - 1, 1_000_000_000L); // (1) PT24H
        Duration d7 = Duration.ofNanos(24L*60*60*1_000_000_000); // (2) PT24H
        Duration d8 = Duration.ofNanos(24*60*60*1_000_000_000);  // (3) PT-1.857093632S

        Duration d11 = Duration.of(1L, ChronoUnit.DAYS);              // P24H
        Duration d22 = Duration.of(24L, ChronoUnit.HOURS);            // P24H
        Duration d33 = Duration.of(24L*60, ChronoUnit.MINUTES);       // P24H
        Duration d44 = Duration.of(24L*60*60, ChronoUnit.SECONDS);    // P24H
        Duration d88 = Duration.of(24L*60*60*1000, ChronoUnit.MILLIS);// P24H
        Duration d77 = Duration.of(24L*60*60*1_000_000_000, ChronoUnit.NANOS);                 // P24H

        Duration duration = Duration.ofDays(7).ofHours(24);   // PT24H. Logical error.

        LocalTime startTime = LocalTime.of(14, 30);                  // 14:30
        LocalTime endTime   = LocalTime.of(17, 45, 15);              // 17:45:15
        Duration interval1 = Duration.between(startTime, endTime);   // PT3H15M15S
        Duration interval2 = Duration.between(endTime, startTime);   // PT-3H-15M-15S

        LocalDateTime dateTime = LocalDateTime.of(2021, 4, 28,
                17, 45, 15);    // 2021-04-28T17:45:15
        Duration interval3 = Duration.between(startTime, dateTime);  // PT3H15M15S
//        Duration interval4 = Duration.between(dateTime, startTime);  // DateTimeException!

        Duration da = Duration.parse("PT3H15M10.1S");// 3hrs. 15mins. 10.1s.(PT3H15M10.1S)
        Duration db = Duration.parse("PT0.999S");    // 999000000 nanos.    (PT0.999S)
        Duration dc = Duration.parse("-PT30S");      // -30 seconds.        (PT-30S)
        Duration dd = Duration.parse("P-24D");       // -24 days            (PT-576H)
//        Duration dd2 = Duration.parse("P24H");        // Missing T. DateTimeParseException!

        Duration dx = Duration.ofSeconds(12L*60*60, 500_000_000L); // PT12H0.5S
        out.println(dx.getNano());                                 // 500000000
        out.println(dx.getSeconds());                              // 43200 (i.e. 12 hrs.)
        out.println(dx.get(ChronoUnit.NANOS));       // 500000000
        out.println(dx.get(ChronoUnit.SECONDS));     // 43200
//        out.println(dx.get(ChronoUnit.MINUTES));     // UnsupportedTemporalTypeException
        out.println(dx.getUnits());                  // [Seconds, Nanos]

        out.println("Days:    " + dx.toDays());      // Days:    0
        out.println("Hours:   " + dx.toHours());     // Hours:   12
        out.println("Minutes: " + dx.toMinutes());   // Minutes: 720
        out.println("Millis:  " + dx.toMillis());    // Millis:  43200500
        out.println("Nanos:   " + dx.toNanos());     // Nanos:   43200500000000

        Duration eatBreakFast = Duration.ofMinutes(20L);                // PT20M
        Duration eatLunch     = Duration.ofSeconds(30L*60);             // PT30M
        Duration eatSupper    = Duration.of(45L, ChronoUnit.MINUTES);   // PT45M

        out.println(eatBreakFast.equals(eatLunch));                     // false
        out.println(Duration.ofSeconds(0).equals(Duration.ZERO));       // true

        List<Duration> ld = Arrays.asList(eatSupper, eatBreakFast, eatLunch );
        Collections.sort(ld);                            // Natural order.
        out.println(ld);                                 // [PT20M, PT30M, PT45M]

        out.println("------------------Creating Modified Copies of Durations-------------------------");
        Duration oneDuration =  Duration.ZERO                     // PT0S
                .withNanos(500_000_000)   // New copy: PT0.5S
                .withSeconds(12L*60*60);  // New copy: PT12H0.5S

        Duration max20H = Duration.ZERO                           // PT0S
                .plusHours(10)                  // PT10H
                .plusMinutes(10*60 + 30)        // PT20H30M
                .plusSeconds(6*60*60 + 15)      // PT26H30M15S
                .minusMinutes(2*60 + 30)        // PT24H15S
                .minusSeconds(15);              // PT24H
        Duration max20H2 =
                Duration.ZERO                                         // PT0S
                        .plus(10L,           ChronoUnit.HOURS)        // PT10H
                        .plus(10*60 + 30,    ChronoUnit.MINUTES)      // PT20H30M
                        .plus(6*60*60L + 15, ChronoUnit.SECONDS)      // PT26H3015S
                        .minus(2*60 + 30,    ChronoUnit.MINUTES)      // PT24H15S
                        .minus(15,           ChronoUnit.SECONDS);     // PT24H

        Duration eatBreakFast1 = Duration.ofMinutes(20L);                // PT20M
        Duration eatLunch1     = Duration.ofSeconds(30L*60);             // PT30M
        Duration eatSupper1    = Duration.of(45L, ChronoUnit.MINUTES);   // PT45M
        Duration totalTimeForMeals = eatBreakFast1                       // PT20M
                .plus(eatLunch1)                                             // PT50M
                .plus(eatSupper1);                                           // PT1H35M

        Duration result = Duration.ofSeconds(-100, -500_000_000) // -100.5 => PT-1M-40.5S
                .abs()           // abs(-100.5) = 100.5  => PT1M40.5S
                .multipliedBy(4) // 100.5*4 = 402 => PT6M42S
                .dividedBy(2);   // 402 / 2 = 201 => PT3M21S
    }
}
