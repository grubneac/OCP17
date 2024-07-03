package questions;

import java.text.*;
import java.time.*;
import java.time.format.*;
public class RQ12 {
    public static void main(String[] args) {
        ZoneId london = ZoneId.of("Europe/London");
        ZoneId paris = ZoneId.of("Europe/Paris");
        LocalDateTime date1 = LocalDateTime.parse("2021-01-01T01:01:01",
                DateTimeFormatter.ISO_DATE_TIME);
        ZonedDateTime date2 = date1.atZone(london);
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("hz")
                .withZone(london);
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("hz")
                .withZone(paris);
        String result = MessageFormat.format("{0} {1} {2} {3}",
                df1.format(date1), df1.format(date2),
                df2.format(date1), df2.format(date2));
        System.out.println(result);
    }
}

/*
* Given that London (GMT) and Paris (CET) time zones are exactly one hour apart, what is the result?
Select the one correct answer.

a. 1GMT 1GMT 1CET 2CET
b. 1GMT 2GMT 1CET 2CET
c. 1GMT 1CET 1CET 2CET
d. 1GMT 2CET 1GMT 2CET
e. 1GMT 1GMT 2CET 2CET
* */
