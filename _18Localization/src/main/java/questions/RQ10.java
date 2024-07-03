package questions;

import java.time.*;
import java.time.format.*;
import java.util.*;
public class RQ10 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2021, Month.APRIL, 1);
        Locale.setDefault(Locale.UK);
        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        String s1 = df.format(d);
        Locale.setDefault(Locale.FRANCE);
        String s2 = df.format(d);
        df.localizedBy(Locale.US);
        String s3 = df.format(d);
        if("Apr 1, 2021".equals(s1)) {
            System.out.print("UK ");
        }
        if("1 avr. 2021".equals(s2)) {
            System.out.print("FR ");
        }
        if("1 Apr 2021".equals(s3)) {
            System.out.println("US");
        }
    }
}
/*
* What is the result?
Select the one correct answer.

a. UK FR US
b. UK US
c. UK FR
d. FR US
e. UK
f. FR
g. US
* */