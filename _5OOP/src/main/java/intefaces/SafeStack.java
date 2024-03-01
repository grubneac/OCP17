package intefaces;

//______________________________________________________________________________
public class SafeStack extends Stack implements ISafeStack {                     // (6)

    public SafeStack(int capacity) {
        super(capacity);
    }

    @Override
    public boolean isEmpty() {
        return tos < 0;
    }                  // (7)

    @Override
    public boolean isFull() {
        return tos >= elements.length - 1;
    } // (8)
}
