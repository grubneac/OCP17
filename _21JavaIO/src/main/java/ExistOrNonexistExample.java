import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExistOrNonexistExample {
    public static void main(String[] args) {
        Path currDir = Paths.get("").toAbsolutePath();
        System.out.println("currDir: " + currDir);
        Path relativePath = Path.of( "_21JavaIO","src", "main", "java", "ExistOrNonexistExample.java");
        System.out.println("relativePath1: " + relativePath);
        Path path1 = currDir.resolve(relativePath);
        System.out.println("resolve two path: " + path1);
        System.out.println("exists: " + Files.exists(path1));                             // true
        System.out.println("notExists: " + Files.notExists(path1));                          // false

        Path relativePath2 = Path.of("_21JavaIO", "..", "_21JavaIO", ".", "src", "main", "java", "ExistOrNonexistExample.java");
        System.out.println("relativePath2: " + relativePath2);
        System.out.println(Files.exists(relativePath2));                             // true
        System.out.println(Files.notExists(relativePath2));                          // false

    }
}
