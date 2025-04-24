package q32;

public enum Scale5 {
    GOOD, BETTER, BEST;

    public char getGrade() {
        return switch (this) {
            case GOOD   -> 'C';
            case BETTER -> 'B';
            case BEST   -> 'A';
        };
    }

    public static void main (String[] args) {
        System.out.println(GOOD.getGrade());
    }
}

/*
* Select the one correct answer.

a. The program will fail to compile, as the switch expression is not compatible with the case labels.
b. The program will fail to compile, as enum constants cannot be used as case labels.
c. The program will fail to compile, as the case labels must be qualified with the enum type name.
d. The program will compile, and when run, will print C.
e. The program will compile, and when run, will print GOOD.
* */
