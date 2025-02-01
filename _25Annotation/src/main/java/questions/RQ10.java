package questions;

import java.lang.annotation.Repeatable;

//@Folder("/data")
//@Folder(value="/tmp", temp=true)
public class RQ10 {
}
//Which of the following declarations of the Folder and Folders annotation types is valid?
//Select the one correct answer.
//
//a.
//@Repeatable(Folders.class)
// @interface Folder {
//    String value();
//    boolean temp() default false;
//}
// @interface Folders {
//    Folder[] paths();
//}

//b.
//@Repeatable(Folders.class)
// @interface Folder {
//    String value();
//    boolean temp();
//}
// @interface Folders {
//    Folder[] value();
//}

//c.
//@Repeatable(Folders.class)
// @interface Folder {
//    String value();
//    boolean temp() default false;
//}
// @interface Folders {
//    Folder[] value();
//}

//d.
//@Repeatable(Folders.class)
// @interface Folder {
//    String path();
//    boolean temp() default true;
//}
// @interface Folders {
//    Folder[] value();
//}