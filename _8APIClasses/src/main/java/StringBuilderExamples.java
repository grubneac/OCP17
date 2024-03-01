public class StringBuilderExamples {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("1234567890");
        System.out.println(str.length() + " : " + str.capacity());

        str.append("addText");
        System.out.println(str + " : " + str.length() + " : " + str.capacity());

        str.insert(5,"insertText");
        System.out.println(str + " : " + str.length() + " : " + str.capacity());

        str.setCharAt(4, 'X');
        System.out.println(str + " : " + str.length() + " : " + str.capacity());

        str.replace(5, str.length(),"END");
        System.out.println(str + " : " + str.length() + " : " + str.capacity());

        str.delete(0,4);
        System.out.println(str + " : " + str.length() + " : " + str.capacity());

        str.trimToSize();
        System.out.println(str + " : " + str.length() + " : " + str.capacity());

        str.append("D");
        System.out.println(str + " : " + str.length() + " : " + str.capacity());

        str.setLength(str.length() + 10);
        System.out.println(str + " : " + str.length() + " : " + str.capacity());
    }
}
