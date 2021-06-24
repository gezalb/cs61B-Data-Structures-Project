/** A class that represents a path via pursuit curves. */
public class Path {

    // TODO
    private double x;
    private double y;
    Point curr;
    Point next;

    public Path(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getCurrX() {
        return this.x;
    }

    public double getCurrY() {
        return this.y;
    }

    public double getNextX() {
        return this.x;
    }

    public double getNextY() {
        return this.y;
    }

    public Point getCurrentPoint() {
        return this.curr
    }

    publuc void setCurrentPoint( Point point) {
        curr = point
    }

    public void iterate(double dx, double dy) {
        Point temp_curr = curr;
        this.curr = next;
        this.next = temp_curr;
    }
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
