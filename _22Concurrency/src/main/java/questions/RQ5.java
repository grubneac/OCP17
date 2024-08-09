package questions;

public class RQ5 extends Thread {

    public synchronized void run() {                                              // (1)
        while (true) {                                                 // (2)
            try {                                                        // (3)
                System.out.print(":");                                   // (4)
                sleep(100);                                              // (5)
                System.out.print("-");                                   // (6)
                sleep(100);                                              // (7)
                System.out.println(")");                                 // (8)
                sleep(100);                                              // (9)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new RQ5().start();
        new RQ5().start();
    }
}

/*
* Given the following program, which code modifications will result in both threads being able to participate
* in printing one smiley face (:-)) on a line continuously?
*
* Select the two correct answers.
a. Synchronize the run() method at (1) with the keyword synchronized.
b. Synchronize the while loop at (2) with a synchronized(Smiley.class) statement.
c. Synchronize the try-catch construct at (3) with a synchronized(Smiley.class) statement.
d. Synchronize the statements from (4) to (9) with a synchronized(Smiley.class) statement.
e. Synchronize each statement at (4), (6), and (8) individually with a synchronized (Smiley.class) statement.
* */
