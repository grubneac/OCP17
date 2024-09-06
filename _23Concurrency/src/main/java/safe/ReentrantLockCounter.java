package safe;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockCounter implements ICounter {                          // (2)
    private ReentrantLock lock = new ReentrantLock();
    private int counter = 0;

    @Override public int getValue()   { return counter; }
    @Override public void increment() {
        lock.lock();
        try {
            counter++;
        }finally {
            lock.unlock();
        }
    }
}