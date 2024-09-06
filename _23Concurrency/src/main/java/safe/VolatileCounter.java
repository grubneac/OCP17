package safe;
public class VolatileCounter implements ICounter {                          // (2)
    private volatile int counter = 0;

    @Override public int getValue()   { return counter; }
    @Override public void increment() { ++counter; }
}