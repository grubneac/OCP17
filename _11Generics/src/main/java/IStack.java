import java.util.Iterator;
import java.util.Stack;

public interface IStack<E> extends Iterable<E>{
    boolean isEmpty();
    int size();
    void push(E element);
    E pop();
    E peek();
    boolean isMember(E element);
    Iterator<E> iterator();
    E[] toArray(E[] toArray);
}
