package q42;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Comparable<?>[] values = {LocalDate.of(2022, Month.JANUARY, 1),
                LocalDate.of(2022, Month.FEBRUARY, 5),
                Integer.valueOf(3),
                LocalDateTime.of(2022, Month.JANUARY, 22, 1, 12, 2),
                "4"};
        long result = Arrays.stream(values)
                .mapToInt(v -> (v instanceof LocalDateTime ldt)
                        ? ldt.toLocalTime().getSecond() : 1)
                .sum();
        System.out.println(result);
    }
}
/*
*What is the result?
Select the one correct answer.

a. 2
b. 4
c. 6
d. 8
e. The code will throw an exception at runtime.
* */