import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testToString() {
        Rectangle rectangle;
        try {
            rectangle = new Rectangle(5, 10);
        } catch (RectangleOutboundException e) {
            e.printStackTrace();
            return;
        }
        assertEquals(rectangle.toString(), "Rectangle: width=5, height=10, points=[{x: 0, y: 0}, {x: 5, y: 0}, {x: 5, y: 10}, {x: 0, y: 10}]");
    }

    @Test
    void resize() {
        Rectangle rectangle;
        try {
            rectangle = new Rectangle(5, 10);
        } catch (RectangleOutboundException e) {
            e.printStackTrace();
            return;
        }
        double oldP = rectangle.getP();
        rectangle.resize(2, 4);
        assertEquals(oldP + 2 + 2 + 4 + 4, rectangle.getP());
    }
}