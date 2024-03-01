package questions.str;

public class Appendage {
    private static void putO(StringBuilder s1) {
        s1.append("O");
    }

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("W");
        putO(s1);
        s1.append("W!");
        System.out.println(s1);
    }
}