package intefaces;

//______________________________________________________________________________
public class StackUser {

    public static void main(String[] args) {                                // (9)
        SafeStack  safeStackRef  = new SafeStack(10);
        Stack      stackRef      = safeStackRef;
        ISafeStack isafeStackRef = safeStackRef;
        IStack     istackRef     = safeStackRef;
        Object     objRef        = safeStackRef;

        safeStackRef.push("Dollars");                                         // (10)
        stackRef.push("Kroner");
        System.out.println(isafeStackRef.pop());
        System.out.println(istackRef.pop());
        System.out.println(objRef.getClass());
    }
}