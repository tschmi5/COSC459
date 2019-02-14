/**
 * Created by Tyler on 2/14/2019.
 */
public class F2 implements F{
    public double ub;
    public double lb;
    public F2(double a, double b){
        lb = a;
        ub = b;
    }
    public double fun(double x){
        return Math.sin(x);
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
