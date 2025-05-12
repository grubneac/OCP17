package q41;

import java.time.*;
import java.time.format.DateTimeFormatter;
public class Q700A12 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(0, 1, 1);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yy G");
        System.out.println(d.format(dtf));
    }
}

/*
* What is the result?
Select the one correct answer.

a. 01 01 01 BC
b. 00 01 01 BC
c. 01 01 01 AD
d. 00 01 01 AD
* */