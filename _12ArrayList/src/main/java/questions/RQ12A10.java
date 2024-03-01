package questions;

import java.util.ArrayList;
import java.util.List;

public class RQ12A10 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Anna"); strList.add("Ada"); strList.add("Ada");
        strList.add("Bob"); strList.add("Bob"); strList.add("Adda");
        for (int i = 0; i < strList.size(); /* empty */) {
            if (strList.get(i).length() <= 3) {
                strList.remove(i);
            } else {
                ++i;
            }
        }
        System.out.println(strList);
    }
}

/*
* Select the one correct answer.

a. The program will fail to compile.

b. The program will throw an IndexOutOfBoundsException at runtime.

c. The program will throw a ConcurrentModificationException at runtime.

d. The program will not terminate when run.

e. The program will print [Anna, Adda].

f. The program will print [Anna, Ada, Bob, Adda].
* */