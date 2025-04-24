package q34;

public class Q800A60 {
    static void printFirst(Integer... ints) {
        System.out.println("Integer...: " + ints[0]);
    }

    static void printFirst(Number... nums) {
        System.out.println("Number...: " + nums[0]);
    }

    static void printFirst(Object... objs) {
        System.out.println("Object...: " + objs[0]);
    }

    public static void main(String[] args) {
        printFirst(10);
        printFirst((byte)20);
        printFirst('3', '0');
        printFirst("40");
        printFirst((short)50, 55);
        printFirst((Number[])new Integer[] {70, 75});
    }
}
/*Select the one correct answer.

a. The program does not compile because of ambiguous method calls.
b. The program will compile and will print:
Integer...: 10
Integer...: 20
Integer...: 3
Object...: 40
Integer...: 50
Number...: 70
c. The program will compile and will print:
Integer...: 10
Number...: 20
Object...: 3
Object...: 40
Number...: 50
Number...: 70
d. The program will compile and will print:
Integer...: 10
Integer...: 20
Integer...: 3
Object...: 40
Number...: 50
Number...: 70
*
* */