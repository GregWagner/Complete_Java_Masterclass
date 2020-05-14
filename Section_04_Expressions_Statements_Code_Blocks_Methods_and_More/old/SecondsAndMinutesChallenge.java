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

    private static boolean isValidTime(int minutes, int seconds) {
        return minutes >= 0 && seconds >= 0 && seconds < 60;
    }
    
    public static String getDurationString(int minutes, int seconds) {
        if (!isValidTime(minutes, seconds)) {
            return "Invalid value";
        }
        int hours = minutes / 60;
        minutes %= 60;
        return (hours < 10 ? "0" : "") + hours + "h " + 
            (minutes < 10 ? "0" : "") + minutes + "m " + 
            (seconds < 10 ? "0" : "") + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        return getDurationString(seconds / 60, seconds % 60);
    }
}
