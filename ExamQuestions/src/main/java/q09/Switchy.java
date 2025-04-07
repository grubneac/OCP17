package q09;

public class Switchy {
    public static void main(String[] args) {
        final String s1 = "January";
        final String yr = " 2022";
        s1.concat(yr);
        switch (s1) {
            default -> System.out.println("Sorry.");
            case "January" + yr, s1 + " 2023" -> System.out.println("OK.");
        }
    }
}

/*
* Select the one correct answer.

a. The program will fail to compile.
b. The program will compile. When run, it will print: Sorry.
OK.
c. The program will compile. When run, it will print: Sorry.
d. The program will compile. When run, it will print: OK.
* */