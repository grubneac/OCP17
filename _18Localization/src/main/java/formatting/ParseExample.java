package formatting;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParseExample {
    public static void main(String[] args) throws ParseException {
        Locale locNOR = new Locale("no", "NO");                 // Norway
        NumberFormat nfNOR = NumberFormat.getNumberInstance(locNOR);
        Locale locUS = Locale.US;
        NumberFormat nfUS = NumberFormat.getNumberInstance(locUS);
        System.out.println(nfNOR.parse("9876.598"));     // (1) 9876
        System.out.println(nfNOR.parse("9876,598"));     // (2) 9876.598

        System.out.println(nfUS.parse("9876.598"));      // (3) 9876.598
        System.out.println(nfUS.parse("9876,598"));      // (4) 9876598

        DecimalFormat dfUS = (DecimalFormat) nfUS;
        dfUS.setParseBigDecimal(true);
        BigDecimal bd = (BigDecimal) dfUS.parse("9876,598");
        System.out.println(bd);

        NumberFormat cfNOR = NumberFormat.getCurrencyInstance(locNOR);
        System.out.println(cfNOR.parse("kr\u00a09876.59"));        // (1) 9876
        System.out.println(cfNOR.parse("kr\u00a09876,59"));        // (2) 9876.59
        System.out.println(cfNOR.parse("kr\u00a09 876,59"));       // (3) 9
        System.out.println(cfNOR.parse("kr\u00a09\u00a0876,59"));  // (4) 9876.59

        NumberFormat cfUS = NumberFormat.getCurrencyInstance(locUS);
        System.out.println(cfUS.parse("$9876.59"));                // (5) 9876.59

        NumberFormat pfNOR = NumberFormat.getPercentInstance(locNOR);
        System.out.println(pfNOR.parse("15,75\u00a0%"));           // (1) 0.1575
        NumberFormat pfUS = NumberFormat.getPercentInstance(locUS);
        System.out.println(pfUS.parse("25.5%"));                   // (2) 0.255
    }
}
