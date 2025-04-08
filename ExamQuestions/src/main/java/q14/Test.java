package q14;

import java.io.IOException;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws IOException {

        Stream<String> shapes = Stream.of("Circle","Cube");
        // (1) INSERT CODE HERE
//        shapes.filter(p).forEach(v->System.out.println(v));
    }
}
/*
* Which code option can be inserted at (1) so that the program prints "Circle" and "Cube"?
* Select the one correct answer.
 a.
 Predicate<String> p = s -> {
  s.toLowerCase();
  return s.contains("c");
    };
b.
Predicate p = s -> {
  s = s.toString().toLowerCase();
  return s.contains("c");
    };
c. Predicate<String> p = s -> s.contains("c");
d. Predicate<Object> p = s -> s.toString().toLowerCase().contains("c");
e. Predicate p = s -> s.contains("c");
f. Predicate p = s -> s.toLowerCase().contains("c");
* */