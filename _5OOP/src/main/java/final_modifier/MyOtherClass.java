package final_modifier;

abstract class MyClass {
    abstract void f();
    final    void g() {}
//final    void h() {}                         // (1)

    protected static int i;
    private          int j;
}

final class MyOtherClass extends MyClass {
//MyOtherClass(int n) { m = n; }               // (2)

    public static void main(String[] args) {
        MyClass mc = new MyOtherClass();
    }

    void f() {}
    void h() {}
//void k() { i++; }                            // (3)
//void l() { j++; }                            // (4)

    int m;
}