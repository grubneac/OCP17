package questions;

import java.io.IOException;
import java.nio.file.*;
public class RQ9 {
    public static void main(String[] args) {
        try {
            Path resourcePath = Path.of("_21JavaIO", "src", "main", "resources");
            Path source = resourcePath.resolve(Path.of("src/readme.txt"));
            Path destination = resourcePath.resolve(Path.of("backup/readme_save.txt"));
            Files.copy(source, destination);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
/*
* Assuming that both source and destination files exist and are accessible, what is the result?
Select the one correct answer.

a. The destination file will be overwritten with the content of the source file.
b. The content of the source file will be appended to the end of the destination file.
c. The content of the source file will be inserted at the beginning of the destination file.
d. The program will throw an exception at runtime.
* */