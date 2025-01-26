import java.lang.annotation.*;
enum Size {S, M, L, XL}
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Choices.class)    // @Repeatable specifies the container
        // annotation type Choices.
@interface Choice {
    String color();
    Size size() default Size.L;
}
