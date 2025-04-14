package q27;

import java.util.List;

class SupA<T> {
    public List<?> fuddle() { return null; }
    public List scuddle(T t) { return null; }
}
 class SubB<U> extends SupA<U> {
    public List fuddle() { return null;}
    public List<?> scuddle(U t) { return null; }
}
public class SubC<V> extends SupA<V> {
    public List<V> fuddle() { return null;}
    public List<? extends Object> scuddle(V t) { return null; }
}

/*
* Which of the following statements are true about the classes SupA, SubB, and SubC?
* Select the four correct answers.

a. Class SubB will fail to compile.
b. Class SubC will fail to compile.
c. Class SubB will compile.
d. Class SubC will compile.
e. Class SubB overloads the methods in class SupA.
f. Class SubC overloads the methods in class SupA.
g. Class SubB overrides the methods in class SupA.
h. Class SubC overrides the methods in class SupA.
* */