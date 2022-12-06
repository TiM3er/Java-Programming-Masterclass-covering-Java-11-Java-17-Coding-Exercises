package Shared.Digit;

public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) return false;
        String string1 = String.valueOf(number1);
        String string2 = String.valueOf(number2);

        for (int i = 0; i < string1.length(); i++) {
            for (int j = 0; j < string2.length(); j++) {
                if (string1.charAt(i) == string2.charAt(j)) return true;

            }
        }
        return false;
    }
}
