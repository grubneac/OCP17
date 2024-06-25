package formatting;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompactNumberFormatting {
    public static void main(String[] args) {
        NumberFormat shortCompactFormat = NumberFormat.getCompactNumberInstance(
                Locale.US, NumberFormat.Style.SHORT);
        NumberFormat longCompactFormat = NumberFormat.getCompactNumberInstance(
                Locale.US, NumberFormat.Style.LONG);

        System.out.println(shortCompactFormat.format(9_400_000));   // 9M
        System.out.println(longCompactFormat.format(9_400_000));    // 9 million
        System.out.println(shortCompactFormat.format(12_500));      // 12.5K
        System.out.println(longCompactFormat.format(12_500));       // 12.5 thousand

        //-----------Parsing
        try {
            System.out.println(shortCompactFormat.parse("9M"));        // 9000000
            System.out.println(longCompactFormat.parse("9 million"));  // 9000000
            System.out.println(shortCompactFormat.parse("2K"));        // 2000
            System.out.println(longCompactFormat.parse("1.5 thousand"));  // 1500
        } catch (ParseException pe) {
            System.out.println(pe);
        }
    }
}
