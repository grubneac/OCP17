package safe;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter implements ICounter {                          // (2)
    private AtomicInteger counter = new AtomicInteger(0);

    @Override public int getValue()   { return counter.intValue(); }
    @Override public void increment() { counter.incrementAndGet(); }
}