public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1600) == true);
        System.out.println(isLeapYear(2017) == false);
        System.out.println(isLeapYear(2000) == true);

        System.out.println(getDaysInMonth(1, 2020) == 31);
        System.out.println(getDaysInMonth(2, 2020) == 29);
        System.out.println(getDaysInMonth(2, 2018) == 28);
        System.out.println(getDaysInMonth(-1, 2020) == -1);
        System.out.println(getDaysInMonth(1, -2020) == -1);
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        boolean leap = isLeapYear(year);
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (leap) {
                    return 29;
                }
                return 28;
            default:
                return 30;
        }
    }
}
