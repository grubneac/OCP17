package Questions;

public class Box<T> {
    private T item;                                      // (1)

//    private static T[] storage = new T[100];             // (2)

    public Box(T item) { this.item = item; }             // (3)

    public T getItem() { return item; }                  // (4)

    public void setItem(T newItem) { item = newItem; }   // (5)

//    public static void getAllItems(T newItem) {          // (6)
//        T temp;                                            // (7)
//    }
}
/*
* Select the three correct answers.

a. The occurrence of the type parameter T at (1)

b. The occurrence of the type parameter T at (2)

c. The occurrence of the type parameter T at (3)

d. The occurrence of the type parameter T at (4)

e. The occurrence of the type parameter T at (5)

f. The occurrence of the type parameter T at (6)

g. The occurrence of the type parameter T at (7)
* */