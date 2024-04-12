package optionals;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> blurb1 = Optional.ofNullable("Program like a Java Pro!");
        Optional<String> noBlurb2 = Optional.ofNullable(null);   // Optional.empty()
        Optional<String> noBlurb3 = Optional.empty();
//        Optional.of(null); //NullPointerException
    }
}
