package ex05;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {
    @Test
    public void testTime(){
        Time t = Time.convertSeconds(3662);

        System.out.println(t.seconds);
    }
}