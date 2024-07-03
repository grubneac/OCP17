package questions;

import java.text.MessageFormat;
public class RQ13 {
    public static void main(String[] args) {
        String a = "A", b = "B";
        String result = MessageFormat.format("{0}-'{1}'-{3}-{0}-{1}-'{2}'", a, b);
        System.out.println(result);
    }
}

/*
* What is the result?
Select the one correct answer.

a. A-{1}--A-B-{2}
b. A-B--A-B-{2}
c. A-B-{3}-A-B-
d. A-{1}-{3}-A-B-{2}
e. The program will throw an exception at runtime.
* */