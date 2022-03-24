package finalstatic;

public class Validation {
    public static void checkHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
    }

    public static void checkMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
    }

    public static void checkSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("second must be 0-59");
        }
    }
}
