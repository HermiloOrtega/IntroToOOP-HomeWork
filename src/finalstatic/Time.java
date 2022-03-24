package finalstatic;
import static finalstatic.Validation.*;

// universalForm = 21:45:20
// standardForm = 9:45:20 PM
public class Time {
    public static int instanceCount = 0;
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour) {
        this(hour, 0, 0);
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    /**
     * Designated Constructor
     * @param hour
     * @param minute
     * @param second
     */
    public Time(int hour, int minute, int second) {
        checkHour(hour);
        checkMinute(minute);
        checkSecond(second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        instanceCount++;
    }

    public String toUniversalForm() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandardForm() {
        int h = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String unit = (hour < 12) ? "AM" : "PM";
        return String.format("%d:%02d:%02d %s", h, minute, second, unit);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        checkHour(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        checkMinute(minute);
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        checkSecond(second);
        this.second = second;
    }
}
