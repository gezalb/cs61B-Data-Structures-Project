/** A class that represents a path via pursuit curves. */
public class Path {

    // TODO
    Point curr;
    Point next;

    public Path(double x, double y) {
        this.curr =new Point();
        this.next = new Point(x,y);
    }

    public double getCurrX() {
        return curr.getX();
    }

    public double getCurrY() {
        return curr.getY();
    }

    public double getNextX() {
        return next.getX();
    }

    public double getNextY() {
        return next.getY();
    }

    public Point getCurrentPoint() {
        return this.curr;
    }

    public void setCurrentPoint( Point point) {
        curr = point;
    }

    public void iterate(double dx, double dy) {
        this.curr = next;
        this.next = new Point( getCurrX()+ dx,getCurrY()+dy) ;
    }

}
