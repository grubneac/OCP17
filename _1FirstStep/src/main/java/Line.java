import static java.lang.Math.sqrt;

public class Line {
    private Point2D endPoint1;
    private Point2D endPoint2;

    public static void main(String[] args) {
        Line line1 = new Line(new Point2D(5,6), new Point2D(7,8));
        System.out.println(line1.toString());               // Line[(5,6),(7,8)]
        line1.setEndPoint1(new Point2D(11, 12));
        line1.setEndPoint2(new Point2D(13, 14));
        System.out.println(line1.toString());               // Line[(11,12),(13,14)]
        System.out.println("Length: " + line1.length());    // Length: 2.8284271247461903
    }

    public Line(Point2D endPoint1, Point2D endPoint2) {
        this.endPoint1 = endPoint1;
        this.endPoint2 = endPoint2;
    }

    public void setEndPoint1(Point2D endPoint1) {
        this.endPoint1 = endPoint1;
    }

    public void setEndPoint2(Point2D endPoint2) {
        this.endPoint2 = endPoint2;
    }

    public Point2D getEndPoint1() {
        return endPoint1;
    }

    public Point2D getEndPoint2() {
        return endPoint2;
    }

    public double length() {
        int xDiff = endPoint1.getX() - endPoint2.getX();
        int yDiff = endPoint1.getY() - endPoint2.getY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

}
