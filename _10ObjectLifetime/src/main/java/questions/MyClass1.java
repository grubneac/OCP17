package questions;

public class MyClass1 {
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1(n);
    }


    static int i = 5;
    static int n;
    int j = 7;
    int k;

    public MyClass1(int m) {

        System.out.println(i + ", " + j + ", " + k + ", " + n + ", " + m);
    }
    { j = 70; n = 20; } // Instance initializer block
    static { i = 50; }  // Static initializer block
}
/*
*Select the one correct answer.

a. The code will fail to compile because of the instance initializer block.

b. The code will fail to compile because of the static initializer block.

c. The code will compile and print 50, 70, 0, 20, 0 at runtime.

d. The code will compile and print 50, 70, 0, 20, 20 at runtime.

e. The code will compile and print 5, 70, 0, 20, 0 at runtime.

f. The code will compile and print 5, 70, 0, 20, 20 at runtime.

g. The code will compile and print 5, 7, 0, 20, 0 at runtime.

h. The code will compile and print 5, 7, 0, 20, 20 at runtime.
* */