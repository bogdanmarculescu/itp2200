package ex06;

import ex06.Time;
import org.junit.Test;
import static org.junit.Assert.*;

public class TimeTest {
    @Test
    public void testTime(){
        Time t = Time.convertSeconds(3662);
        assertTrue(t.hours == 1);
        assertTrue(t.minutes == 1);
        assertTrue(t.seconds == 2);
    }

    @Test
    public void constructorTest(){
        Time t = new Time(3612);
        assertTrue(t.seconds == 12);
        assertTrue(t.hours == 1);
    }

}