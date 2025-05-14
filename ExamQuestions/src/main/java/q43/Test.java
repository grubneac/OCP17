package q43;

public class Test {
    public static void main(String[] args) {
        String txt = """
                a
                  b
                c
                """;
        txt.lines().parallel().map(String::length).forEachOrdered(System.out::print);
    }
}
/*
* The first line of the text block has two leading spaces, the second line has four leading spaces, and the third line
* has two leading spaces. There are two leading whitespace on the line with the closing delimiter of the text block.
What is the result of executing the code?
Select the one correct answer.

a. 353
b. 3530
c. 1510
d. 131
* */