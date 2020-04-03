package ex11;

import java.time.LocalDate;
import java.time.Period;

/**
 * Note! The Date class assumes that you have checked the inputs. If this is not true,
 * A DateTimeException will be thrown.
 */
public class Date {
    LocalDate date;
    public Date(){
            this.date = LocalDate.now();
        }
    public Date(int year, int month, int day){
            this.date = LocalDate.of(year, month, day);
        }
    public Date(LocalDate inputDate) { this.date = inputDate;}


    /**
     * The method returns an int that describes the number of days between events.
     * Note! The number of days is in absolute value. If a sign is required, please implement another method.
     * @param d1
     * @param d2
     * @return
     */
    public static int dayDiff(Date d1, Date d2){
        Period period = Period.between(d1.date, d2.date);
        return Math.abs(period.getDays());
    }

    public static int monthDiff(Date d1, Date d2){
        Period period = Period.between(d1.date, d2.date);
        return Math.abs(period.getMonths());
    }

    public static int yearDiff(Date d1, Date d2){
        Period period = Period.between(d1.date, d2.date);
        return Math.abs(period.getYears());
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

    public int yearsSince(){
        Period period = Period.between(this.date, new Date().date);
        return Math.abs(period.getYears());
    }

    public boolean ended(){
        Date now = new Date();
        Period p = Period.between(date, now.date);
        return !p.isNegative();
    }
}
