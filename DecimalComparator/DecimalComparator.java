package DecimalComparator;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        if (d2 != d2) {
            return false;
        }
        DecimalFormat df = new DecimalFormat("###.###");
        df.setRoundingMode(RoundingMode.DOWN);
        if (df.format(d1).equalsIgnoreCase(df.format(d2))) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(0.0, 0.0);
    }
}
