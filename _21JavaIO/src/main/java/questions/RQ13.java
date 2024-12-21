package questions;

import java.io.*;
import java.net.*;
import java.nio.file.*;
public class RQ13 {
    public static void main(String[] args) {
        try {
            Path resourcePath = Path.of("_21JavaIO", "src", "main", "resources");
            Path test2 = resourcePath.resolve("test2");
            URI uri = URI.create("file:///_21JavaIO/src/main/resources/test2/ora.html");
            Path p1 = Path.of(uri);
            Path p2 = test2.resolve(Path.of("ora.html"));
            Files.copy(p1, p2);
            File file = p2.toFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
/*
* Assume that the file test2/ora.html exists. What is the result?
Select the one correct answer.

a. No output is produced.
b. An exception is thrown when converting a URI object to a Path object.
c. An exception is thrown when copying path p1 to path p2.
d. An exception is thrown when converting a Path object to a File object.
* */