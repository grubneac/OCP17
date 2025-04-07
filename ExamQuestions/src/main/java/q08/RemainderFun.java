package q08;

public class RemainderFun {
    public static void main(String[] args) {
        int i = 24, k = 7;
        System.out.print( i %  k + "|");
        System.out.print( i % -k + "|");
        System.out.print(-i %  k + "|");
        System.out.println(-i % -k);
    }
}

/*
* Select the one correct answer.

a. The program will fail to compile.
b. The program will compile, but it will throw an exception at runtime.
c. 3|-3|-3|3
d. 3|3|-3|-3
e. 3|-3|-3|-3
f. 3|-3|3|-3
* */