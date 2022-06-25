/**
 *  Non-extended abstraction of <b>Figure</b> which represents simple line, contained 2 <b>Points</b>
 * @see Figure Figure -  more general realisation for Geometry operations
 * @see Point Point - base class
 */
public class Line {
    /**
     * @see Point
     * @return Start of Line point {x, y}
     */
    public Point getStart() {
        return start;
    }

    /**
     * @see Point
     * @return End of line point {x, y}
     */
    public Point getEnd() {
        return end;
    }

    private Point start;
    private Point end;

    /**
     * Creates empty line with start in {0, 0} and with end in {0, 0}
     */
    Line() {
        this.start = new Point();
        this.end = new Point();
    }

    /**
     * Creates Line from to points
     * @param start start Point of line
     * @param end end Point of line
     * @see Point
     */
    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    /**
     * Creates Line from 2 unwrapped coordinates
     * @param xs X coordinate of start point
     * @param ys Y coordinate of start point
     * @param xe X coordinate of end point
     * @param ye Y coordinate of end point
     * @see Point
     */
    Line(int xs, int ys, int xe, int ye) {
        this.start = new Point(xs, ys);
        this.end = new Point(xe, ye);
    }

    /**
     * Setter of coordinates for end of the Line
     * @param x X coordinate of end point
     * @param y Y coordinate of end point
     * @return current Line instance
     */
    public Line setEndPoint(int x, int y) {
        this.end.setX(x);
        this.end.setY(y);

        return this;
    }

    /**
     * Setter of coordinates for start of the Line
     * @param x X coordinate of start point
     * @param y Y coordinate of start point
     * @return current Line instance
     */
    public Line setStartPoint(int x, int y) {
        this.start.setX(x);
        this.start.setY(y);

        return this;
    }

    /**
     * Method moves Line on xy coordinates system, synchronously change location of start and end Points
     * @param x delta to move Figure's points on x coordinate
     * @param y delta to move Figure's points on y coordinate
     * @return The same instance of Figure
     */
    public Line move(int x, int y) {
        this.start.setX(this.start.getX() + x);
        this.end.setX(this.end.getX() + x);

        this.start.setY(this.start.getY() + y);
        this.end.setY(this.end.getY() + y);

        return this;
    }

    /**
     * Returns length of the Line, using similar formula with Point's distanceTo method
     * @see Point Similar with Point::distanceTo method
     * @return length of the line
     */
    public double length() {
        return Math.sqrt(Math.pow(this.start.getX() - this.end.getX(), 2) + Math.pow(this.start.getY() - this.end.getY(), 2));
    }

    /**
     * Line converted into readable format for output and logs
     * @return Stringed Line
     */
    @Override
    public String toString() {
        return "Line: start=" + start + ", end=" + end + ";";
    }
}
