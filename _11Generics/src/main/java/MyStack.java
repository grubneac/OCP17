import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Simplified implementation of a generic stack
 */
public class MyStack<E> implements IStack<E> {                     // (1)
    // Top of stack.
    private Node<E> tos;                                             // (2)
    // Size of stack
    private int numOfElements;                                       // (3)

    @Override
    public boolean isEmpty() {
        return tos == null;
    }       // (4)

    @Override
    public int size() {
        return numOfElements;
    }     // (5)

    @Override
    public void push(E element) {                          // (6)
        tos = new Node<>(element, tos);
        ++numOfElements;
    }

    @Override
    public E pop() {                                       // (7)
        if (!isEmpty()) {
            E data = tos.getData();
            tos = tos.getNext();
            --numOfElements;
            return data;
        }
        throw new NoSuchElementException("No elements.");
    }

    @Override
    public E peek() {                                     // (8)
        if (!isEmpty()) return tos.getData();
        throw new NoSuchElementException("No elements.");
    }

    // Membership
    @Override
    public boolean isMember(E element) {                   // (9)
        for (E data : this)
            if (data.equals(element))
                return true;       // Found.
        return false;          // Not found.
    }

    // Get iterator.
    @Override
    public Iterator<E> iterator() {                        // (10)
        return new NodeIterator<>(this.tos);
    }

    // Copy to array as many elements as possible.
    @Override
    public E[] toArray(E[] toArray) {                      // (11)
        Node<E> thisNode = tos;
        for (int i = 0; thisNode != null && i < toArray.length; i++) {
            toArray[i] = thisNode.getData();
            thisNode = thisNode.getNext();
        }
        return toArray;
    }

    // Text representation of stack: (e1, e2, ..., en).
    @Override
    public String toString() {                             // (12)
        StringBuilder rep = new StringBuilder("(");
        for (E data : this) {
            rep.append(data + ", ");
        }
        if (!isEmpty()) {
            int len = rep.length();
            rep.delete(len - 2, len);                   // Delete the last ", ".
        }
        rep.append(")");
        return rep.toString();
    }

    public void moveFromV1(MyStack<E> srcStack) {            // (1)
        while (!srcStack.isEmpty())
            this.push(srcStack.pop());
    }

    public void moveFromV2(MyStack<? extends E> srcStack) {  // (2)
        while (!srcStack.isEmpty())
            this.push(srcStack.pop());
    }

//        public void moveFromV3(MyStack<? super E> srcStack) {    // (3)
//        while (!srcStack.isEmpty())
//            this.push(srcStack.pop());                           // Compile-time error!
//    }
    public void moveToV1(MyStack<E> dstStack) {               // (4)
        while (!this.isEmpty())
            dstStack.push(this.pop());
    }

//    public void moveToV2(MyStack<? extends E> dstStack) {     // (5)
//        while (!this.isEmpty())
//            dstStack.push(this.pop());                            // Compile-time error!
//    }

    public static <E> void move(MyStack<? extends E> srcStack,  // (7)
                                MyStack<? super E> dstStack) {
        while (!srcStack.isEmpty())
            dstStack.push(srcStack.pop());
    }
    public void moveToV3(MyStack<? super E> dstStack) {       // (6)
        while (!this.isEmpty())
            dstStack.push(this.pop());
    }
    @SuppressWarnings("unchecked")
    public E[] toArray4(E[] toArray) {
        if (toArray.length != numOfElements) {
            toArray = (E[])java.lang.reflect.Array.newInstance(             // (3)
                    toArray.getClass().getComponentType(),
                    numOfElements);          // Suppressed unchecked warning
        }
        int i = 0;
        for (E data : this) { toArray[i++] = data; }
        return toArray;
    }

    public static void main(String[] args) {
        MyStack<Number> numStack   = new MyStack<>();                  // Stack of Number
        numStack.push(5.5); numStack.push(10.5); numStack.push(20.5);
        MyStack<Integer> intStack1 = new MyStack<>();                  // Stack of Integer
        intStack1.push(5); intStack1.push(10); intStack1.push(20);
        MyStack<Integer> intStack2 = new MyStack<>();                  // Stack of Integer
        intStack2.push(15); intStack2.push(25); intStack2.push(35);

        intStack1.moveFromV1(intStack2); // Ok.Pop from intStack2. Push on intStack1.
//        numStack.moveFromV1(intStack2);  // Compile-time error!
        numStack.moveFromV2(intStack2);

        intStack1.moveToV1(intStack2);    // Pop from intStack1. Push on intStack2.
//        intStack1.moveToV1(numStack);     // Compile-time error!

        intStack1.moveToV3(intStack2);    // Pop from intStack1. Push on intStack2.
        intStack1.moveToV3(numStack);     // Pop from intStack1. Push on numStack.

        // Client code
        MyStack.move(intStack1, intStack2);
        MyStack.move(intStack1, numStack);
//        MyStack.move(numStack, intStack2);     // Compile-time error!

        MyStack<Integer> intStack = new MyStack<>();
        intStack.push(9); intStack.push(2); intStack.push(1);
        Integer[] intArray = intStack.toArray4(new Integer[0]);
        Arrays.stream(intArray).forEach(System.out::println);
    }
}