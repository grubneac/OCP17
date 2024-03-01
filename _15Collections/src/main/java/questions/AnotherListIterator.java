package questions;
import java.util.*;
class AnotherListIterator<T> implements Iterable<T>{

    private List<T> lst;
    public AnotherListIterator(List<T> lst) { this.lst = lst; }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int next = lst.size() - 1;

            public boolean hasNext() { return (next >= 0); }
            public T next() {
                T element = lst.get(next);
                next--;
                return element;
            }
        };
    }

    public static void main(String[] args) {
        List<String> lst = List.of("Hi", "Howdy", "Hello");
        AnotherListIterator<String> rlt = new AnotherListIterator<>(lst);
        for (String str : rlt) {
            System.out.print("|" + str + "|");
        }
    }
}
