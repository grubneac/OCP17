package intefaces;

class Slogan2 {
    public void printSlogan() {                        // (1) Concrete method
        System.out.println("Superclass wins!");
    }
}
//_______________________________________________________________________________
interface ISlogan2 {
    default void printSlogan() {                       // (2) Default method
        System.out.println("Superinterface wins!");
    }
}
//_______________________________________________________________________________
class MySlogan extends Slogan2 implements ISlogan2 { } // (3)
//_______________________________________________________________________________
public class MultipleInheritance2 {                  // (4)
    public static void main(String[] args) {
        MySlogan slogan = new MySlogan();
        slogan.printSlogan();                            // (5)
    }
}