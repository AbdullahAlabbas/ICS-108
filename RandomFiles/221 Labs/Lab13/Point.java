public class Point implements Comparable<Point>, Cloneable {
    private double x;
    private double y;
    public final Point ORIGIN = new Point(0, 0);

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point pointOne) {
        double distance = Math.sqrt(
                Math.pow(pointOne.getX() - x, 2)
                        + Math.pow(pointOne.getY() - y, 2));
        return distance;
    }

    @Override
    public int compareTo(Point point) {
        if (distance(ORIGIN) == point.distance(ORIGIN))
            return 0;
        else if (distance(ORIGIN) > point.distance(ORIGIN))
            return 1;
        else
            return -1;
    }

    @Override
    public Object clone() {
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}