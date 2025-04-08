package q16;

import java.time.LocalDate;

public class Q11A35 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 1, 1);
        date.withYear(5);
        System.out.println(date.plusMonths(12));
    }
}

/*
* Select the one correct answer.

a. The program will fail to compile.
b. The program will throw an exception at runtime.
c. The program will print 0006-01-01.
d. The program will print 2021-01-01.
e. The program will print 2015-01-01.
f. The program will print 2016-01-01.
*
* */
