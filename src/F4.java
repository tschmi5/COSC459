/**
 * Created by Tyler on 2/14/2019.
 */
public class F4 implements F{
    public double ub;
    public double lb;
    public F4(double a, double b){
        lb = a;
        ub = b;
    }
    public double fun(double x){
        return (1/((x*x)+1));
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
