package q07;

public class Q1408b {
    public static void main(String[] args) {
        int i = 0;
        while (++i == i) {
            System.out.println(i++);
        }
    }
}

/*
* Select the one correct answer.

a. The program will execute and terminate normally, but it will not print anything.
b. The program will execute indefinitely, printing all numbers from 1 onward.
c. The program will execute indefinitely, printing all numbers from 2 onward.
d. The program will execute indefinitely, printing all even numbers from 2 onward.
e. The program will execute indefinitely, printing all odd numbers from 1 onward.
f. The program will execute indefinitely, printing all odd numbers from 3 onward.
* */