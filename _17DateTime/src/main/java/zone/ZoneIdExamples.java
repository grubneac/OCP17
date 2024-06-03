package zone;

import java.time.ZoneId;

public class ZoneIdExamples {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds()                 // Prints a long list of zone names.
                .stream()
                .sorted()
                .forEachOrdered(System.out::println);  // Output not shown intentionally.


        System.out.println("------------Create a new one------------------------");
        ZoneId estZID = ZoneId.of("US/Eastern");              // Create a time zone ID.
        System.out.println(estZID);                           // US/Eastern
        System.out.println(ZoneId.systemDefault());           // Europe/Oslo

        System.out.println("------------Transition Rules----------------------");
        System.out.println(ZoneId.systemDefault().getRules().getTransitionRules());

    }
}
