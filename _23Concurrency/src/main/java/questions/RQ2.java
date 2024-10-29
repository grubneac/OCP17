package questions;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
public class RQ2 {
    public static void main(String[] args) {
        AtomicLong aValue = new AtomicLong(0);
        Callable<Number> c = () -> {
            AtomicLong value = aValue;
            return value.incrementAndGet();
        };

        Collection<Callable<Number>> cc = List.of(c, c, c);
        ExecutorService es = Executors.newFixedThreadPool(2);
        List<Future<Number>> futures = null;
        try {
            futures = es.invokeAll(cc);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        es.shutdown();

        futures.stream().mapToLong(v-> {
            try {
                return v.get().longValue();
            }catch(Exception e) {
                return -1;
            }}).forEach(v->System.out.print(v));
        System.out.print(aValue);
    }
}

/*
* Which of the following output can be produced by this program? Select the two correct answers.

a. 1233
b. 2133
c. 1122
d. 2122
e. 2123
* */