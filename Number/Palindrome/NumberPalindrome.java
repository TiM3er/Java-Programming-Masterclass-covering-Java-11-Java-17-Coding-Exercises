package Number.Palindrome;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        String numberString = String.valueOf(Math.abs(number));
        String numberString2 = "";
        for (int i = numberString.length() - 1; i >= 0; i--) {
            numberString2 = numberString2 + numberString.charAt(i);
        }
        return numberString.equalsIgnoreCase(numberString2);
    }
}
