package overloading_examples;

import intefaces.*;

public class InstanceofPatternMatchOperator {
    public static void main(String[] args) {
        IStack stack = new SafeStack(20); // Supertype reference denotes subtype object.

// Using the instanceof type comparison operator. (1)
        if (stack instanceof SafeStack) {                 // Correct subtype?
            SafeStack safestack = (SafeStack) stack;        // Cast to subtype.
            System.out.println(safestack.isFull());         // Call subtype-specific method.
        }

// Using the instanceof pattern match operator.   (2)
//        for (int i = 0; i < 20; i++) {
//            stack.push(new Object());
//        }
        if (stack instanceof final SafeStack safestack) {
            System.out.println(safestack.isFull());
        }
        while (stack instanceof SafeStack safeStack && !safeStack.isFull()) {
            safeStack.push(new Object());
        }
        System.out.println("Fill up safeStack");

//        ISafeStack safestack = new SafeStack(20);
//        if (safestack instanceof ISafeStack stack1) {     // (1) Compile-time error!
//            stack.push("Hi");
//        }
//        if (safestack instanceof IStack stack1) {         // (2) Compile-time error!
//            stack.push("Howdy");
//        }
    }
}
