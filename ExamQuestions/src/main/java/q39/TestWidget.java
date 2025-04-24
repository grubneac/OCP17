package q39;

import java.time.*;
public class TestWidget {
    public static void main(String[] args) {
        Widget<String> t1 = new Widget<>("ACME");
        t1.compute(v -> v.length());
        System.out.println(Widget.getResult());
        t1.compute(v -> v.indexOf("C"));
        System.out.println(Widget.getResult());
        Widget<LocalDate> t2 = new Widget<>(LocalDate.of(2020, 10, 20));
        t2.compute(v -> v.getDayOfMonth());
        System.out.println(Widget.getResult());
    }
}
/*What is the result?
Select the one correct answer.

a. 23
b. 24
c. 25
d. 13
e. 14
f. 15
g. The code will throw an exception at runtime.
h. The code will fail to compile.
* */