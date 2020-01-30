package ex04;

import ex04.PatternMatcher;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatTest {
    @Test
    public void test1() throws Exception{
        char[] subject = "let us run some tests".toCharArray();
        char[] pattern = "tests".toCharArray();

        int result = PatternMatcher.pat(subject, pattern);
        assertTrue(result != -1);
        //assertTrue( true ^ false); //Random XOR example
    }
}
