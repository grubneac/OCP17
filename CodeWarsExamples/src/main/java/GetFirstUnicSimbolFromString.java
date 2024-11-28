import java.util.Arrays;

/*
 * Create a method that returns the first unique symbol from the line
 * */
public class GetFirstUnicSimbolFromString {
    public static void main(String[] args) {
        char result = getFirstUnic2("Java");
        if (result != 'J') throw new RuntimeException(result + " is not a J /1");
        result = getFirstUnic2("JJava");
        if (result != 'v') throw new RuntimeException(result + " is not a v /2");
        result = getFirstUnic2("JJavva");
        if (result != ' ') throw new RuntimeException(result + " is not a v /3");

        System.out.println("OK");
    }

    private static char getFirstUnic(String res) {
        int intChar = res.chars()
                .filter(c -> (res.length() - res.replaceAll(String.valueOf((char)c),"").length()) == 1)
                .findFirst().orElse(' ');
        char result = (char) intChar;
        System.out.println(result);
        return result;
    }
    private static char getFirstUnic2(String res) {
        String intChar = Arrays.stream(res.split("")).filter(c -> res.indexOf(c) == res.lastIndexOf(c))
                .findFirst().orElse( " ");
        char result = intChar.charAt(0);
        System.out.println(result);
        return result;
    }
}
