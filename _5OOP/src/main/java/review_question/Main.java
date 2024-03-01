package review_question;

// Classes
class Foo {
    private int i;
    public void f() { /* ... */ }
    public void g() {
        System.out.println("review_question.Foo g()"); }
}

class Bar extends Foo {
    public int j;
    public void g() {
        System.out.println("review_question.Bar g()");
    }
}

public class Main {
    public static void main(String[] args) {
        Foo a = new Bar();
        Bar b = new Bar();

        b.f();
        a.g();

    }
}