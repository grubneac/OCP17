package questions;

import java.util.ArrayList;
import java.util.List;

public class RQ12A30 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Anna"); strList.add("Ada");
        strList.add("Bob"); strList.add("Bob");
        for (int i = 0; i < strList.size(); ++i) {
            if (strList.get(i).equals("Bob")) {
                strList.remove(i);
            }
        }
        System.out.println(strList);
    }
}

/*
* Select the one correct answer.

a. The program will fail to compile.

b. The program will throw an IndexOutOfBoundsException at runtime.

c. The program will throw a NullPointerException at runtime.

d. The program will throw a ConcurrentModificationException at runtime.

e. The program will not terminate when run.

f. The program will print [Anna, Ada, Bob].

g. The program will print [Anna, Ada].
* */