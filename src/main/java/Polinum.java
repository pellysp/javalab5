import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Polinum represents simple polynomial from Algebra
 * @author Anton Monkov
 * @version 1.0
 */
public class Polinum {
    private ArrayList<Double> coeff;

    /**
     * Resolves polynomial using basic method and passed x
     * @param x X variable to resolve polynomial
     * @return resolved polynomial
     */
    double eval(double x) {
        double result = 0;
        for (int i = 0; i < coeff.size(); i++) {
            result += coeff.get(i)*Math.pow(x, i);
        }
        return result;
    }

    /**
     * Initialise polynomial from list of coefficients
     * @param coeffs List of coefficients
     */
    Polinum(List<Double> coeffs) {
        coeff = new ArrayList<>(coeffs);
        Collections.sort(coeff);
        Collections.reverse(coeff);
    }

    /**
     * Method converts existed polynomial to list
     * @return list of coefficients
     */
    public List<Double> toList() {
        return coeff.stream().toList();
    }

    /**
     * Stringed polynomial
     * @return polynomial in readable format
     */
    @Override
    public String toString() {
        return coeff.toString();
    }
}
