import static java.lang.Math.sqrt;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3DInn p3A = new Point3DInn(10, 20, 30);
        System.out.println(p3A.toString());               // (10,20,30)       (Point3D)
        System.out.println("x: " + p3A.getX());           // x: 10            (Point2D)
        System.out.println("y: " + p3A.getY());           // y: 20            (Point2D)
        System.out.println("z: " + p3A.getZ());           // z: 30            (Point3D)

        p3A.setX(-10);
        p3A.setY(-20);
        p3A.setZ(-30);
        System.out.println(p3A.toString());               // (-10,-20,-30)    (Point3D)

        Point3DInn p3B = new Point3DInn(30, 20, 10);
        System.out.println(p3B.toString());               // (30,20,10)       (Point3D)
        System.out.println(Point3DInn.distance(p3A, p3B));   // 69.2820323027551 (Point3D)
        Point3DInn.showInfo(); // A 3D point represented by (x,y,z)-coordinates. (Point3D)
    }
}

    class Point2DInn {
    private int x;
    private int y;

    public Point2DInn(int x, int y) {
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

    public static double distance(Point2DInn a , Point2DInn b) {
        int diffA = a.getX() - b.getY();
        int diffB = b.getX() - b.getY();
        return sqrt(diffA * diffA + diffB * diffB);
    }

    public static void info() {
        System.out.println("A 2D point represented by (x,y)-coordinates");
    }
}


class Point3DInn extends Point2DInn{

    private int z;
    // Static variable:

    private static String info = "A 3D point represented by (x,y,z)-coordinates.";

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public Point3DInn(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                '}';
    }
    // Static methods:                                                    (7)
    public static double distance(Point3DInn p1, Point3DInn p2) {
        int xDiff = p1.getX() - p2.getX();
        int yDiff = p1.getY() - p2.getY();
        int zDiff = p1.getZ() - p2.getZ();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff + zDiff*zDiff);
    }

    public static void showInfo() { System.out.println(info); }

}
