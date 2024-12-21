package questions;

import static java.nio.file.attribute.PosixFilePermission.*;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.Set;

//don't wor in windows OS
public class RQ12 {
    public static void main(String[] args) {
        try {
            Path file = Path.of("/test/data/info.txt");
            Set<PosixFilePermission> perms
                    = PosixFilePermissions.fromString("---------");
            Files.setPosixFilePermissions(file, perms);

            PosixFileAttributeView pfaView = Files.getFileAttributeView(file,
                    PosixFileAttributeView.class);
            PosixFileAttributes pfa = pfaView.readAttributes();

            perms = Set.of(OWNER_READ, GROUP_WRITE, OTHERS_READ);
            pfaView.setPermissions(perms);

            perms = pfa.permissions();
            perms.add(OWNER_WRITE);
            pfaView.setPermissions(perms);

            perms = pfa.permissions();
            perms.remove(GROUP_WRITE);
            pfaView.setPermissions(perms);

            perms = pfa.permissions();
            System.out.println(perms);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

/*
* What is the result?
Select the one correct answer.

* a.[OWNER_READ, OWNER_WRITE, GROUP_WRITE, OTHERS_READ]
* b.[OWNER_READ, OWNER_WRITE, OTHERS_READ]
* c.[OWNER_WRITE]
* d. []
* e. The program will throw an exception at runtime.
* */