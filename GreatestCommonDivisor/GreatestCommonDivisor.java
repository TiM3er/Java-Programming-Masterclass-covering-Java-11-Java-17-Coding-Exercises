package GreatestCommonDivisor;

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int number1, int number2) {
        if (number1 < 10 || number2 < 10)
            return -1;
        List<Integer> divisorNumber1 = new ArrayList<>();
        List<Integer> divisorNumber2 = new ArrayList<>();
        for (int i = 1; i <= number1; i++) {
            if (number1 % i == 0) {
                divisorNumber1.add(i);
            }
        }
        for (int i = 1; i <= number2; i++) {
            if (number2 % i == 0) {
                divisorNumber2.add(i);
            }
        }
        int max = 0;
        for (int i = 0; i < divisorNumber1.size(); i++) {
            if (divisorNumber2.contains(divisorNumber1.get(i))) {
                if (max < divisorNumber1.get(i))
                    max = divisorNumber1.get(i);

            }
        }
        return max;
    }
}
