package ex06;

import org.junit.Test;

import java.time.LocalDate;
import static org.junit.Assert.assertTrue;

public class MeetingTest {
    @Test
    public void setMeetingTest(){
        Meeting m = new Meeting();

        m.setDate(2020, 03, 28);
        m.setTime(10, 15);


    }
}
