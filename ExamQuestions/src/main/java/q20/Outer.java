package q20;

public class Outer {
    private int a = 1;
    private int b = 1;
    private int c = 1;

    class Inner {
        private int a = 2;
        int get() {
            int c = 3;
            // (1) INSERT CODE HERE
            c = b;
            return c;
        }
    }
    Outer() {
        Inner i = new Inner();
        System.out.println(i.get());
    }

    public static void main(String[] args) {
        new Outer();
    }
}
/*Which of the following statements, when inserted at (1), will make the program print 1 when executed?
Select the two correct answers.

a. c = b;
b. c = this.a;
c. c = this.b;
d. c = Outer.this.a;
e. c = c;
* */