package questions;

import java.nio.file.*;

public class RQ8 {
    public static void main(String[] args) {
        Path p1 = Path.of("/test");
        Path p2 = Path.of("store");
        System.out.println(p1.resolve(p2));
        System.out.println(p2.resolve(p1));
    }
}

/*
* What is the result?
Select the one correct answer.

* a.
/test/store
/store/test

* b.
/test
/store

* c.
/test/store
/test

* d.
/test/store
/test/store
* */