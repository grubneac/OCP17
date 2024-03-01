package labeled_statments;

public class ReturnDemo {

    public static void main (String[] args) { // (1) void method can use return.
        int i = 0;
        int j;
        for (j = 0; j < 10; ++j) {
            i++;
        }
        System.out.println(i + " " + j);
    }



    static void output(int value) {  // (2) void method need not use return.
        System.out.println(value);
//        return 'a';                    // Not OK. Cannot return a value.
    }

    static int checkValue(int i) {   // (3) Non-void method: Any return statement
        //     must return a value.
        if (i > 3)
            return i;                    // OK.
        else
//            return 2.0;                  // Not OK. double not assignable to int.
            return 2;                  // Not OK. double not assignable to int.
    }

    static int absentMinded() {      // (4) Non-void method.
        throw new RuntimeException();  // OK: No return statement provided, but
        // method terminates by throwing an exception.
    }
}