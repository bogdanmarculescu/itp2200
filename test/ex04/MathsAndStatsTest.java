package ex04;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class MathsAndStatsTest {

    @Test
    public void testAbsolute(){
        int[] inputs = {0, 1, 2};

        int result = MathsAndStats.absoluteValue(1);
        assertTrue(result == 1);
    }

    @Test
    public void testQuadrants(){
        int[] xs = {1, -2, 3};
        int[] ys = {-1, 0, 17};

        String result = MathsAndStats.quadrants(1, -1);
        assertTrue(result != "Where?");
    }

    @Test
    public void testCategorize(){
        int[] inputs = {-1, 0, 4};

        int result = MathsAndStats.categorize(-17);

        assertTrue(result < 0);

    }

    @Test
    public void testUpperRightQuadrant(){
        int x = 1;
        int y = 2;

        String result = MathsAndStats.quadrants(x, y);
        assertTrue(result.equals("Upper-Right"));
    }

    @Test
    public void testLowerRightQuadrant(){
        int x = 0;
        int y = -1;

        String result = MathsAndStats.quadrants(x, y);
        assertTrue(result.equals("Lower-Right"));
    }


    @Test
    public void testLowerLeftQuadrant(){
        int x = -1;
        int y = -1;

        String result = MathsAndStats.quadrants(x, y);
        assertTrue(result.equals("Lower-Left"));
    }

    @Test
    public void testUpperLeftQuadrant(){
        int x = -1;
        int y = 1;

        String result = MathsAndStats.quadrants(x, y);
        assertTrue(result.equals("Upper-Left"));
    }
}
