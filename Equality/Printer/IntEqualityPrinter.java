package Equality.Printer;

public class IntEqualityPrinter {
    public static void printEqual(int x1, int x2, int x3) {
        if (x1 < 0 || x2 < 0 || x3 < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (x1 == x2 && x2 == x3 && x1 == x3) {
            System.out.println("All numbers are equal");
            return;
        }
        if (x1 != x2 && x2 != x3 && x1 != x3) {
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");

    }
}
