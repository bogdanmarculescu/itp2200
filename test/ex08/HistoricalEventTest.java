package ex08;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HistoricalEventTest {

    @Test
    public void constructorNameTest(){
        Event e1 = new Event("ww2");
        assertTrue(e1 != null && e1.getName().equalsIgnoreCase("ww2"));
    }
    @Test
    public void contructorNameDateTest(){
        Event e1 = new Event("Y2K", new Date(2000, 01, 01));
        assertTrue(e1.getStartDate().date.getYear() == 2000 &&
                e1.getName().equalsIgnoreCase("Y2K"));
    }

    @Test
    public void constructorCompleteTest(){
        Event e1 = new Event("30 yrs war", new Date(1618, 05, 23), new Date(1648, 05, 15));
        assertTrue(e1.getStartDate().date.getYear() == 1618);
    }
}
