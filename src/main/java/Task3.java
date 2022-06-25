import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Define polinum:");
        ArrayList<Double> l = new ArrayList<>();
        l.add(2.);
        l.add(4.);
        l.add(5.);
        l.add(3.);
        l.add(7.);
        l.add(9.);
        Polinum p = new Polinum(l);
        System.out.println("Polinum 1: " + p.eval(2));

        ArrayList<Double> l2 = new ArrayList<>();
        l2.add(1.);
        l2.add(4.);
        l2.add(6.);
        l2.add(11.);
        l2.add(8.);
        l2.add(12.);
        Polinum p2 = new Polinum(l2);
        System.out.println("Polinum 2: " + p2.eval(2));

        System.out.println("Racional Eq:");
        RacionalEq req = new RacionalEq(p);
        System.out.println(req.eval(p2, 2));
    }
}
