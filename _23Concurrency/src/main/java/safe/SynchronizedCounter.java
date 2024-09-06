package safe;
public class SynchronizedCounter implements ICounter {                          // (2)
    private int  counter = 0;

    @Override public  synchronized int getValue()   { return counter; }
    @Override public synchronized void increment() { ++counter; }
}