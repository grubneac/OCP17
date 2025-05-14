package q45;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Localizing {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("q45/resources", new Locale("en"));
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(rb.getString("f1"),
                new Locale("en", "GB"));
        LocalDate d = LocalDate.of(2022, 4, 1);
        System.out.println(fmt.format(d));
    }
}
/*
* What is the result?
Select the one correct answer.

a. 01-Apr-22
b. 22-Apr-01
c. Apr-01-22
d. The code will throw an exception at runtime.
* */