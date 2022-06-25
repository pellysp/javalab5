/**
 * Rational expression divides Polinums by Polinums
 * @see Polinum
 * @author Anton Monkov
 * @version 1.0
 */
public class RacionalEq extends Polinum {
    /**
     * Creates rational expression from Polinum
     * @see Polinum
     * @param polinum polynomial which will be used as denominator
     */
    RacionalEq(Polinum polinum) {
        super(polinum.toList());
    }

    /**
     * Evaluates rational expression
     * @param polinum - polynomial which will be used as numerator
     * @param x X param to resolve evaluation
     * @return result of rational expression
     */
    public double eval(Polinum polinum, double x) {
        return polinum.eval(x)/this.eval(x);
    }
}
