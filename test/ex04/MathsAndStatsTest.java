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
}
