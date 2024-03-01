public class RefObject {
    public static void main(String[] args) {
        Pointer a = new Pointer(4,5);
        Pointer b =  a;
        b.x = -4;
        b.y = -5;
        System.out.println(a);
    }

}

class Pointer{
    public Pointer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x;
    int y;

    @Override
    public String toString() {
        return "Pointer{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}