package questions;


@interface Test4Annotation {
    int[] value() default {1, 2, 3};
}

// (1) INSERT ANNOTATION HERE
public class RQ4 {
}

/*
* Which of the following are incorrect ways to apply @Test4Annotation at (1)? Select the two correct answers.

a. @Test4Annotation(value=7)
b. @Test4Annotation(value=7,8,9)
c. @Test4Annotation({7,8,9})
d. @Test4Annotation
e. @Test4Annotation()
f. @Test4Annotation(8)
g. @Test4Annotation(8,9)
* */