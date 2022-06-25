import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void setEndPoint() {
        Line line = new Line().setEndPoint(5, 5);
        assertEquals(line.getEnd().getX(), 5);
        assertEquals(line.getEnd().getY(), 5);
    }

    @Test
    void setStartPoint() {
        Line line = new Line().setStartPoint(5, 5);
        assertEquals(line.getStart().getX(), 5);
        assertEquals(line.getStart().getY(), 5);
    }

    @Test
    void move() {
        Line line = new Line().setStartPoint(0, 0).setEndPoint(5, 5);
        line.move(2, 3);
        assertEquals(line.getStart().getX(), 2);
        assertEquals(line.getStart().getY(), 3);

        assertEquals(line.getEnd().getX(), 7);
        assertEquals(line.getEnd().getY(), 8);
    }

    @Test
    void length() {
        Line line = new Line().setStartPoint(0, 0).setEndPoint(5, 5);
        line.move(2, 3);
        assertEquals(7.0710678118654755, line.length());
    }

    @Test
    void testToString() {
        Line line = new Line().setStartPoint(0, 0).setEndPoint(5, 5);
        assertEquals("Line: start={x: 0, y: 0}, end={x: 5, y: 5};", line.toString());
    }
}