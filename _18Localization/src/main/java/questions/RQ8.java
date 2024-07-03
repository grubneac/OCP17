package questions;

import java.time.*;
import java.time.format.*;
import java.util.*;
public class RQ8 {
    public static void main(String[] args) {
        LocalDate foolsDay = LocalDate.of(2021, Month.APRIL, 1);
        DateTimeFormatter df = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT)
                .localizedBy(Locale.UK);
        System.out.print(df.format(foolsDay));
    }
}


/*
* What is the result?
Select the one correct answer.

a. 04/01/2021
b. 01/04/2021
c. The program will throw an exception at runtime.
d. The program will fail to compile.
*
* */
