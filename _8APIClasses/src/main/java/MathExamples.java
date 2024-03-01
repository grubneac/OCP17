import static java.lang.System.out;

public class MathExamples {
    public static void main(String[] args) {
        out.println(Integer.MAX_VALUE + 1);                 // (1a) -2147483648
//        out.println(Math.addExact(Integer.MAX_VALUE, 1));   // (1b) ArithmeticException
        out.println(Math.addExact(1_000_000, 1_000));       // (1c) 1001000
        out.println(Integer.MAX_VALUE * 100);               // (2a) -100
//        out.println(
//                Math.multiplyExact(Integer.MAX_VALUE, 100)     // (2b) ArithmeticException
//        );
        out.println(Math.multiplyExact(1_000_000, 1_000));  // (2c) 1000000000

        out.println((int)Long.MAX_VALUE);                   // (3a) -1
//        out.println(Math.toIntExact(Long.MAX_VALUE));       // (3b) ArithmeticException
        out.println(Math.toIntExact(1_000_000));            // (3c) 1000000
    }
}
