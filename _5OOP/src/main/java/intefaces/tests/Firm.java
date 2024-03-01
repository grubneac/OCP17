package intefaces.tests;
/*
Select the one correct answer.

a. printSlogan();

b. co.printSlogan();

c. sl.printSlogan();

d. Firm.printSlogan();

e. INewSlogan.printSlogan();
 */
interface INewSlogan {
    String SLOGAN = "Trouble shared is trouble halved!";
    static void printSlogan() { System.out.println(SLOGAN); }
}
//______________________________________________________________________________
public class Firm implements INewSlogan {
    public static void main(String[] args) {
        Firm co = new Firm();
        INewSlogan sl = co;
        // (1) INSERT STATEMENT EXPRESSION HERE
    }

    void testSlogan() {
        Firm co = new Firm();
        INewSlogan sl = co;
        // (2) INSERT STATEMENT EXPRESSION HERE
    }
}