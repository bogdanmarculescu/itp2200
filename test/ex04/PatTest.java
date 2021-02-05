package ex04;

import org.junit.Test;

import static org.junit.Assert.*;

public class PatTest {
    @Test
    public void test1(){
        char[] subject = "let us run some tests".toCharArray();
        char[] pattern = "tests".toCharArray();

        int result = PatternMatcher.pat(subject, pattern);
        assertTrue(result != -1);
        //assertTrue( true ^ false); //Random XOR example
    }





































    @Test
    public void testPath1(){
        char[] subject = "a".toCharArray();
        char[] pattern = "ab".toCharArray();

        int result = PatternMatcher.pat(subject, pattern);
        assertTrue(result == -1);
    }

    @Test
    public void testPath2(){
        char[] subject = "a".toCharArray();
        char[] pattern = "b".toCharArray();

        int result = PatternMatcher.pat(subject, pattern);
        assertTrue(result == -1);
    }

    @Test
    public void testPath3(){
        char[] subject = "ab".toCharArray();
        char[] pattern = "a".toCharArray();

        int result = PatternMatcher.pat(subject, pattern);
        assertTrue(result != -1);
    }

    @Test
    public void testPath4(){
        char[] subject = "ab".toCharArray();
        char[] pattern = "ab".toCharArray();

        int result = PatternMatcher.pat(subject, pattern);
        assertTrue(result != -1);
    }

    @Test
    public void testPath5(){
        char[] subject = "aa".toCharArray();
        char[] pattern = "ab".toCharArray();

        int result = PatternMatcher.pat(subject, pattern);
        assertTrue(result == -1);
    }
}
