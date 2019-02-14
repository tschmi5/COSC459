public class Main {

    public static void main(String[] args) {

        F [] f = {new F1(2,6),new F2(0,Math.PI),new F3(2,5),new F4(1,4),new F5(0,6)};

        for(int i = 0; i < f.length; i++){

            System.out.println("Question # " + (i + 1));
            System.out.printf("%-4d  %.4f \n", 10,trap(10,f[i]));
            System.out.printf("%-4d  %.4f \n", 100,trap(100,f[i]));
            System.out.printf("%-4d  %.4f \n\n",1000, trap(1000,f[i]));

        }

    }

    public static double trap(int d, F f){
        double interval = (f.getUB() - f.getLB())/d;
        double area = (f.fun(f.getUB()) + f.fun(f.getLB()))/2;

        for(int i = 1; i < d; i++){
            double temp = f.getLB() + interval * i;
            area = area + f.fun(temp);
        }
        return area * interval;
    }

}
