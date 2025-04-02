package q04;

public class Q200A80 {
    public static void main(String[] args) {
        callType(10);
    }

    private static void callType(Number num){
        System.out.println("Number passed");
    }

    private static void callType(Object obj){
        System.out.println("Object passed");
    }
}

/*
* Select the one correct answer.

a. The program will compile and will print Object passed.
b. The program will compile and will print Number passed.
c. The program will fail to compile, because the call to the callType() method is ambiguous.
d. The program will compile, but it will throw a ClassCastException at runtime.
* */