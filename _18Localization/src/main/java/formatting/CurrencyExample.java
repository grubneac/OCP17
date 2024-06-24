package formatting;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyExample {
    public static void main(String[] args) {
        double num = 12345.6789;                                // (1a)
//        BigDecimal num1 = new BigDecimal("12345.6789");       // (1b)

        Locale locNOR = new Locale("no", "NO");                 // Norway
        NumberFormat nfNOR = NumberFormat.getNumberInstance(locNOR);
        System.out.println(nfNOR.format(num));                  // 12 345,679

        NumberFormat nfUS = NumberFormat.getNumberInstance(Locale.US);
        System.out.println(nfUS.format(num));                   // 12,345.679

        NumberFormat cfNOR = NumberFormat.getCurrencyInstance(locNOR);
        String formattedCurrStr = cfNOR.format(num);
        System.out.println(formattedCurrStr);              // kr 12 345,68 (with 2 nbsp)

        NumberFormat cfUS = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedCurrStrUS = cfUS.format(num);
        System.out.println(formattedCurrStrUS);            // $12,345.68
    }
}
