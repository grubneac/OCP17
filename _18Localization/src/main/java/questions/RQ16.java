package questions;

import java.time.*;
import java.time.format.*;
import java.util.*;
public class RQ16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        LocalDate d = LocalDate.parse("Apr 1, 2021", dtf);  // (1)
        d = LocalDate.parse("2021-04-01");                  // (2)
        String s = d.format(dtf);                           // (3)
        System.out.println(s);
    }
}
/*
* What is the result?
Select the one correct answer.

a. Apr 1, 2021
b. 2021-04-01
c. The program will throw a runtime exception at (1).
d. The program will throw a runtime exception at (2).
e. The program will throw a runtime exception at (3).
* */