package Equal.Sum.Checker;

public class EqualSumChecker {
    public static boolean hasEqualSum(int x1, int x2, int sum) {
        int sumx1andx2 = x1 + x2;
        return sum == sumx1andx2;
    }
}
