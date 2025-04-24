package q37;

public class Syncher2 {
    static final int[] intArray = new int[2];

    private static void pause() {
        while (intArray[0] == 0) {
            try { intArray.wait(); }
            catch (InterruptedException ie) {
                System.out.println(Thread.currentThread() + " interrupted.");
            }
        }
    }

    public static void main (String[] args) {
        Thread runner = new Thread() {
            public void run() {
                synchronized (intArray) {
                    pause();
                    System.out.println(intArray[0] + intArray[1]);
                }}};

        runner.start();
        intArray[0] = intArray[1] = 10;
        synchronized(intArray) {
            intArray.notify();
        }
    }
}
/*Select the one correct answer.

a. The program will fail to compile.
b. The program will compile. When run, it will throw an exception.
c. The program will compile and continue running once started, but will not print anything.
d. The program will compile. When run, it will print 0 and terminate normally.
e. The program will compile. When run, it will print 20 and terminate normally.
f. The program will compile. When run, it will print some number other than 0 or 20, and terminate normally.
* */