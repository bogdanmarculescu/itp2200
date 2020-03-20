package ex07;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class HistoricalEventNarratorTest {
    @Test
    public void testElapsedTime(){
        // This tests the elapsed time method.
        Event e1 = new Event("Death of Caligula", new Date(41, 01, 24));
        EventNarrator en = new EventNarrator();

        String res = en.elapsedTime(e1);
        assertTrue(res.contains("Caligula"));
    }
}
