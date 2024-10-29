package questions;

import java.util.concurrent.locks.*;
public class RQ3 {
    public static void main(String[] args) {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        Lock rl = rwl.readLock();
        Lock wl = rwl.writeLock();
        try {
            rl.lock();
            System.out.println("Read lock acquired");
            if (wl.tryLock()) {
                System.out.println("Write lock acquired");
            }
        } catch(Exception e) {
            System.out.println("Lock acquisition failed");
        } finally {
            rl.unlock();
            if (rwl.isWriteLocked()) {
                wl.unlock();
                System.out.println("Write lock released");
            }
        }
        System.out.println("The end");
    }
}
/*
* What is the result?
Select the one correct answer.

a. Read lock acquired The end
b. Read lock acquired Write lock acquired Write lock released The end
c. Read lock acquired Lock acquisition failed The end
d. Lock acquisition failed The end
e. Lock acquisition failed Write lock released The end
* */
