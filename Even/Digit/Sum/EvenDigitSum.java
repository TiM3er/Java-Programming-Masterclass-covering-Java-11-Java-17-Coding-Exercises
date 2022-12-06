package Even.Digit.Sum;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int sum = 0;
        String numberString = String.valueOf(number);
        for (int i = 0; i < numberString.length(); i++) {
            if (Integer.parseInt(String.valueOf(numberString.charAt(i))) % 2 == 0) {
                sum = sum + Integer.parseInt(String.valueOf(numberString.charAt(i)));
            }
        }
        return sum;
    }
}
