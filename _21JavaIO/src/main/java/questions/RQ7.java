package questions;

import java.io.*;
import java.nio.file.*;
public class RQ7 {
    public static void main(String[] args) {

        try {
            Path p1 = Path.of("_21JavaIO", "src", "main", "resources", "/users/joe/test/a.jpg");
            Path p2 = Path.of("_21JavaIO", "src", "main", "resources", "/users").resolve(p1.getName(5).resolve("test/a.jpg"));
            Files.move(p1, p2);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
/*
* Assuming that the relevant paths exist, what is the result?

Select the one correct answer.

a. The file a.jpg is moved to the /users directory.
b. The file a.jpg is moved to the /users/joe/test directory.
c. No action is taken when trying to move the file a.jpg.
d. An IOException is thrown when trying to move the file a.jpg.
* */