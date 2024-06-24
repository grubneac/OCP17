package formatting;

import java.text.NumberFormat;
import java.util.Locale;

public class PercentExample {
    public static void main(String[] args) {
        double rebate = 0.746;
        Locale locNOR = new Locale("no", "NO");                 // Norway
        NumberFormat pfNOR = NumberFormat.getPercentInstance(locNOR);
        String formattedPStr = pfNOR.format(rebate);
        System.out.println(formattedPStr);                 // 75 %  (with nbsp)

        NumberFormat pfUS = NumberFormat.getPercentInstance(Locale.US);
        String formattedPStrUS = pfUS.format(rebate);
        System.out.println(formattedPStrUS);               // 75%

        System.out.println(pfUS.format(0.745));            // 74%
    }
}
