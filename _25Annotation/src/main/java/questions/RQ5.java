package questions;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Target;

//@Test5Annotation
//public class RQ5<@Test5Annotation(value="a") T> {
//    @Test5Annotation({"a","b"})
//    private T var;
//    public RQ5(T var) {
//        this.var = var;
//    }
//}
//Which of the following annotation types is compatible with the annotation @Test5Annotation?
//Select the one correct answer.
//
//a.
//@Target({CONSTRUCTOR, FIELD, TYPE, })
//@interface Test5Annotation {
//  String[] value() default {"x"};
//}
//
//b.
//@Target({METHOD, FIELD, TYPE_PARAMETER, TYPE})
//@interface Test5Annotation {
//  String[] value() default "x";
//}
//
//c.
//@Target({CONSTRUCTOR, FIELD, TYPE_PARAMETER, TYPE})
//@interface Test5Annotation {
//  String[] values() default {"x"};
//}
//
//d.
//@Target({METHOD, FIELD, TYPE_PARAMETER})
//@interface Test5Annotation {
//  String[] values() default "x";
//}