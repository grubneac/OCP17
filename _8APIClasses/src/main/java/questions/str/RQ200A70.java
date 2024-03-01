package questions.str;

public class RQ200A70 {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(-10);
        Integer j = Integer.valueOf(-10);
        Integer k = -10;
        System.out.print((i==j) + "|");
        System.out.print(i.equals(j) + "|");
        System.out.print((i==k) + "|");
        System.out.print(i.equals(k));
    }
}