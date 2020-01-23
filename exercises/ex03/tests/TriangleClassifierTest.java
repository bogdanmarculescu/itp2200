package ex03.tests;

import ex03.TriangleClassifier;
import ex03.TriangleType;
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

    //Is this enough?
    @Test
    public void testClassify_v2() throws Exception{
        TriangleType result = TriangleClassifier.classify_v2(4, 5, 6);
        assertTrue(result == TriangleType.SCALENE);
    }
}
