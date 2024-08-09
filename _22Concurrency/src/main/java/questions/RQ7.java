package questions;

public class RQ7 {
    private boolean isEmpty = true;

    public synchronized void emptying() {
        pause(true);
        isEmpty = !isEmpty;
        System.out.println("emptying");
        notify();
    }

    public synchronized void filling() {
        pause(false);
        isEmpty = !isEmpty;
        System.out.println("filling");
        notify();
    }

    private void pause(boolean flag) {
        while (flag ? isEmpty : !isEmpty) {
            try {
                wait();
            } catch (InterruptedException ie) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        final RQ7 token = new RQ7();
        new Thread(() -> {for(;;) token.emptying();}, "A").start();
        new Thread(() -> {for(;;) token.filling();}, "B").start();
    }
}
/*
* What will be the result of compiling and running the following program?
*
* Select the one correct answer.
a. The program will compile and continue running once started, but will not print anything.
b. The program will compile and continue running once started, printing only the string "emptying".
c. The program will compile and continue running once started, printing only the string "filling".
d. The program will compile and continue running once started, always printing the string "filling" followed by the string "emptying".
e. The program will compile and continue running once started, printing the strings "filling" and "emptying" in some order.
* */