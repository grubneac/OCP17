package questions;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.*;
//don't wor in windows OS
public class RQ11 {
    public static void main(String[] args) {
        Path resourcePath = Path.of("_21JavaIO", "src", "main", "resources");
        Path directory = resourcePath.resolve(Path.of("/test/data"));
        Path file = resourcePath.resolve(Path.of("/test/data/info.txt"));
        try {
            Set<PosixFilePermission> permissions = new HashSet<>();
            permissions.add(PosixFilePermission.OWNER_READ);
            Files.setPosixFilePermissions(directory, permissions);

            permissions.add(PosixFilePermission.OWNER_WRITE);
            Files.setPosixFilePermissions(file, permissions);
            try (var stream = Files.walk(directory)) {
                stream.forEach(System.out::println);
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
/*
* What is the result?
Select the one correct answer.

a. /test/data
b. /test/data/info.txt
c. java.nio.file.AccessDeniedException:/test/data/info.txt
d. java.nio.file.AccessDeniedException:/test/data
* */