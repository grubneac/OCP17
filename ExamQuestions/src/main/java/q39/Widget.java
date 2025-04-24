package q39;

public class Widget<T> {
    private T value;
    private static int result;
    public Widget(T value) { this.value = value; }
    public void compute(Comparable<T> c) {
        result += c.compareTo(value);
    }
    public static int getResult() { return result; }
}
