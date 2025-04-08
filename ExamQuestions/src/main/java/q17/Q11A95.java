package q17;

import java.time.*;
import java.time.format.*;

import java.time.*;
import java.time.format.*;

public class Q11A95 {
    public static void main(String[] args) {
        String inputStr = "The time is 15 minutes past 10PM.";
        String pattern = "'The time is 'm' minutes past 'ha.";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        // (1) INSERT CODE HERE
    }
}
/*Which code, when inserted at (1), will make the program compile and execute normally?
* Select the three correct answers.

a. LocalTime time = LocalTime.parse(inputStr, dtf);
b. LocalDate date = LocalDate.parse(inputStr, dtf);
c. LocalDateTime dateTime = LocalDateTime.parse(inputStr, dtf);
d. String timeStr = LocalTime.of(9, 20).format(dtf);
e. String dateStr = LocalDate.of(2015, 12, 24).format(dtf);
f. String dateTimeStr = LocalDateTime.of(2015, 12, 24, 22, 15).format(dtf);
*
* */