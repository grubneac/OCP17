package instant;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

public class FirstExample {
    public static void main(String[] args) {
        Instant inst1 = Instant.ofEpochMilli(-24L*60*60*1000);// Date 1 day before epoch.
        Instant inst2 = Instant.ofEpochSecond(24L*60*60);     // Date 1 day after epoch.
        Instant inst3 = Instant.ofEpochSecond(24L*60*60 - 1,  // Date 1 day after epoch.
                1_000_000_000L);
        out.println("A day before: " + inst1); // Date 1 day before: 1969-12-31T00:00:00Z
        out.println("A day after:  " + inst2); // Date 1 day after : 1970-01-02T00:00:00Z
        out.println("A day after:  " + inst3); // Date 1 day after : 1970-01-02T00:00:00Z

        Instant inst4 = Instant.ofEpochSecond(0, 500);
        out.println("Default format:  " + inst4);       // 1970-01-01T00:00:00.000000500Z

        Instant instA = Instant.parse("1970-01-01T00:00:00.000000500Z");
        Instant instB = Instant.parse("1949-03-01T12:30:15Z");
        Instant instC = Instant.parse("-1949-03-01T12:30:15Z");
//        Instant instD = Instant.parse("-1949-03-01T12:30:15"); // DateTimeParseException!

        LocalDateTime ldt = LocalDate.of(2021, 12, 25).atStartOfDay();  //(1)
        Instant i1 = ldt.toInstant(ZoneOffset.of("+02:00"));     // (2) Ahead of UTC
        Instant i2 = ldt.toInstant(ZoneOffset.UTC);              // (3) At UTC
        Instant i3 = ldt.toInstant(ZoneOffset.of("-02:00"));     // (4) Behind UTC
        System.out.println("ldt: " + ldt);
        System.out.println("i1:  " + i1);
        System.out.println("i2:  " + i2);
        System.out.println("i3:  " + i3);

        Instant inst = Instant.ofEpochSecond(24L*60*60,    // 1 day and
                555_555_555L);// 555555555 ns after epoch.
        out.println(inst);                   // 1970-01-02T00:00:00.555555555Z
        out.println(inst.getNano());         // 555555555 ns
        out.println(inst.getEpochSecond());  // 86400 s

        out.println(inst.get(ChronoField.NANO_OF_SECOND));      // 555555555 ns
        out.println(inst.get(ChronoField.MICRO_OF_SECOND));     // 555555 micros
        out.println(inst.get(ChronoField.MILLI_OF_SECOND));     // 555 ms
        out.println(inst.getLong(ChronoField.INSTANT_SECONDS)); // 86400 s
//out.println(inst.get(ChronoField.INSTANT_SECONDS));   // DateTimeException
//out.println(inst.get(ChronoField.HOUR_OF_DAY));       // UnsupportedTemporal-TypeException
        out.println(instA.equals(instB));                 // false
        out.println(instA.equals(instC));                 // false

        List<Instant> list = Arrays.asList(instA, instB, instC);
        Collections.sort(list);             // Natural order: position on the timeline.
// [-1949-03-01T12:30:15Z, 1949-03-01T12:30:15Z, 1970-01-01T00:00:00.000000500Z]
        out.println(list);
    }
}
