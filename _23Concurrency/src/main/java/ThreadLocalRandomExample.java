import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class ThreadLocalRandomExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(ThreadLocalRandom.current().nextInt(1, 7));
        }
        IntStream intStream = ThreadLocalRandom.current().ints(10);
        System.out.println(intStream.count());
    }
}
