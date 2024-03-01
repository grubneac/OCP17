import java.util.Random;

public class TwoRandom {
    public static void main(String[] args) throws InterruptedException {
        var rad1 = new Random(20);
        var rad2 = new Random(20);

        for (int i = 0; i < 10; i++) {
            System.out.print(rad1.nextInt(100) + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(rad2.nextInt(100) + " ");
        }
    }
}
