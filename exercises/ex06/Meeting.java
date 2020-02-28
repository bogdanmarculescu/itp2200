package ex06;

public class Meeting {
    Person owner;
    Date date;
    Time time;
    int duration;

    private Meeting(Person p, Date d, Time t){
        this.owner = p;
        this.date = d;
        this.time = t;
    }
}


