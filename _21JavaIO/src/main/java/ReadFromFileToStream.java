import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class ReadFromFileToStream {
    public static void main(String[] args) {
        Path path = Path.of("_21JavaIO", "src", "main", "resources", "worldlist.txt");
        System.out.println("Find palindromes, greater than length 2.");
        try(Stream<String> lines = Files.lines(path)) {
            List<String> palindromes = lines.filter(str -> str.length() > 2)
                    .filter(str -> str.contentEquals(new StringBuilder(str).reverse()))
                    .toList();
            System.out.printf("List of palindromes:   %s%n", palindromes);
            System.out.printf("Number of palindromes: %s%n", palindromes.size());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
