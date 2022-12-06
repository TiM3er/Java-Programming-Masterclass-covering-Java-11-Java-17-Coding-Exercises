package NumberToWords;

public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        String oldNumber = String.valueOf(number);
        for (int i = 0; i < oldNumber.length(); i++) {
            switch (oldNumber.charAt(i)) {
                case '0':
                    System.out.print("Zero");
                    break;
                case '1':
                    System.out.print("One");
                    break;
                case '2':
                    System.out.print("Two");
                    break;
                case '3':
                    System.out.print("Three");
                    break;
                case '4':
                    System.out.print("Four");
                    break;
                case '5':
                    System.out.print("Five");
                    break;
                case '6':
                    System.out.print("Six");
                    break;
                case '7':
                    System.out.print("Seven");
                    break;
                case '8':
                    System.out.print("Eight");
                    break;
                case '9':
                    System.out.print("Nine");
                    break;
            }
            System.out.print(" ");

        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        return String.valueOf(number).length();
    }

    public static int reverse(int number) {
        boolean negative = false;
        if (number < 0)
            negative = true;
        String newNumber = "";
        String oldNumber = String.valueOf(Math.abs(number));
        for (int length = oldNumber.length(); length > 0; length--) {
            newNumber = newNumber + oldNumber.charAt(length - 1);
        }
        if (negative)
            newNumber = "-" + newNumber;
        return Integer.parseInt(newNumber);
    }

    public static void main(String[] args) {
        numberToWords(0);
    }
}
