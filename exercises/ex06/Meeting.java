package ex06;

public class Meeting {
    Person owner;
    Date date;
    Time time;
    int duration;

    public Meeting() {
    }

    public Meeting(Person p, Date d, Time t){
        this.owner = p;
        this.date = d;
        this.time = t;
    }

    public void setDate(int year, int month, int day){
        this.date = new Date(year, month, day);
    }

    public void setTime(int hour, int minute){
        this.time = new Time(hour, minute, 0);
    }

}


