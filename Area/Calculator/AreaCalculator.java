package Area.Calculator;

public class AreaCalculator {

    public static double area(double round) {
        if (round < 0) {
            return -1;
        }
        return round * round * Math.PI;
    }

    public static double area(double a, double b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        return a * b ;
    }

}
