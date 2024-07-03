package questions;

import java.time.*;
import java.time.format.*;
import java.util.*;
public class RQ17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        LocalDate d = LocalDate.parse("2021-04-01");    // (1)
        d = LocalDate.parse("4/1/21", dtf);              // (2)
        System.out.println(d);
    }
}
/*
* What is the result?
Select the one correct answer.

a. Apr 1, 2021
b. 4/1/21
c. 2021-04-01
d. The program will throw a runtime exception at (1).
e. The program will throw a runtime exception at (2).
* */