package questions.str;

public class PeskyCharSeq {
    public static void main (String[] args) {
        StringBuilder sb1 = new StringBuilder("WOW");
        StringBuilder sb2 = new StringBuilder(sb1);
        System.out.println((sb1==sb2) + " " + sb1.equals(sb2));
    }
}