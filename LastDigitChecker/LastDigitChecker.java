package LastDigitChecker;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int x1, int x2, int x3) {
        if (!(isValid(x1) && isValid(x2) && isValid(x3)))
            return false;
        String x1s = String.valueOf(x1);
        String x2s = String.valueOf(x2);
        String x3s = String.valueOf(x3);
        char x1c = x1s.charAt(x1s.length() - 1);
        char x2c = x2s.charAt(x2s.length() - 1);
        char x3c = x3s.charAt(x3s.length() - 1);
        if (Character.compare(x1c, x2c) == 0 || Character.compare(x3c, x2c) == 0 || Character.compare(x3c, x1c) == 0)
            return true;
        return false;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000)
            return false;
        return true;
    }
}
