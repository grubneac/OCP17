package questions;

public class RQ4 {
    static Thread makeThread(String id, boolean daemon) {
        Thread t = new Thread(() -> System.out.println(id), id);
        t.setDaemon(daemon);
        t.start();
        return t;
    }

    public static void main(String[] args) {
        Thread a = makeThread("A", false);
        Thread b = makeThread("B", true);
        System.out.println("End");
    }
}

/*
* Select the two correct answers.

a. The letter A is always printed.
b. The letter B is always printed.
c. The letter A is never printed after End.
d. The letter B is never printed after End.
e. The program might print B, End, and A, in that order.
* */