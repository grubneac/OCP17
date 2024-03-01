package questions.str;

public class FunCharSeq {
    private static void putO(String s1) {
        s1 = s1.trim();
        s1 += "O";
    }

    public static void main(String[] args) {
        String s1 = " W ";
        putO(s1);
        s1.concat("W");
        System.out.println("|" + s1 + "|");
    }
}