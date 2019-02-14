/**
 * Created by Tyler on 2/14/2019.
 */
public class F5 implements F{
    public double ub;
    public double lb;

    public F5(double a, double b){
        lb = a;
        ub = b;
    }
    public double fun(double x) {
        return 2 * (Math.pow(Math.E, -x / 2) / (Math.sqrt(2 * Math.PI)));
    }
    @Override
    public double getLB() {
        return lb;
    }

    @Override
    public double getUB() {
        return ub;
    }
}
