package q38;

public class Thingy<T> implements Comparable<T> {
    private T value;
    public Thingy(T value) {
        this.value = value;
    }
    public String toString() {
        return value.toString();
    }
    public int compareTo(T obj) {
        return this.value.toString().compareTo(obj.toString());
    }
}