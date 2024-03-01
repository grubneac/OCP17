import java.util.Random;

public class RandomDiceStatistics {
    public static void main(String[] args) {
        int[] statisticArr = new int[7];
        int currInt;
        var random = new Random(2);
        for (int i = 0; i < 1_000_0000; i++) {
//            currInt = (int) (Math.random() * 6) + 1;
            currInt = 1 + random.nextInt(6);
            statisticArr[currInt]++;

        }

        System.out.println("Random function statistic result:");
        for (int i = 0; i < statisticArr.length; i++) {
            if (statisticArr[i] > 0)
                System.out.println("Num " + i + " times: " + statisticArr[i]);
        }
    }
}
