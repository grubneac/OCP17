package safe;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter implements ICounter {                          // (2)
    private final AtomicInteger counter = new AtomicInteger(0);

    @Override public int getValue()   { return counter.intValue(); }
    @Override public void increment() {
        counter.incrementAndGet();
//          while (true) {                                                        // (5)
//            int expectedValue = counter.get();                                  // (6)
//            int newValue = expectedValue + 1;                                   // (7)
//            if (counter.compareAndSet(expectedValue, newValue)) {// (8) Compare and Set.
//              return;                                            // (9)
//            }
//          }
    }
}