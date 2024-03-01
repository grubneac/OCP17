package overloading_examples;

public class RQ800A20 {
    static void compute(int... ia) {                             // (1)
        System.out.print("|");
        for(int i : ia) {
            System.out.print(i + "|");
        }
        System.out.println();
    }
    static void compute(int[] ia1, int... ia2) {                 // (2)
        compute(ia1);
        compute(ia2);
    }
    static void compute(int[] ia1, int[]... ia2d) {               // (3)
        for(int[] ia : ia2d) {
            compute(ia);
        }
    }
    public static void main(String[] args) {
        Object x = "acme";
        if (x instanceof String s && s.length() > 5) {
            x = s.equals("acme") ? "1" : "2";
        } else {
            System.out.println("Err");
        }
        System.out.println(x);

    }
}