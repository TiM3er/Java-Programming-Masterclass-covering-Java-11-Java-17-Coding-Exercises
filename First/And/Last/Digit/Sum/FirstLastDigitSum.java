package First.And.Last.Digit.Sum;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;
        String numberS = String.valueOf(number);
        return Integer.parseInt(String.valueOf(numberS.charAt(0))) +
                Integer.parseInt(String.valueOf(numberS.charAt(numberS.length() - 1)));
    }

    public static void main(String[] args) {
        sumFirstAndLastDigit(5);
    }
}
