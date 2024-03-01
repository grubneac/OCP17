public class IntegerMaxMin {
    public static void main(String[] args) {
        Integer iMax = Integer.MAX_VALUE;
        Integer iMin = Integer.MIN_VALUE;

        System.out.println("IMax = " + iMax);
        System.out.println("IMin = " + iMin);
        System.out.println("IMax + 1 = " + (iMax + 1));
        System.out.println("IMin - 1 = " + (iMin - 1));

        long notTooBig   = Integer.MAX_VALUE + 1L;   //  2147483648L in range.
        long notTooSmall = Integer.MIN_VALUE - 1L;   // -2147483649L in range.
        System.out.println("notTooBig: " + notTooBig);
        System.out.println("notTooSmall: " + notTooSmall);

        System.out.println( 4D / 0);         // Prints:  Infinity
        System.out.println(-4.0 / 0.0);         // Prints: -Infinity

        System.out.println("NaN: " + 0.0 / 0.0); // Prints: NaN

    }
}
