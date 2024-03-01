package questions.str;

public class Test {
    public static void main(String[] args) {
        Integer i1 =  Integer.valueOf(-10) + Integer.valueOf(-10);
        Integer i2 = Integer.valueOf(-10) + Integer.valueOf(-10);
        int i3 = -10 - 10;
        Integer x1 = i1*i2*i3;
        Integer x2 = i1*i2*i3;
        int x3 = i1*i2*i3;
        String result = (i1 == i2) ? "A" : "";
        result += (i1 == i3) ? "B" : "";
        result += (x1 == x2) ? "C" : "";
        result += (x1 == x3) ? "D" : "";
        System.out.print(result);
    }
}