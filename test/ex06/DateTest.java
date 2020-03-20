package ex06;

import org.junit.Test;
import static org.junit.Assert.*;

public class DateTest {
    @Test
    public void testDate(){
        Date d1 = new Date(2020, 02, 24);
        Date d2 = new Date(2020, 02, 28);

        Date d3 = new Date();

        //assertTrue(Date.dayDiff(d2, d3) == 0);
        assertTrue(Date.dayDiff(d2, d1) == 4);
    }
}
