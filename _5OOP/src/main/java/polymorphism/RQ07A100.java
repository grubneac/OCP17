package polymorphism;

interface I{}
interface J{}
class C implements I {}
class D extends C implements J {}

public class RQ07A100 {
    public static void main(String[] args) {
        I x = new D();
        if (x instanceof I) System.out.print("I");
        if (x instanceof J) System.out.print("J");
        if (x instanceof C) System.out.print("C");
        if (x instanceof D) System.out.print("D");
        System.out.println();
    }
}