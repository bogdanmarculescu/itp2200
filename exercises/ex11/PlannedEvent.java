package ex11;

public class PlannedEvent extends Event {
    private boolean ended;
    public PlannedEvent(String name){
        super.setName(name);
    }

    public PlannedEvent(String name, Date date){
        super.setName(name);
        super.setStartDate(date);
        super.setEndDate(date);
        setEnded(date.ended());
    }

    public PlannedEvent(String name, Date start, Date end){
        super.setName(name);
        super.setStartDate(start);
        super.setEndDate(end);
        setEnded(end.ended());
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

    public boolean isEnded() {
        return ended;
    }

    public void setEnded(boolean ended) {
        this.ended = ended;
    }
}
