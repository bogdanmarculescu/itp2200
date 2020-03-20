package ex09;

public class HistoricalEvent extends Event{
    public HistoricalEvent(String name){
        super.setName(name);
    }

    public HistoricalEvent(String name, Date date){
        super.setName(name);
        super.setStartDate(date);
        super.setEndDate(date);
    }

    public HistoricalEvent(String name, Date start, Date end){
        super.setName(name);
        super.setStartDate(start);
        super.setEndDate(end);
    }

    public Date getStartDate() {
        return super.getStartDate();
    }

    public void setStartDate(Date startDate) {
        super.setStartDate(startDate);
    }

    public Date getEndDate() {
        return super.getEndDate();
    }

    public void setEndDate(Date endDate) {
        super.setEndDate(endDate);
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }
}
