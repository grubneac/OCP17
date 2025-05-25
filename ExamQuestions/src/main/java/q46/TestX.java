package q46;

public class TestX {
    public static void main(String[] args) {
        System.out.println(action(Integer.valueOf("1")));
    }
    public static boolean action(Object obj) {
        return (obj instanceof String value1 && value1.contains("1") ||
                obj instanceof Integer value2 && value2.intValue() < 1);
    }
}

/*
* What is the result?
Select the one correct answer.

a. true
b. false
c. The program will throw an exception at runtime.
d. The program will fail to compile.
* */
