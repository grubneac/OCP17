package questions;

public class RQ3 extends Thread {
    RQ3(String name) {
        super(name);
    }
    public void run() throws IllegalThreadStateException {
        System.out.println(Thread.currentThread().getName());
        throw new IllegalThreadStateException();
    }

    public static void main(String[] args) {
        new RQ3("|T1|").start();
    }
}

/*
* Select the one correct answer.

a. The program will fail to compile.
b. The program will compile without errors, will print |T1|, and will terminate normally every time it is run.
c. The program will compile without errors, will print|T1|, and will throw an unchecked IllegalThreadStateException every time it is run.
d. None of the above
* */