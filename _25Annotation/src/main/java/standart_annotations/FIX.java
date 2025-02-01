package standart_annotations;

@FunctionalInterface
public interface FIX {       // Compiles without errors.One abstract method.
    void doThings();
}

/*
@FunctionalInterface
public interface FIXIt extends FIX {  // Compiles without errors. Abstract method
}                                     // inherited.

@FunctionalInterface
public interface FIY {       // Compile-time error! More than one abstract method.
    void doThings();
    void doOtherThings();
}

@FunctionalInterface
public interface FIZ {       // Compile-time error! No abstract method.
}*/
