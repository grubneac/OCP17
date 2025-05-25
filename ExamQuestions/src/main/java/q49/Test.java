package q49;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        try {
            URL resource = Test.class.getClassLoader().getResource("dataQ49.txt");
            Path test = Paths.get(resource.toURI());
            Map<String, List<String>> values
                    = Files.lines(test).collect(Collectors.groupingBy(
                    ln -> ln.substring(ln.indexOf(":") + 1)));
            System.out.println(values);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
