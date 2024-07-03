package questions;

import java.text.*;
public class RQ15 {
    public static void main(String[] args) {
        double[] limits = {0,-1,1};
        String[] formats = {"zero","negative","positive"};
        ChoiceFormat cf = new ChoiceFormat(limits, formats);
        MessageFormat mf = new MessageFormat("{0}");
        mf.setFormat(0, cf);
        Object[] values = {0.9};
        System.out.println(mf.format(values));
    }
}
/*
* What is the result?
Select the one correct answer.

a. zero
b. negative
c. positive
d. The program will throw an exception at runtime.
*
* */
