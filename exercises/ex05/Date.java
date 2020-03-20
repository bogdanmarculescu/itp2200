package ex05;

import java.time.LocalDate;
import java.time.Period;

public class Date {
    LocalDate date;
    public Date(){
        this.date = LocalDate.now();
    }
    public Date(int year, int month, int day){
        this.date = LocalDate.of(year, month, day);
    }

    public static int dayDiff(Date d1, Date d2){
        Period period = Period.between(d1.date, d2.date);
        return period.getDays();
    }

    public static int daysSinceO(Date d){
        Period period = Period.between(d.date, LocalDate.now());
        return period.getDays();
    }
}
