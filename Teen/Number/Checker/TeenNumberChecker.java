package Teen.Number.Checker;

public class TeenNumberChecker {

    public static boolean hasTeen(int low, int up, int searchNumber) {
        if (low > 19 || up < 13) {
            return false;
        }
        if (low >= up) {
            return false;
        }
        return isTeen(searchNumber);
    }

    public static boolean isTeen(int age) {
        if (age > 19 || age < 13) {
            return false;
        }
        return true;
    }
}
