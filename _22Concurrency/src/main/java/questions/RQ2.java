package questions;

class R1 implements Runnable {
    public void run() {
        System.out.print(Thread.currentThread().getName());
    }
}
public class RQ2 implements Runnable {
    public void run() {
        new Thread(new R1(),"|R1a|").run();
        new Thread(new R1(),"|R1b|").start();
        System.out.print(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new Thread(new RQ2(),"|R2|").start();
    }
}

/*
* Select the one correct answer.

a. The program will fail to compile.
b. The program will compile without errors, and will print |R1a| twice and |R2| once, in some order, every time it is run.
c. he program will compile without errors, and will print|R1b| twice and |R2| once, in some order, every time it is run.
d. The program will compile without errors, and will print |R1b| once and |R2| twice, in some order, every time it is run.
e. The program will compile without errors, and will print |R1a| once, |R1b| once, and |R2| once, in some order, every time it is run.
* */