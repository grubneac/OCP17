package questions;

import java.util.ArrayList;
import java.util.List;

public class RQ12A20 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Anna"); strList.add("Ada"); strList.add(null);
        strList.add("Bob"); strList.add("Bob"); strList.add("Adda");
        for (int i = 0; i < strList.size(); ++i) {
            if (strList.get(i).equals("Bob")) {
                System.out.print(i);
            }
        }
        System.out.println();
    }
}

/*
* Select the one correct answer.

a. The program will fail to compile.

b. The program will throw an IndexOutOfBoundsException at runtime.

c. The program will throw a NullPointerException at runtime.

d. The program will print 34.
* */
