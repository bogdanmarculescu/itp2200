package ex07;


/**
 * The [EventNarrator] generates documentary-style comments about specific events, when they happened, how long they
 * took and how much time passed between two events.
 *
 * This is a classroom exercise for ITP2200 - Introduction to Software Testing, held at Høyskolen Kristiania.
 */
public class EventNarrator {

    public void accessPoint(){
        // this simulates where our code will be used
        //Event mid1 = new Event("Midway");
        //Event mid2 = new Event("Midway", new Date(1942, 06, 04));
        //Event

        Event[] events = new Event[5];


        // For each event in an array:

        // TODO 1. Display the time since an event (print "This many years/months/days ago").

        // TODO 2. Print the duration of an event (print "This event took [x] years/months/days") IF the event took more than a day

        // TODO 3. Print the time that passed between the current event and the previous event ( e.g. "It was [x] years/months/days later that [y] happened") IF the previous event happened before.
    }



    public String elapsedTime(Event e){
        String s = "This many years since " + e.getName() + " : " + e.getStartDate().yearsSince();
        return s;
    }




}
