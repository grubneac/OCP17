import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.*;

import static java.lang.System.out;

public class BasicFileAttributesRetrieve {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("_21JavaIO", "src", "main", "java", "BasicFileAttributesRetrieve.java");
        out.println("File: " + path);

        BasicFileAttributes bfa = Files.readAttributes(path,                  // (1)
                BasicFileAttributes.class);
        printBasicFileAttributes(bfa);
        DosFileAttributes dfa = Files.readAttributes(path, DosFileAttributes.class);
        printDosFileAttributes(dfa);

    }

    // Declared in utility class FileUtils.
    public static void printBasicFileAttributes(BasicFileAttributes bfa) {
        out.println("Printing basic file attributes:");
        out.println("lastModifiedTime: " + bfa.lastModifiedTime());
        out.println("lastAccessTime:   " + bfa.lastAccessTime());
        out.println("creationTime:     " + bfa.creationTime());

        out.println("size:             " + bfa.size());
        out.println("isDirectory:      " + bfa.isDirectory());
        out.println("isRegularFile:    " + bfa.isRegularFile());
        out.println("isSymbolicLink:   " + bfa.isSymbolicLink());
        out.println("isOther:          " + bfa.isOther());
        out.println();
    }
    // Declared in the utility class FileUtils.
    public static void printDosFileAttributes(DosFileAttributes dfa) {
        out.println("Printing DOS-specific file attributes:");
        boolean system = dfa.isSystem();
        boolean readOnly = dfa.isReadOnly();
        boolean hidden = dfa.isHidden();
        boolean archive = dfa.isArchive();

        out.println("File is a component of the operating system.:    " + system);
        out.println("read only:                                       " + readOnly);
        out.println("Is the file hidden:                              " + hidden);
        out.println("Is the file archive:                             " + archive);
        out.println();
    }
}
