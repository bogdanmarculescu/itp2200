package ex10;


/**
 * The [EventNarrator] generates documentary-style comments about specific events, when they happened, how long they
 * took and how much time passed between two events.
 *
 * This is a classroom exercise for ITP2200 - Introduction to Software Testing, held at Høyskolen Kristiania.
 */
public class EventNarrator {
    Event[] events;
    public void accessPoint(){
        // this simulates where our code will be used
        //Event mid1 = new Event("Midway");
        //Event mid2 = new Event("Midway", new Date(1942, 06, 04));
        //Event


        // For each event in an array:

        // TODO 1. Display the time since an event (print "This many years/months/days ago").

        for (int i = 0; i < events.length; i++ ){
            System.out.println(elapsedTimeSince(events[i]));
        }

        // TODO 2. Print the duration of an event (print "This event took [x] years/months/days") IF the event took more than a day

        // TODO 3. Print the time that passed between the current event and the previous event ( e.g. "It was [x] years/months/days later that [y] happened") IF the previous event happened before.
    }



    public String elapsedTime(Event e){
        String s = "This many years since " + e.getName() + " : " + e.getStartDate().yearsSince();
        return s;
    }

    public void setHistoricalEvents(HistoricalEvent[] historicalEvents){
        this.events = historicalEvents;
    }


    // Differentiation between years, months, days (belongs where?)
    // Options:
    // 1. - use java Period to store the difference between two dates. Narrator decides on functionality
    // 2. - push the functionality to the Date class, maximize cohesion for both Narrator and Date.


    // I will implement different methods in Date - keep Date related functionality there, but make choices relating
    // to the functionality of Narrator here.

    public String elapsedTimeSince(Event e){
        Date writingTime = new Date();
        String timeScale = "";
        int difference = 0;
        // hmm... how many years since an even with different start/end date? :)
        if(Date.yearDiff(writingTime, e.getEndDate()) != 0){
            timeScale = "years";
            difference = Date.yearDiff(writingTime, e.getEndDate());
        }
        else if(Date.monthDiff(writingTime, e.getEndDate()) != 0){
            timeScale = "months";
            difference = Date.monthDiff(writingTime, e.getEndDate());
        }
        else {
            timeScale = "days";
            difference = Date.dayDiff(writingTime, e.getEndDate());
        }
        return "It was " + difference + " " + timeScale + " ago that " + e.getName() + " happened.";
    }
}
