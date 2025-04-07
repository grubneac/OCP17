package q10;

public class CodeMe {
    public static void main(String[] args) {
        boolean flag = false;
        if (false)          // (1)
            flag = !flag;
        System.out.println(flag);
    }
}

/*
* Select the two correct answers.

a. The program, as it stands, does not compile.
b. The program will compile without errors. When run, it will print false.
c. The program will compile without errors. When run, it will print true.
d. If the keyword if at (1) is replaced with the keyword while, the program will compile without errors. When run, it will print false.
e. If the keyword if at (1) is replaced with the keyword while, the program will compile without errors. When run, it will print true.
f. If the keyword if at (1) is replaced with the keyword while, the program will fail to compile.
* */