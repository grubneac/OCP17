package q40;

import java.util.*;

public class Test13A10 {
    public static void main(String[] args) {
        Integer[] values = {4, 2, 6, 3, 5};
        Arrays.sort(values, (x, y) -> x - y);
        System.out.println(Arrays.toString(values));
    }
}
/*What is the result?
Select the one correct answer.

a. [4, 2, 6, 3, 5]
b. [2, 3, 4, 5, 6]
c. [6, 5, 4, 3, 2]
d. [2, -4, 3, -2]
e. The code will throw an exception at runtime.
f. The code will fail to compile.
* */
