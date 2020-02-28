package ex06;

public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static Time convertSeconds(int seconds){
        int sec = seconds % 60;
        int hour = seconds / 60;
        int mins = hour % 60;

        hour = hour / 60;

        return new Time(hour, mins, sec);
    }
    public static Time lectureLength(Time t1, Time t2){
        // Add code to compute the difference between the two given time objects.
        return t1;
    }

    public int secondsDifference(Time t){
        // Add code to compute the difference between the time stored in the current object and the time in the input.
        return 0;
    }
}
