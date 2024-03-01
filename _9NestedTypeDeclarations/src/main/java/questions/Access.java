package questions;

public class Access {
    final String str1 = "Access.str1";

    public static void main(final String args[]) {
        final String str1 = "LocalVar.str1";

        class Helper { String getStr1() { return str1; } }
        class Inner {
            String str1 = "Inner.str1";
            Inner() {
                System.out.println(new Helper().getStr1());
            }
        }
        Inner inner = new Inner();
    }
}