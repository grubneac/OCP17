package questions;
import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Target;

public class RQ8 {
}
@Target({FIELD, CONSTRUCTOR, TYPE})
@interface Descriptor {
    String value();
    String[] details() default "";
}
//Which of the following applications of this annotation type are valid? Select the three correct answers.

//a.
//@Descriptor("Music to play")
// interface Playable { }

//b.
// enum Style {
//    @Descriptor(value="Rock music", details={"listen"})
//    ROCK,
//    @Descriptor(value="POP music", details="dance")
//    POP,
//    @Descriptor(value="Jazz music", details={"listen", "dance"})
//    JAZZ,
//    @Descriptor("Classic music")
//    CLASSIC;
//}

//c.
// class Music {
//    @Descriptor(value="Music to play")
//    Music m = new Music();
//}

//d.
//@Descriptor("Music to play",details={"listen","dance"})
// class Music {
//    Music m = new Music();
//}

//e.
// class Player {
//    @Descriptor("Music to play")
//    public static void main(String[] args) {
//        Music m = new Music();
//    }
//}

//f.
// class Player {
//    public static void main(String[] args) {
//        @Descriptor(value="Music to play",details={"listen","dance"})
//        new Music();
//    }
//}