package questions;

import java.util.*;
public class Test12_05 {
    public static void main(String[] args) {
        MySong[] playArray1 = {new MySong("A"), new MySong("B")};
        List<MySong> playlist = List.of(playArray1);
        MySong[] playlist2 = playlist.toArray(new MySong[]{});
        playArray1[0] = new MySong("C");
        System.out.print(playArray1[0]);
        System.out.print(playlist.get(0));
        System.out.print(playlist2[0]);
    }
}

/*
* Select the one correct answer.

a. CCA

b. CAA

c. CCC

d. AAA

e. The program will throw an exception at runtime.

f. The program will fail to compile.
* */