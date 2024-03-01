package questions;

public class MyClass3 {
    private static String msg(String msg) {
        System.out.println(msg);
        return msg;
    }

    public MyClass3() { m = msg("1"); }

    { m = msg("2"); }

    String m = msg("3");

    public static void main(String[] args) {
        Object obj = new MyClass3();
    }
}
/*
* Select the one correct answer.

a. The program will fail to compile.

b. The program will compile and print 1, 2, and 3 at runtime.

c. The program will compile and print 2, 3, and 1 at runtime.

d. The program will compile and print 3, 1, and 2 at runtime.

e. The program will compile and print 1, 3, and 2 at runtime.
* */