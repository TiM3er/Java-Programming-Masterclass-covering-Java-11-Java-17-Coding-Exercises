package Minutes.To.Years.and.Days.Calculator;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long year = minutes / 525600;
        long days = (minutes - year * 525600) / 1440;
        System.out.println(minutes + " min = " + year + " y and " + days + " d");
    }
}
