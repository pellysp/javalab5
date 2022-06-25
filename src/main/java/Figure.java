import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Figure describes number of <b>Points</b> which in connected state creates Polygon
 * @see Point
 * @author Anton Monko
 * @version 1.0
 */
public class Figure {
    protected ArrayList<Point> points;

    /**
     * Constructor of figure with initial points
     * @param points unwrapped array of initial points
     */
    Figure(Point ...points) {
        this.points = Arrays.stream(points).collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Constructor for Figure without initial points, generates empty Figure
     */
    Figure() {
        this.points = new ArrayList<>();
    }

    /**
     * Method moves Figure on xy coordinates system, synchronously change location of all Figures Points
     * @param x delta to move Figure's points on x coordinate
     * @param y delta to move Figure's points on y coordinate
     * @return The same instance of Figure
     * @see Point
     */
    public Figure move(int x, int y) {
        points = points.stream().peek((point) -> {
            point.setX(point.getX() + x);
            point.setY(point.getY() + y);
        }).collect(Collectors.toCollection(ArrayList::new));

        return this;
    }

    /**
     * Calculate and return perimeter of Figure
     * @see Point Method distanceTo of <b>Point</b> for more information
     * @return Perimeter of Figure
     */
    public double getP() {
        double p = 0;
        for (int i = 0; i < points.size(); i++) {
            if (i == points.size() - 1) {
                p += points.get(points.size() - 1).distanceTo(points.get(0));
                continue;
            }
            p += points.get(i).distanceTo(points.get(i + 1));
        }
        return p;
    }

    /**
     * Convert Figure to string, extracting all necessary data
     * @return Stringed Figure
     */
    @Override
    public String toString() {
        return "Points: " + points.toString();
    }
}
