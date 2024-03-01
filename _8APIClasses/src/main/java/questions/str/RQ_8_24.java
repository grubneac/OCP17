package questions.str;

public class RQ_8_24 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("  1234  ");
        sb.trimToSize();
        sb.append("!");
        sb.reverse();
        sb.setLength(5);
        System.out.println("|" + sb + "|");
    }
}