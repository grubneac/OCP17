import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MoveDirAndItsHierarchy {
    public static void main(String[] args) {
        Path sourscePath = Path.of("_21JavaIO", "target", "classes");
        Path destinationPath = Path.of("_21JavaIO", "target", "backup");
        try {
            Files.move(sourscePath, destinationPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
