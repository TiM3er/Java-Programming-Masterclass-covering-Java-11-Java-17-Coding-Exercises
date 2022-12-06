package PerfectNumber;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1)
            return false;
        int sum = 0;

        for (int i = 1; i <= Math.ceil(number / 2); i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum == number;
    }

    public static void main(String[] args) {
        isPerfectNumber(28);
    }

}
