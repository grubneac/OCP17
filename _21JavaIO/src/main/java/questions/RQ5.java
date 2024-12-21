package questions;

import java.io.*;
import java.nio.file.*;

public class RQ5 {
    public static void main(String[] args) {
        try (var stream = Files.list(Path.of("_21JavaIO", "src", "main", "resources","/test")
                .toRealPath(LinkOption.NOFOLLOW_LINKS))) {
            stream.filter(p -> p.getFileName().toString().endsWith("txt"))
                    .forEach(p -> System.out.println(p));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
/*
*What is the result?
* (D:\JavaProjects\OCP17 - windows directory of this project )

Select the one correct answer.

a.

D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\a.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\a.txt\b.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\c\d.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\e.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\f.txt
b.

D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\a.txt\b.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\c\d.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\e.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\f.txt
c.

D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\a.txt\b.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\e.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\f.txt
d.

D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\a.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\e.txt
D:\JavaProjects\OCP17\_21JavaIO\src\main\resources\test\f.txt
e.

a.txt\b.txt
c\d.txt
e.txt
f.txt
f.

b.txt
d.txt
e.txt
f.txt
g.

a.txt\b.txt
e.txt
f.txt
h.

a.txt
b.txt
d.txt
e.txt
f.txt
* */