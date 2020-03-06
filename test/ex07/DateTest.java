package ex07;

import org.junit.Test;

import java.time.DateTimeException;

import static org.junit.Assert.assertTrue;

public class DateTest {
    @Test
    public void testDate(){
        Date d1 = new Date(2020, 02, 24);
        Date d2 = new Date(2020, 02, 28);

        // Well this is odd. The order of the dates has an impact on the sign of the result.

        assertTrue(Date.dayDiff(d2, d1) == 4);
    }
    @Test
    public void testNowEquality(){
        Date d3 = new Date();
        Date d4 = new Date();
        assertTrue(Date.dayDiff(d4, d3) == 0);
    }

    @Test
    public void testSince(){
        // TODO find a better way of testing this (that does not depend on the same method).
        Date d1 = new Date(2020, 03, 05);
        int diff = Date.dayDiff(new Date(), d1);
        assertTrue(Date.daysSince(d1) == diff);
    }

    @Test
    public void testInvalidDates(){
        Date d0 = new Date();
        // these are invalid AND crash (Rather than fail) What to do?
        try{
            Date d1 = new Date(2020, 02, 31);
        }
        catch(DateTimeException e){
            assertTrue(e != null && d0.date.getYear() == 2020);
        }
        //Date d2 = new Date(2020, 13, 21);
        //Date d3 = new Date(2020, 01, 32);
    }
}
