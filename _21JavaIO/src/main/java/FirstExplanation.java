import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;

public class FirstExplanation {
    public static void main(String[] args) {
        FileSystem dfs = FileSystems.getDefault();     // Obtain the default file system.
        String nameSeparator = dfs.getSeparator();     // The name separator for a path.

//        Path absPath1 = Path.of("/a/b/c");                         // (1) /a/b/c
        Path absPath2 = Path.of(nameSeparator + "a" +              // (2) /a/b/c
                nameSeparator + "b" +
                nameSeparator + "c");
        System.out.println(absPath2);
        Path absPath3 = Path.of(nameSeparator, "a", "b", "c");     // (3) /a/b/c
        System.out.println(absPath3);
        System.out.println(absPath2.equals(absPath3));             // true

        Path absPath5 = Path.of("C:", "a", "b", "c");              // (5) C:\a\b\c
        System.out.println(absPath5);

        String pathOfCurrDir = System.getProperty("user.dir");  // (1)
        Path currDir = Path.of(pathOfCurrDir);                  // (2)
        System.out.println("currDir:" + currDir);
        Path relPath = Path.of(pathOfCurrDir, "d");             // (3) <curr-dir-path>/d
        System.out.println(relPath);

        File file = new File(File.separator + "a" +
                File.separator + "b" +
                File.separator + "c");        // /a/b/c

        // File --> Path, using the java.io.File.toPath() instance method
        Path fileToPath = file.toPath();                   // /a/b/c
        System.out.println(fileToPath);
        // Path --> File, using the java.nio.file.Path.toFile() default method.
        File pathToFile = fileToPath.toFile();             // /a/b/c
        System.out.println(pathToFile);

        // Create a URI object, using the URL.create(String str) static factory method.
        URI uri1 = URI.create("file:///a/b/c/d");   // Local file.
        System.out.println(uri1);

        // URI --> Path, using the Path.of(URI uri) static factory method.
        Path uriToPath1 = Path.of(uri1);       // /a/b/c/d
        System.out.println(uriToPath1);

        // URI --> Path, using the Paths.get(URI uri) static factory method.
        Path uriToPath2 = Paths.get(uri1);     // /a/b/c/d
        System.out.println(uriToPath2);

        // Path --> URI, using the Path.toUri() instance method.
        URI pathToUri = uriToPath1.toUri();    // file:///a/b/c/d
        System.out.println(pathToUri);

        System.out.println("\nrelativize and resolve");
        Path p = Path.of("/a/b");
        System.out.println("p=" + p);
        Path other = Path.of("/a/b/c/d");
        System.out.println("other=" + other);
        Path q = p.relativize(other);                               // c/d
        System.out.println("q=" + q);
        System.out.println("p.relativize(other).equals(q): " + p.relativize(other).equals(q));   // true
        System.out.println("p.resolve(q).equals(other): " + p.resolve(q).equals(other));             // true

        try {
            Path somePath = Path.of("_21JavaIO/pom.xml");
            Path realPath = somePath.toRealPath(LinkOption.NOFOLLOW_LINKS);
            System.out.println(realPath);
        } catch (NoSuchFileException nsfe) {
            nsfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
