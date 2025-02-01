package questions;
import java.lang.annotation.*;

public class RQ9 {
}

//@Repeatable(Container.class)
//@interface Containee { int value(); }
//
//@interface Container {
//    // (1) INSERT CODE HERE
//}

//Which of the following code fragments inserted at (1) will allow the annotation types to compile?
//Select the one correct answer.
//
// a.
//String name();
//Containee[] value();

//b.
//String name() default "x";
//Containee[] value();

//c.
//String name() default "x";
//Containee[] values();

//d.
//String name() default "x";
//Containee value() default @Containee;

//e.
//String name() default "x";
//Containee[] values() default {@Containee(1), @Containee(2)};

//f.
//String name();
//Containee[] values() default {@Containee(1), @Containee(2)};