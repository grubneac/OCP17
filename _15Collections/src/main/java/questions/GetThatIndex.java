package questions;

import java.util.Arrays;
public class GetThatIndex {
    public static void main(String[] args) {

        if (args.length != 1) return;
        printIndex(args[0]);
    }

    public static void printIndex(String key) {
        String[] strings = {"small", "smaller", "smallest", "tiny"};
        System.out.println(Arrays.binarySearch(strings, key));
    }
}

/*
* Select the two correct answers.

a. The largest value ever printed by the printIndex() method is 3.
b. The largest value ever printed by the printIndex() method is 4.
c. The largest value ever printed by the printIndex() method is 5.
d. The smallest value ever printed by the printIndex() method is 0.
e. The smallest value ever printed by the printIndex() method is -4.
f. The smallest value ever printed by the printIndex() method is -5.
g. The smallest value ever printed by the printIndex() method is -3.
* */