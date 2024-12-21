package questions;

import java.io.*;
import java.nio.file.*;
public class RQ6 {
    public static void main(String[] args) {

        try (var stream = Files.walk(Path.of("_21JavaIO", "src", "main", "resources","/test")
                .toRealPath(LinkOption.NOFOLLOW_LINKS))) {
            stream.map(p -> p.getFileName().toString())
                    .filter(p -> p.endsWith("txt"))
                    .sorted()
                    .forEach(System.out::println);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

/*
*What is the result?

Select the one correct answer.

*a.
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\a.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\a.txt\b.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\c\d.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\e.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\f.txt

*b.
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\a.txt\b.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\c\d.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\e.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\f.txt

* c.
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\a.txt\b.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\e.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\f.txt

* d.
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\a.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\e.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\f.txt

* e.
b.txt
d.txt
e.txt
f.txt

* f.
b.txt
e.txt
f.txt

* g.
a.txt
b.txt
d.txt
e.txt
f.txt
*
* */