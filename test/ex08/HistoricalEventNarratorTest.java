package ex08;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HistoricalEventNarratorTest {
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
        return new Event[]{new Event("Midway", new Date(1942, 6, 4)), // - a couple of tests for years
                new Event("Death of Caligula", new Date(41, 1, 24)),
                new Event("Reign of Aurelian", new Date(270, 9, 1), new Date(275, 9, 25)),
                new Event("New Year's Party", new Date(2020, 1, 1)), // month test
                new Event("Online lecture due to Corona", new Date(2020, 03, 13)), // - test for days?
        };
    }

    @Test
    public void testElapsedTime(){
        // This tests the elapsed time method.
        Event e1 = new Event("Death of Caligula", new Date(41, 01, 24));
        EventNarrator en = new EventNarrator();

        String res = en.elapsedTime(e1);
        assertTrue(res.contains("Caligula"));
    }

    // TODO 1. Display the time since an event (print "This many years/months/days ago").
    // tests = at least one each for years, months, days.

    @Test
    public void testElapsed(){
        String[] texts = new String[events.length];
        for(int i = 0; i < events.length; i++){
            texts[i] = en.elapsedTimeSince(events[i]);
        }

        // oops. adding a new item of data messed things up. better code modularity would be better, huh?
        assertTrue(texts[0].contains("years"));
        assertTrue(texts[1].contains("years"));
        assertTrue(texts[2].contains("months"));
        assertTrue(texts[3].contains("days"));
        // Is there a more elegant way to do this? Well, of course!
    }

    // First... what if only one fails? let's separate them into different methods
    @Test
    public void testYears(){
        String yrs0 = en.elapsedTimeSince(events[0]);
        String yrs1 = en.elapsedTimeSince(events[1]);
        String yrs2 = en.elapsedTimeSince(events[2]);


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
        String mts1 = en.elapsedTimeSince(events[2]); // months... this one should contain it
        String mts2 = en.elapsedTimeSince(events[3]); // days.. back to being irrelevant.

        assertFalse(mts0.contains("months"));
        assertTrue(mts1.contains("months"));
        assertFalse(mts2.contains("months"));
    }

    @Test
    public void testDays(){
        String dys0 = en.elapsedTimeSince(events[0]);
        String dys2 = en.elapsedTimeSince(events[2]);
        String dys3 = en.elapsedTimeSince(events[3]);

        assertFalse(dys0.contains("days"));
        assertFalse(dys2.contains("days"));
        assertTrue(dys3.contains("days"));
    }
}
