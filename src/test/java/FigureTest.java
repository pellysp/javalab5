import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureTest {

    @Test
    void move() {
        Figure figure = new Figure(new Point(3, 5), new Point(5, 5), new Point(7, 5), new Point(3, 3));
        double lastP = figure.getP();
        figure.move(5, 5);
        assertEquals(lastP, figure.getP());
    }

    @Test
    void getP() {
        Figure figure = new Figure(new Point(3, 5), new Point(5, 5), new Point(7, 5), new Point(3, 3));
        assertEquals(10.47213595499958, figure.getP());
    }

    @Test
    void testToString() {
        Figure figure = new Figure(new Point(3, 5), new Point(5, 5), new Point(7, 5), new Point(3, 3));
        assertEquals(figure.toString(), "Points: [{x: 3, y: 5}, {x: 5, y: 5}, {x: 7, y: 5}, {x: 3, y: 3}]");
    }
}