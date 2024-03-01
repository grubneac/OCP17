package intefaces;

//______________________________________________________________________________
public class Stack implements IStack {                                           // (2)
    protected Object[] elements;
    protected int tos;  // top of stack

    public Stack(int capacity) {
        elements = new Object[capacity];
        tos = -1;
    }

    @Override
    public void push(Object item) {
        elements[++tos] = item;
    }               // (3)

    @Override
    public Object pop() {                                                   // (4)
        Object objRef = elements[tos];
        elements[tos] = null;
        tos--;
        return objRef;
    }

    public Object peek() {
        return elements[tos];
    }
}
