package questions;

public class RQ4 {
    private static volatile int counter = 10;
    public static void main(String[] args) {
        Runnable r = () -> counter--;
        while (counter > 0) {
            new Thread(r).start();
            System.out.print(counter);
        }
    }
}
/*
* What is the result?
Select the one correct answer.

a. Either 9876543210 or 876543210-1 or 987654321
b. Either 9876543210 or 10987654321 or 987654321
c. 9876543210
d. The result is unpredictable.
* */