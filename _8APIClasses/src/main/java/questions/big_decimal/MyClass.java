package questions.big_decimal;

class MyClass {
    public static void main(String[] args) {
        double v = 10.5;

        System.out.println(Math.ceil(v));  // (1)
        System.out.println(Math.round(v));  // (2)
        System.out.println(Math.floor(v));       // (3)
        System.out.println((int) Math.ceil(v));  // (4)
        System.out.println((int) Math.floor(v)); // (5)
    }
}