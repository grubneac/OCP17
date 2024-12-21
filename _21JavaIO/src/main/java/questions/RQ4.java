package questions;

import java.nio.file.*;

public class RQ4 {
    public static void main(String[] args) {
        /* Assume current directory path is /planets. */
        Path path = Path.of("./mars/../earth").normalize().toAbsolutePath();
        System.out.println(path + " : " +path.getNameCount());
    }
}

/*
* What is the result?
Select the one correct answer.

a. 2
b. 3
c. 7
d. The program will throw an exception at runtime.
* */
