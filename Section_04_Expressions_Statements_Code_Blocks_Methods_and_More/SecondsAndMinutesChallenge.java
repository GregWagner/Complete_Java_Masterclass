public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-1, 10));
        System.out.println(getDurationString(0, -10));
        System.out.println(getDurationString(0, 60));
        System.out.println(getDurationString(61, 6));
        System.out.println(getDurationString(1, 6));
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(-61));
    }
    
    public static String getDurationString(int minutes, int seconds) {
        if ((minutes >= 0) && (seconds >= 0) && (seconds <= 59)) {
            int hours = minutes / 60;
            minutes %= 60;
            return hours + "h " + minutes + "m " + seconds + "s";
        } 
        return "Invalid value";
    }

    public static String getDurationString(int seconds) {
        return getDurationString(seconds / 60, seconds % 60);
    }
}
