package ex07;

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

    public static int daysSince(Date d){
        return dayDiff(d, new Date());
    }

    public int daysSince(){
        return dayDiff(this, new Date());
    }

    public int monthsSince(Date d){
        Period period = Period.between(this.date, d.date);
        return period.getMonths();
    }

    public int yearsSince(Date d){
        Period period = Period.between(this.date, d.date);
        return period.getYears();
    }
}
