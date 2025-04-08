package q15;

public class Main {
}
interface IA            { boolean equals(Object obj); }
interface IB extends IA { boolean doIt(String str); }
interface IC extends IB { boolean doIt(String str); }
interface ID extends IC { boolean equals(Object obj);}

/*
* Select the one correct answer.

a. IA is a functional interface.
b. IB is a functional interface.
c. IC is not a functional interface.
d. ID is not a functional interface.
* */