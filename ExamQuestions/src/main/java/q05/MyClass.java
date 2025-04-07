package q05;

class MyClass {
    public static void main(String[] args) {
        int k = 0;
        int l = 0;
        for (int i = 0; i <= 3; i++) {
            k++;
            if (i == 2) break;
            l++;
        }
        System.out.println(k + ", " + l);
    }
}

/*
* Which of the following statements is true?
Select the one correct answer.

a. The program will fail to compile.
b. The program will print 3, 3 at runtime.
c. The program will print 4, 3 at runtime if the break statement is replaced by the continue statement.
d. The program will fail to compile if the break statement is replaced by the return statement.
e. The program will fail to compile if the break statement is replaced by an empty statement.
* */