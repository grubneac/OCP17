package questions;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class RQ6 {
    public static void main(String[] args) {
        Map<Integer, String> map =
                new ConcurrentHashMap<>(Map.of(1,"a",2,"b",3,"c",4,"d",5,"e"));
        List<Future<String>> results = new CopyOnWriteArrayList<>();

        ExecutorService es = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= map.size(); i++) {
            final int key = i;
            Future<String> f = es.submit(() -> map.get(key).toUpperCase());
            if (i % 2 != 0) {
                f.cancel(true);
            }

            results.add(f);
        }
        es.shutdown();
        String result = (results.stream().allMatch(r -> r.isDone()))
                ? results.stream().filter(r -> !r.isCancelled()).map(r -> {
            try {
                return r.get();
            } catch (InterruptedException | ExecutionException e) {
                return "X";
            }
        }).collect(Collectors.joining())
                : "Z";
        System.out.println(result);
    }
}

/*
* Which of the following statements are true about the result of this program? Select the two correct answers.

a. The program terminates with an exception.
b. The program only prints the letters B or D.
c. The program never prints the letters B or D.
d. The program only prints the letters A, C, or E.
e. The program never prints the letters A, C, or E.
f. The program may print the letters A, B, C, D, or E.
g. The program may print the letter X.
h. The program may print the letter Z.
* */