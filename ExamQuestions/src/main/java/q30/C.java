package q30;

class A {
    public A() {}
    public A(int i) { this(); }
}

class B extends A {
    public boolean B(String msg) { return false; }
}

public class C extends B {
    private C() { super(); }
    public C(String msg) { this(); }
    public C(int i) {}
}
/*
* Select the one correct answer.

a. The code will fail to compile.
b. The constructor in A that takes an int as an argument will never be called as a result of constructing an object of class B or C.
c. Objects of class B cannot be constructed.
d. At most, one constructor of each class is called as a result of constructing an object of class C.
* */