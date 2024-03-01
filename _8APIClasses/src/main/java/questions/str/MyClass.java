package questions.str;

public class MyClass {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
       // if (str == sb) System.out.println("a"); //not compile
        if (str.equals(sb)) System.out.println("b");
        if (sb.equals(str)) System.out.println("c");

        String str1 = "str1";
        String str2 = "str2";
        String str3 = "str3";

        str1.concat(str2);
        System.out.println(str3.concat(str1));
    }
}