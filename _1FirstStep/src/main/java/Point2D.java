import static java.lang.Math.sqrt;

public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static double distance(Point2D a , Point2D b) {
        int diffA = a.x - b.y;
        int diffB = b.x - b.y;
        return sqrt(diffA * diffA + diffB * diffB);
    }

    public static void info() {
        System.out.println("A 2D point represented by (x,y)-coordinates");
    }
}
