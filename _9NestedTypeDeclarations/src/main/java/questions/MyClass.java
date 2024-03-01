package questions;

public class MyClass {
    public static void main(String[] args) {
        Outer1 objRef = new Outer1();
        System.out.println(objRef.createInner().getSecret());
    }
}

class Outer1 {
    private int secret;
    Outer1() { secret = 123; }

    class Inner {
        int getSecret() { return secret; }
    }

    Inner createInner() { return new Inner(); }
}