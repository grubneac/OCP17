package q31;

public class Main {
    public static void main(String[] args) {
        extracted(new A());
        extracted(new B());
        extracted(new C());
        extracted(new D());
    }

    private static void extracted(Object obj) {
        //INSERT HERE
        boolean result = obj instanceof B && !(obj instanceof C);
        if(result){
            System.out.println("TRUE:Created like object B");
        } else {
            System.out.println("FALSE:Created like object A or C or D");
        }
    }
}

class A {}
class B extends A { }
class C extends B { }
class D extends A { }

/*
* Given the following class declarations, which expression identifies whether the object referenced by obj was created by instantiating class B rather than classes A, C, and D?
* Select the one correct answer.

a. obj instanceof B
b. obj instanceof A && !(obj instanceof C)
c. obj instanceof B && !(obj instanceof C)
d. !(obj instanceof C || obj instanceof D)
e. !(obj instanceof A) && !(obj instanceof C) && !(obj instanceof D)
* */