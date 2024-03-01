import java.util.Arrays;

public class StringMethodsExample {
    public static void main(String[] args) {
        var tt = new String[]{"ewr ", null, "ewrw"};
        var ss = String.join("|", Arrays.asList(tt));
        System.out.println(ss);

        String cmds = " Attention!\r  Quick march!\n\n   Eyes left!";       // (0)
        System.out.println("---Indent(0))---\n" + cmds.indent(0));       // (1)
        System.out.println("---Indent(3))---\n" + cmds.indent(3));       // (2)
        System.out.println("---Indent(-1))---\n" + cmds.indent(-1));     // (3)
        System.out.println("---Indent(-2))---\n" + cmds.indent(-2));     // (4)
        System.out.println("---Indent(-3))---\n" + cmds.indent(-3));     // (5)

        String formattedStr = String.format("Formatted values|%5d|%8.3f|%5s|",
                2020, Math.PI, "Hi");
        System.out.println(formattedStr);  // Formatted values| 2020|  3.142|   Hi|
        formattedStr = formattedStr.toUpperCase();
        System.out.println(formattedStr);  // FORMATTED VALUES| 2020|  3.142|   HI|

        String formattedStr1 = "Formatted values|%5d|%8.3f|%5s|"
                .formatted(2020, Math.PI, "Hi");
        System.out.println(formattedStr1); // Formatted values| 2020|  3.142|   Hi|
    }
}
