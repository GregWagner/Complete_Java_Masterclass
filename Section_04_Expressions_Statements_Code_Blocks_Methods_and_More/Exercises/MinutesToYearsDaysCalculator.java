public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    } 

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            final long MINUTES_PER_DAY = 24 * 60;
            final long MINUTES_PER_YEAR = MINUTES_PER_DAY * 365;
            System.out.printf("%d min = %d y and %d d%n", minutes,
                    minutes / MINUTES_PER_YEAR, 
                    (minutes % MINUTES_PER_YEAR) / MINUTES_PER_DAY);
        }
    }
}
