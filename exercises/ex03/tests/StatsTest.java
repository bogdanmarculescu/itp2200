package ex03.tests;

import static org.junit.Assert.*;

import ex03.Stats;
import  org.junit.Test;

public class StatsTest {
    @Test
    public void test1() throws Exception{
        // Your test code here!
        int[] a = {0, 1};
        Stats.computeStats(a);
        assertTrue(true);
        assertFalse(false);
    }
}
