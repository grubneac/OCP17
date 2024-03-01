package questions;

import java.util.*;
public class Test12_06 {
    public static void main(String[] args) {
        List<String> data1 = List.of("A","B","C");
        String[] data2 = data1.toArray(new String[]{"X","Y","Z"});
        data2[1] = data1.get(0).toLowerCase();
        for (String s: data2) {
            System.out.print(s);
        }
    }
}

/*
* Select the one correct answer.

a. AaC

b. AbC

c. XaZ

d. XbZ

e. The program will throw an exception at runtime.

f. The program will fail to compile.
*
* */