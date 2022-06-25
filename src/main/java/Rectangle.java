/**
 * RectangleOutboundException throws when passed invalid width or height or other rectangle dimensions
 * @author Anton Monkov
 * @version 1.0
 * @see Exception
 * @see Rectangle
 */
class RectangleOutboundException extends Exception {
    RectangleOutboundException() {
        super("RectangleOutboundException: width or height out of bound, use more than 0");
    }
}

/**
 * Rectangle is derivative class of Figure represents rectangle in xy coordinate system
 * @see Figure Figure - Parent class
 */
public class Rectangle extends Figure {
    private int width = 0;
    private int height = 0;

    /**
     * Creates Rectangle with passed width and height, it's generates 4 points which describes this Rectangle
     * @param width should be more or equals to 1
     * @param height should be more or equals to 1
     * @see Point
     * @see Figure
     * @throws RectangleOutboundException
     */
    Rectangle(int width, int height) throws RectangleOutboundException {
        super(new Point(0, 0), new Point(width, 0), new Point(width, height), new Point(0, height));

        this.height = height;
        this.width = width;
        if (width <= 0 || height <= 0) {
            throw new RectangleOutboundException();
        }
    }

    /**
     * Overrides move method of Figure for feature changes, just draft
     * @param x delta to move Figure's points on x coordinate
     * @param y delta to move Figure's points on y coordinate
     * @return Instance of Rectangle linked as Figure
     * @see Figure
     */
    @Override
    public Figure move(int x, int y) {
        return super.move(x, y);
    }

    /**
     * Generates readable version of Rectangle for outputs and logs
     * @return Stringed Rectangle
     */
    @Override
    public String toString() {
        return "Rectangle: width=" + width + ", height=" + height + ", points=" + points.toString();
    }

    /**
     * Method resize Rectangle.
     * It's change Points positions depends on passed {x, y}, only first coordinate didn't move
     * @param x delta to change width of Rectangle
     * @param y delta to change height of Rectangle
     * @return current instance of Rectangle
     * @see Point
     */
    public Rectangle resize(int x, int y) {
        Point tmpPoint = points.get(1);
        tmpPoint.setX(tmpPoint.getX() + x);
        points.remove(1);
        points.add(1, tmpPoint);
        tmpPoint = points.get(2);
        tmpPoint.setX(tmpPoint.getX() + x);
        tmpPoint.setY(tmpPoint.getY() + y);
        points.remove(2);
        points.add(2, tmpPoint);
        tmpPoint = points.get(3);
        tmpPoint.setY(tmpPoint.getY() + y);
        points.remove(3);
        points.add(3, tmpPoint);

        return this;
    }
}
