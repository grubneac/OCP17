package questions;

public class RQ1 extends Thread {
    public RQ1(String s) { msg = s; }
    String msg;
    public void run() {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        new RQ1("Hello");
        new RQ1("World");
    }
}

/*
* Select the one correct answer.

a. The program will fail to compile.
b. The program will compile without errors and will print Hello and World, in that order, every time it is run.
c. The program will compile without errors, and will print a never-ending stream of Hello and World.
d. The program will compile without errors, and will print Hello and World when run, but the order is unpredictable.
e. The program will compile without errors, and will simply terminate without any output when run.
* */
