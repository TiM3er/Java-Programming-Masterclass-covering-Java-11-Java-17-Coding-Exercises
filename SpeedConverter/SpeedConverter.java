package SpeedConverter;

public class SpeedConverter {

    public static long toMilesPerHour(double speedMiles) {
        if (speedMiles < 0)
            return -1;
        return Math.round((speedMiles /  1.609));
    }

    public static void printConversion(double speedMiles) {
        if (speedMiles < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(speedMiles + " km/h = " + toMilesPerHour(speedMiles)+ " mi/h");
    }
}
