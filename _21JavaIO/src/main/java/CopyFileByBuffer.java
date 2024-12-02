import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyFileByBuffer {
    public static void main(String[] args) {
        Path inputPath = Path.of( "_21JavaIO","src", "main", "java", "CopyFileByBuffer.java");
        Path outputFilePath = Path.of("_21JavaIO","target","CopyFileByBuffer.java");
        String pathString = inputPath.toString();
        try (var fis = new FileInputStream(pathString);
             var bis = new BufferedInputStream(fis)) {
            long byteCopied = Files.copy(bis, outputFilePath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("1: Copied " + byteCopied + " bytes");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path outputFilePath2 = Path.of("_21JavaIO","target","CopyFileByBuffer2.java");
        try(var fos = new FileOutputStream(outputFilePath2.toFile());
            var bos = new BufferedOutputStream(fos)    ) {
            long byteCopied = Files.copy(inputPath, bos);
            System.out.println("2: Copied " + byteCopied + " bytes");
            Files.copy(inputPath, System.out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
