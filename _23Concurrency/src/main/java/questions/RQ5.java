package questions;

import java.util.concurrent.*;
public class RQ5 {
    public static void main(String[] args) {
        try {
            ExecutorService es = Executors.newFixedThreadPool(2);
            Future<?> f1 = es.submit(() -> "acme");
            Future<?> f2 = es.submit(() -> {
            }); // (1)
            es.shutdown();                      // (2)
            Object o1 = f1.get();
            Object o2 = f2.get();               // (3)
            System.out.println(o1 + " " + o2);  // (4)
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
/*
* What is the result?
Select the one correct answer.

a. An exception is thrown at (1).
b. An exception is thrown at (2).
c. An exception is thrown at (3).
d. An exception is thrown at (4).
e. acme null
f. acme
* */

