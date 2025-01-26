import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Choices {
    Choice[] value();                  // Return value is an array of Choice.
    double minPrice() default 1.00;    // Must specify a default value.
}