package LargestPrime;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number < 2)
            return -1;
        int maxPrimar = 1;
        for (int i = 2; i <= Math.ceil(Math.abs(number)); i++) {
            if (number % i == 0) {
                boolean primar = true;
                for (int j = 2; j <= Math.ceil(Math.abs(i)); j++) {
                    if (i != j && i % j == 0)
                        primar = false;
                }
                if (primar) {
                    if (maxPrimar < i) {
                        maxPrimar = i;
                    }
                }
            }
        }
        return maxPrimar;
    }

    public static void main(String[] args) {
        getLargestPrime(7);
    }
}
