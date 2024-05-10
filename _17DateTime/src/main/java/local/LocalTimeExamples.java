package local;

import java.time.LocalTime;

public class LocalTimeExamples {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(8, 15, 35, 900);   // 08:15:35.000000900
        LocalTime time2 = LocalTime.of(16, 45);           // 16:45
// LocalTime time3 = LocalTime.of(25, 13, 30);    // DateTimeException

        System.out.println(LocalTime.now());
    }
}
