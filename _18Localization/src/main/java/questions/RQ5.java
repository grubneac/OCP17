package questions;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class RQ5 {
    public static void main(String[] args) {
        // (1) INSERT CODE HERE
        String pattern = "#.0#";
        double value = 0.456;
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        df.applyPattern(pattern);
        String output = df.format(value);
        System.out.printf("|%s|", output);
    }
}

/*
* Which code, when inserted independently at (1), will result in the following output: |.46|?
Select the five correct answers.

a. String pattern = ".00";
b. String pattern = ".##";
c. String pattern = ".0#";
d. String pattern = "#.00";
e. String pattern = "#.0#";
f. String pattern = "#.##";
g. String pattern = ".#0";
*
* */