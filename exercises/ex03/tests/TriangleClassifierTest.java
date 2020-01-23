package ex03.tests;

import ex03.TriangleClassifier;
import static org.junit.Assert.*;
import  org.junit.Test;

public class TriangleClassifierTest {

    @Test
    public void testScalene() throws Exception {
        int a = 5;
        int b = 7;
        int c = 9;

        String result = TriangleClassifier.classify(a, b, c);
        assertTrue(result.equalsIgnoreCase("SCALENE"));

    }

    @Test
    public void testIsosceles() throws Exception{
        int a = 5;
        int b = 5;
        int c = 7;

        String result = TriangleClassifier.classify(a, b, c);
        assertTrue(result.equalsIgnoreCase("ISOSCELES"));
        assertFalse(result.equalsIgnoreCase("SCALENE"));
    }
}
