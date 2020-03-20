package ex09;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EventNarratorTest {
    private Event[] events;
    private EventNarrator en;

    @Before
    public void setup(){

        // Tests should not depend on each other (so one test cannot be used to setup the system for the following one
        // But the @Before marked methods are executed every time, before the actual test -
        events = sillyInit(); // later we may want a more sensible init.
        en = new EventNarrator();
    }

    private Event[] sillyInit(){
        return new Event[]{new HistoricalEvent("Midway", new Date(1942, 6, 4)), // - a couple of tests for years
                new HistoricalEvent("Death of Caligula", new Date(41, 1, 24)),
                new HistoricalEvent("Reign of Aurelian", new Date(270, 9, 1), new Date(275, 9, 25)),
                new HistoricalEvent("New Year's Party", new Date(2020, 1, 1)), // month test
                new HistoricalEvent("Online lecture due to Corona", new Date(2020, 3, 13)), // - test for days?
                new PlannedEvent("Summer holidays", new Date(2020, 6, 22), new Date(2020, 8, 31))
        };
    }

    // TODO 1. Display (correctly) the time since an event (print "This many years/months/days ago").
    // BMR: 1.1. if the elapsed time is lower than 30 days, express in days
    //      1.2. if lower than 12 months, express in months
    //      1.3. else express in years.

    // tests = at least one each for years, months, days. Seminar 09 o.O
    // BMR (with test hat on): what happens if I give it a future date?

    /**
     * This method aims to test Requirement 1.1.
     */
    @Test
    public void elapsedTimeSince_Days(){
        // 1. What happens in 10 days time? It will FAIL.
        Date testDate = new Date(2020, 3, 15);
        Date testEndDate = new Date(2020, 3, 1);

        // 3. BMR: why can I have an Event with an end date after the start date?

        // 2. What happens with the other constructors for HistoricalEvent? - MORE TESTS!
        // Solved by adding more test OR relying on the Event class/module being unit tested.
        Event testEvent = new HistoricalEvent("test event", testDate, testEndDate);
        String elapsedTimeResult = en.elapsedTimeSince(testEvent);

        assertTrue(elapsedTimeResult.contains("days")
                && !elapsedTimeResult.contains("months")
                && !elapsedTimeResult.contains("years"));
    }

    @Test
    public void elapsedTimeSince_Days_lessTimeSensitive(){
        // Test for requirement 1.1.
        // 1. What happens in 10 days time? It will FAIL.
        //Date testDate = new Date(2020, 3, 15);
        //Date testEndDate = new Date(2020, 3, 1);

        // Date uses LocalDate
        // https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
        // LocalDate has a method called minusDays() LocalDate;
        Date testDate = new Date();
        Date testDate30 = new Date(testDate.date.minusDays(30));
        // 4. BMR: while writing these tests, I would like a way to create a date, X many days in the past.
        // See LocalDate minusDays() method in link above.
        // Alternatively, a way of creating a Date using a LocalDate as a parameter would also help.


        // 3. BMR: why can I have an Event with an end date after the start date?

        // 2. What happens with the other constructors for HistoricalEvent? - MORE TESTS!
        // Solved by adding more test OR relying on the Event class/module being unit tested.
        Event testEvent = new HistoricalEvent("test event", testDate);
        String elapsedTimeResult = en.elapsedTimeSince(testEvent);

        assertTrue(elapsedTimeResult.contains("days")
                && !elapsedTimeResult.contains("months")
                && !elapsedTimeResult.contains("years"));

        //5. Event names may contain those strings!
        // BMR: my passing criteria for this test are flawed! A test can pass/fail based on event name rather than behaviour.

        Event testEvent30 = new HistoricalEvent("test 30 days", testDate30);
        String elapsed30 = en.elapsedTimeSince(testEvent30);
        // oracle string for a date 30 days ago.
        String oracle30 =  "It was 1 months ago that " + testEvent30.getName() + " happened.";

        assertTrue(elapsed30.contentEquals(oracle30));


        // Thus far:
        // - we have a test for requirement 1.1.
        // - we have made it less time sensitive.
        // - we're reported a problem (potential problem?) with Event. https://github.com/bogdanmarculescu/itp2200/issues/1
        // - we have covered an example from each partition of the input space.
        // - we've updated our criteria for assessing requirement 1.1.
        // - we've discovered a bit of undefined behaviour and reported it. See https://github.com/bogdanmarculescu/itp2200/issues/2

        Date futureTest = new Date(2020, 3, 30);
        Event futureTestEvent = new HistoricalEvent("future test event", futureTest);
        String futureElapsed = en.elapsedTimeSince(futureTestEvent);

        assertTrue(futureElapsed.contains("days"));

        // Should I be able to look at how many days ago a future event happened?
        // See https://github.com/bogdanmarculescu/itp2200/issues/2

    }









    // End of seminar 09 ^^



    @Test
    public void testEnded(){
        // True for some, but not for all
        // Note that PlannedEvent has the method isEnded, which would be tremendously useful
        // BUT, the Event or HistoricalEvent classes don't have it.
        // This is one of the problems that can arise in an object oriented setting.
        for(int i = 0; i < events.length; i++){
            if(events[i] instanceof HistoricalEvent){
                assertTrue(events[i].getEndDate().ended());
            }
        }
    }

    @Test
    public void testElapsedTime(){
        // This tests the elapsed time method.
        Event e1 = new HistoricalEvent("Death of Caligula", new Date(41, 1, 24));
        EventNarrator en = new EventNarrator();

        String res = en.elapsedTime(e1);
        assertTrue(res.contains("Caligula"));
    }



    @Test
    public void testElapsed(){
        String[] texts = new String[events.length];
        for(int i = 0; i < events.length; i++){
            texts[i] = en.elapsedTimeSince(events[i]);
        }

        // oops. adding a new item of data messed things up. better code modularity would be better, huh?
        assertTrue(texts[0].contains("years"));
        assertTrue(texts[1].contains("years"));
        assertTrue(texts[2].contains("years"));
        assertTrue(texts[3].contains("months"));
        // Is there a more elegant way to do this? Well, of course!
    }

    // First... what if only one fails? let's separate them into different methods
    @Test
    public void testYears(){
        String yrs0 = en.elapsedTimeSince(events[0]);
        String yrs1 = en.elapsedTimeSince(events[1]);
        String yrs2 = en.elapsedTimeSince(events[4]);


        // We assert both true and false - the system should write "years" where relevant, but
        // should not write "years" where not relevant.
        assertTrue(yrs0.contains("years"));
        assertTrue(yrs1.contains("years"));
        assertFalse(yrs2.contains("years")); // is this always true? what can go wrong here?

        //

    }

    @Test
    public void testMonths(){
        //for months there are 2 behaviours -
        // relevant - months is the time scale difference, so that is what the text should read.
        // irrelevant - time scale difference is in years OR in days. (those are two different cases, to maybe two different inputs are needed.
        String mts0 = en.elapsedTimeSince(events[0]); // years... so not relevant
        String mts1 = en.elapsedTimeSince(events[3]); // months... this one should contain it
        String mts2 = en.elapsedTimeSince(events[4]); // days.. back to being irrelevant.

        assertFalse(mts0.contains("months"));
        assertTrue(mts1.contains("months"));
        assertFalse(mts2.contains("months"));
    }

    @Test
    public void testDays(){
        String dys0 = en.elapsedTimeSince(events[0]);
        String dys2 = en.elapsedTimeSince(events[2]);
        String dys3 = en.elapsedTimeSince(events[4]);

        assertFalse(dys0.contains("days"));
        assertFalse(dys2.contains("days"));
        assertTrue(dys3.contains("days"));
    }

    @Test
    public void endedTest(){

        if(events[5] instanceof PlannedEvent){
            PlannedEvent temp = (PlannedEvent) events[5];
            temp.isEnded();
        }

        for(int i = 0; i < events.length; i++){
            if( events[i] instanceof HistoricalEvent) {
                assertTrue(events[i].getEndDate().ended());
            }
        }
    }
}
