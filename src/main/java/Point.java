/**
 * Point describes point (dot) in xy coordinate system
 * @author Anton Monkov
 * @version 1.0
 */
public class Point {

    /**
     * Getter for x param
     * @return coordinate x of Point
     */
    public int getX() {
        return x;
    }

    /**
     * Setter for x param
     * @param x coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Getter for y param
     * @return coordinate y of Point
     */
    public int getY() {
        return y;
    }

    /**
     * Setter for y param
     * @param y coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    private int x = 0;
    private int y = 0;

    /**
     * Constructor of Point with default initialization at {x: 0; y: 0}
     */
    Point() {
        x = 0;
        y = 0;
    }

    /**
     * Constructor of Point with passed {x, y} params
     * @param x coordinate
     * @param y coordinate
     */
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method to cast Point into string
     * @return Point casted to String
     */
    @Override
    public String toString() {
        return "{x: " + x + ", y: " + y + "}";
    }

    /**
     * Method returns distance between current point and passed
     * @param p another Point to calculate distance
     * @return Distance between two points
     */
    public double distanceTo(Point p) {
        return Math.sqrt(Math.pow(this.getX() - p.getX(), 2) + Math.pow(this.getY() - p.getY(), 2));
    }
}
