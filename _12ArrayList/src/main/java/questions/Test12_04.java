package questions;

import java.util.*;
public class Test12_04 {
    public static void main(String[] args) {
        Song[] playArray1 = {new Song("a"), new Song("b")};
        List<Song> playlist = Arrays.asList(playArray1);
        Song[] playArray2 = playlist.toArray(new Song[]{});
        playArray1[1].update();
        System.out.print(playArray1[1]);
        System.out.print(playlist.get(1));
        System.out.print(playArray2[1]);
    }
}

/*
Select the one correct answer.

a. Bbb

b. BBb

c. BBB

d. bbb

e. The program will throw an exception at runtime.

f. The program will fail to compile.
* */