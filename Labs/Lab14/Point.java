package Labs.Lab14;
public class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Point other) {
        if (this.x > other.x) return 1;
        else if (this.x < other.x) return -1;
        else{
            if (this.y > other.y) return 1;
            else if (this.y < other.y) return -1;

        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            return this.x == other.x && this.y == other.y;
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }}
