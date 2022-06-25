import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RacionalEqTest {

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
        ArrayList<Double> l2 = new ArrayList<>();
        l2.add(1.);
        l2.add(4.);
        l2.add(6.);
        l2.add(11.);
        l2.add(8.);
        l2.add(12.);
        Polinum p2 = new Polinum(l2);

        RacionalEq req = new RacionalEq(p);
        assertEquals(1.1229946524064172, req.eval(p2, 2));
    }
}