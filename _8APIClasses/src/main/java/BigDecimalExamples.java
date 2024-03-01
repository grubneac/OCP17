import java.math.BigDecimal;

public class BigDecimalExamples {
    public static void main(String[] args) {
        BigDecimal price     = new BigDecimal("2.99");
        BigDecimal tax       = new BigDecimal("0.25");
        BigDecimal quantity  = BigDecimal.TEN.pow(3);
        BigDecimal totalCost = price.add(price.multiply(tax)).multiply(quantity);
        System.out.println(totalCost);
    }
}
