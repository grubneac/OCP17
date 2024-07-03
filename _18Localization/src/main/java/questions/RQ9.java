package questions;

import java.time.*;
import java.time.format.*;
import java.util.*;
public class RQ9 {
    public static void main(String[] args) {
        LocalDateTime foolsDay = LocalDateTime.of(2021, Month.APRIL, 1, 14, 30, 0);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("day")
                .localizedBy(Locale.UK);
        System.out.print(df.format(foolsDay));
    }
}

/*
* What is the result?
Select the one correct answer.

a. 1
b. 01
c. 1am
d. 1am21
e. 1am2021
f. 1pm
g. 1pm21
h. 1pm2021
i. The program will throw an exception at runtime.
* */
