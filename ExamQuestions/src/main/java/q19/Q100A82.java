package q19;

public class Q100A82 {
//    public static void main(String[] args) {
//        Object o = choose(991, "800");                                 // (1)
//        Number n1 = choose(991, 3.14);                                 // (2)
//        Number n2 = Q100A82.<Double>choose((double)991, 3.14);         // (3)
//        int k = (int) choose(1.3, 3.14);                               // (4)
//        int l = (int) (double) choose(1.3, 3.14);                      // (5)
//    }

    public static <T extends Comparable<T>> T choose(T t1, T t2) {
        return t1.compareTo(t2) >= 0 ? t1 : t2;
    }
}
/*
* Which of the following statements are true about the following program?
* Select the two correct answers.

a. The class must be declared as a generic type: public class Q100A82<T extends Comparable<T>> { ... }
b. The compiler reports errors at (1).
c. The compiler reports no errors at (2).
d. The compiler reports no errors at (3).
e. The compiler reports no errors at (4).
f. The compiler reports errors at (5).
* */