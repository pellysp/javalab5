import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PolinumTest {

    @Test
    void eval() {
        ArrayList<Double> l = new ArrayList<>();
        l.add(2.);
        l.add(4.);
        l.add(5.);
        l.add(3.);
        l.add(7.);
        l.add(9.);
        Polinum p = new Polinum(l);
        assertEquals(187, p.eval(2));
    }

    @Test
    void testToString() {
        ArrayList<Double> l = new ArrayList<>();
        l.add(2.);
        l.add(4.);
        l.add(5.);
        l.add(3.);
        l.add(7.);
        l.add(9.);
        Polinum p = new Polinum(l);
        assertEquals(p.toString(), "[9.0, 7.0, 5.0, 4.0, 3.0, 2.0]");
    }
}