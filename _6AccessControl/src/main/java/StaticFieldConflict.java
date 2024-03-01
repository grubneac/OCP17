//import static java.lang.Integer.MAX_VALUE;
//import static java.lang.Double.MAX_VALUE;

public class StaticFieldConflict {
    public static void main(String[] args) {
//        System.out.println(MAX_VALUE);          // (1) Ambiguous! Compile-time error!
        System.out.println(Integer.MAX_VALUE);  // OK
        System.out.println(Double.MAX_VALUE);   // OK
    }
}