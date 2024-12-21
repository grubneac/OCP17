package questions;

import java.io.IOException;
import java.nio.file.*;
public class RQ10 {
    public static void main(String[] args) {
        Path resourcePath = Path.of("_21JavaIO", "src", "main", "resources");
        Path p = resourcePath.resolve(Path.of("test.html"));
        try (var stream = Files.lines(p)){
            String result = stream.filter(s->s.startsWith("<"))
                    .map(s->s.substring(s.indexOf(">"), s.indexOf(">")+1))
                    .reduce("", (s1,s2) -> s1+s2);
            System.out.println(result);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
/*
* What is the result?
Select the one correct answer.

a. An empty string
b. <<<<<
c. <><><><><>
d. >>>>>
e. The program will throw an exception at runtime.
* */
