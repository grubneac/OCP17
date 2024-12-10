import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class CreateRegularDirectory {
    public static void main(String[] args) {
        try {
            Set<PosixFilePermission> dPerms = PosixFilePermissions.fromString("rwxrwxrwx");
            FileAttribute<Set<PosixFilePermission>> dirFileAttr =
                    PosixFilePermissions.asFileAttribute(dPerms);
            Path regularDir  = Path.of("_21JavaIO", "target", "project");
            Path createdDir = Files.createDirectory(regularDir);                    // (1)
//            FileUtils.printDirEntryInfo(createdDir);

            if (Files.deleteIfExists(regularDir)) {                                 // (2)
                System.out.printf("Directory deleted: %s%n", regularDir);
            }
            Path newDir = Files.createDirectory(regularDir);//, dirFileAttr);           // (3)
//            FileUtils.printDirEntryInfo(newDir);
            Files.setPosixFilePermissions(newDir, dPerms);                          // (4)
//            FileUtils.printDirEntryInfo(newDir);
        } catch (NoSuchFileException | FileAlreadyExistsException fe) {
            fe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
