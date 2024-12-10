import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class CreateRegularFile {
    public static void main(String[] args) {
        try {
            Path regularFile  = Path.of("_21JavaIO", "target", "readme.txt");
            Path createdFile1 = Files.createFile(regularFile);        // (1)
        } catch (NoSuchFileException | FileAlreadyExistsException fe) {
            fe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
