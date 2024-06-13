package zone;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

// (DST)daylight saving time
public class DSTExample {
    public static void main(String[] args) {
        System.out.println("Daylight saving GAP");
        LocalDateTime dateTime = LocalDateTime.of(2021, 03, 14, 1, 0);
        ZoneId zone = ZoneId.of("US/Central");
        ZonedDateTime currZoneDateTime = ZonedDateTime.of(dateTime, zone);
        Duration duration = Duration.ofMinutes(30);
        for (int i = 0; i < 4; i++) {
            System.out.println(currZoneDateTime);
            currZoneDateTime = currZoneDateTime.plus(duration);
        }

        System.out.println("\nDaylight saving OverLap");
        LocalDateTime dateTime1 = LocalDateTime.of(2021, 11, 7, 1, 0);
        ZoneId zone1 = ZoneId.of("US/Central");
        ZonedDateTime currZoneDateTime1 = ZonedDateTime.of(dateTime1, zone);
        for (int i = 0; i < 4; i++) {
            System.out.println(currZoneDateTime1);
            currZoneDateTime1 = currZoneDateTime1.plus(duration);
        }
    }
}
