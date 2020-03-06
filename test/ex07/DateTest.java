package ex07;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DateTest {
    @Test
    public void testDate(){
        Date d1 = new Date(2020, 02, 24);
        Date d2 = new Date(2020, 02, 28);

        Date d3 = new Date();

        // Wait, this worked last time!
        assertTrue(Date.dayDiff(d2, d3) == 0);
        assertTrue(Date.dayDiff(d2, d1) == 4);
    }

    @Test
    public void testSince(){
        Date d1 = new Date(2020, 03, 05);
        assertTrue(Date.daysSince(d1) == 0);
    }

    @Test
    public void testInvalidDates(){
        // these are invalid AND crash (Rather than fail) What to do?
        Date d1 = new Date(2020, 02, 31);
        Date d2 = new Date(2020, 13, 21);
        Date d3 = new Date(2020, 01, 32);
    }
}
