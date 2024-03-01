package questions;

public class Outer {
    public void doIt() {
        System.out.println("Outer.doIt()");

    }
    public class Inner {
        public void doIt() {
            System.out.println("Inner.doIt()");
        }
    }

    public static void main(String[] args) {
        new Outer().new Inner().doIt();
    }
}
