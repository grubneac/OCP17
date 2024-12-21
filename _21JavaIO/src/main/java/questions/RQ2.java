package questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class RQ2 {
    public static void main(String[] args) throws IOException {
        Path dirPath = Path.of("_21JavaIO", "src", "main", "resources");
        printFiles1(dirPath);
        printFiles2(dirPath);
        printFiles3(dirPath);
    }

    public static void printFiles1(Path dirPath) throws IOException {
        try (Stream<Path> paths = Files.list(dirPath)) {
            paths.forEach(System.out::println);
        }
        System.out.println();
    }

    public static void printFiles2(Path dirPath) throws IOException {
        try (Stream<Path> paths = Files.walk(dirPath)) {
            paths.forEach(System.out::println);
        }
        System.out.println();
    }

    public static void printFiles3(Path dirPath) throws IOException {
        try (Stream<Path> paths = Files.find(dirPath, Integer.MAX_VALUE,
                (p, a) -> true)) {
            paths.forEach(System.out::println);
        }
        System.out.println();
    }
}

/*
*Which statement is true about the program?

Select the one correct answer.
a. All three methods printFiles1(), printFiles2(), and printFiles3() will produce the same output.
b. Only the methods printFiles1() and printFiles2() will produce the same output.
c. Only the methods printFiles2() and printFiles3() will produce the same output.
d. Only the methods printFiles1() and printFiles3() will produce the same output.
e. The program will fail to compile because the list() method does not exist in the Files class.
* */