package ex08;

public class Event {
    private Date startDate;
    private Date endDate;
    private String name;

    public Event(String name){
        this.name = name;
    }

    public Event(String name, Date date){
        this.name = name;
        this.startDate = date;
        this.endDate = date;
    }

    public Event(String name, Date start, Date end){
        this.name = name;
        this.startDate = start;
        this.endDate = end;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
