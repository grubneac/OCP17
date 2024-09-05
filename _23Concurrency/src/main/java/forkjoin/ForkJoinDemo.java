package forkjoin;

import java.time.Instant;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

class FilterTask extends RecursiveTask<Integer> {                        // (1)
    public static final int THRESHOLD = 10_000;
    private final int[] values;
    private final int fromIndex;
    private final int toIndex;
    private final IntPredicate predicate;

    public FilterTask(int[] values, int fromIndex, int toIndex,
                      IntPredicate predicate) {
        this.values = values;
        this.fromIndex = fromIndex;
        this.toIndex = toIndex;
        this.predicate = predicate;
    }

    @Override
    protected Integer compute() {                                          // (2)
        if (toIndex - fromIndex < THRESHOLD) {
            // The base case:                                                     (3)
            var count = 0;
            for (int i = fromIndex; i < toIndex; i++) {
                if (predicate.test(values[i])) {
                    ++count;
                }
            }
            return count;
        } else {
            // Create subtasks:                                                   (4)
            var middel = fromIndex + (toIndex - fromIndex) / 2;
            var subtask1 = new FilterTask(values, fromIndex, middel, predicate);
            var subtask2 = new FilterTask(values, middel, toIndex, predicate);
            // Fork and execute the subtasks. Await completion.                   (5)
            ForkJoinTask.invokeAll(subtask1, subtask2);
            // Combine the results returned by subtasks.                          (6)
            return subtask1.join() + subtask2.join();
        }
    }
}

public class ForkJoinDemo {
    public static void main(String[] args) {
        // Set up the array with the random int values:                         (7)
        final int SIZE = 1_000_000;
        int[] numbers = new Random().ints(SIZE).toArray();

        // Predicate to filter numbers divisible by 7:                          (8)
        IntPredicate predicate = i -> i % 7 == 0;
        Instant start = Instant.now();
        // Create the initial task.                                             (9)
        var filterTask = new FilterTask(numbers, 0, numbers.length, predicate);
        // Create fork-join pool to manage execution of the task.               (10)
        var pool = new ForkJoinPool();
        // Perform the task, await completion, and return the result:           (11)
        var result = pool.invoke(filterTask);
        Instant end = Instant.now();
        System.out.println("Fork/Join:       " + result + " duration: " + (end.getNano() - start.getNano()));

        // Solution using parallel stream:                                      (12)
        start = Instant.now();
        long count = IntStream.range(0, numbers.length).parallel()
                .map(i -> numbers[i]).filter(predicate).count();
        end = Instant.now();
        System.out.println("Parallel stream: " + count + " duration: " + (end.getNano() - start.getNano()));
    }
}