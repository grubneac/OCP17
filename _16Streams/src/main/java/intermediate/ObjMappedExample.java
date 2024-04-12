package intermediate;

import java.util.List;
import java.util.stream.IntStream;

public class ObjMappedExample {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 3)                          // (1) IntStream
                .mapToObj(n -> List.of(n, n*n))             // (2) Stream<List<Integer>>
                .forEach(p -> System.out.print(p + " "));   // [1, 1] [2, 4] [3, 9]
        System.out.println("\n-------------------------------");

        IntStream.rangeClosed(1, 3)                          // (3) IntStream
                .boxed()                                    // (4) Stream<Integer>
                .map(n -> List.of(n, n*n))                  // (5) Stream<List<Integer>>
                .forEach(p -> System.out.print(p + " "));   // [1, 1] [2, 4] [3, 9]

        System.out.println("\n-------------------------------");
        IntStream.rangeClosed(1, 3)                           // IntStream
                .flatMap(i -> IntStream.rangeClosed(1, 4))   // IntStream
                .forEach(n -> System.out.printf("%d ", n));  // 1 2 3 4 1 2 3 4 1 2 3 4

        System.out.println("\n-------------------------------");
        IntStream.rangeClosed(1, 3)                           // IntStream
                .asDoubleStream()                            // DoubleStream
                .map(Math::sqrt)                      // DoubleStream
                .forEach(d -> System.out.printf("%.2f ", d));// 1.00 1.41 1.73
        System.out.println("\n-------------------------------");
        IntStream.rangeClosed(1, 3)                           // IntStream
                .boxed()                                     // Stream<Integer>
                .map(n -> Math.sqrt(n))                      // Stream<Double>
                .forEach(d -> System.out.printf("%.2f ", d));// 1.00 1.41 1.73
    }
}
