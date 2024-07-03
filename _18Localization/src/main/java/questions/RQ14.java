package questions;

import java.text.*;
public class RQ14 {
    public static void main(String[] args) {
        double[] limits = {0,1,2,3,4};
        String[] formats = {"zero","{1}st","{1}nd","{1}rd","{1}th"};
        ChoiceFormat cf = new ChoiceFormat(limits, formats);
        MessageFormat mf = new MessageFormat("{0}");
        mf.setFormat(0, cf);
        Object[] values = {4,5};
        System.out.println(mf.format(values));
    }
}

/*
* What is the result?
Select the one correct answer.

a. 4th
b. 5th
c. {1}th
d. The program will throw an exception at runtime.
* */