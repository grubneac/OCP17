// File: StaticTest.java
import static java.lang.System.out;

class LightStatic {

    long var;

    // Static field:
    static int counter;                  // (1) No initializer expression

    // Static method:
    public static void printStatic() {
        LightStatic myLightStatic = null;
        out.printf("%s, %s, %s%n", counter, LightStatic.counter, myLightStatic.counter); // (2)
        long counter = 10;                 // (3) Local variable shadows static field
        out.println("Local counter: " + counter);       // (4) Local variable accessed
        out.println("Static counter: " + LightStatic.counter);// (5) Static field accessed

//        out.println(this.counter);         // (6) Cannot use this in static context
//        printNonStatic();                  // (7) Cannot call non-static method
    }

    // Non-static method:
    public void printNonStatic() {
        out.printf("%s, %s, %s%n", counter, this.counter, LightStatic.counter);     // (8)
    }
}
//______________________________________________________________________________
public class StaticTest {              // Client of class Light
    public static void main(String[] args) {
        LightStatic.counter++;                   // (9) Using class name
        LightStatic dimLightStatic = null;
        dimLightStatic.counter++;                // (10) Using object reference

        out.print("Light.counter == dimLight.counter: ");
        out.println(LightStatic.counter == dimLightStatic.counter);//(11) Aliases for static field

        out.println("Calling static method using class name:");
        LightStatic.printStatic();               // (12) Using class name
        out.println("Calling static method using object reference:");
        dimLightStatic.printStatic();            // (13) Using object reference
    }
}