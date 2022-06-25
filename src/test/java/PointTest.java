import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testToString() {
        Point p = new Point(4, 4);
        assertEquals(p.toString(), "{x: 4, y: 4}");
    }

    @Test
    void distanceTo() {
        Point p = new Point(4, 4);
        Point p2 = new Point(4, 8);
        assertEquals(p.distanceTo(p2), 4);
    }
}