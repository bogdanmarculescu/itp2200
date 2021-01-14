package ex02;

import org.junit.Test;

public class VerySimpleCodeFaultyTest {

    @Test
    public void testPrintNumberFullCoverage() {
        VerySimpleCodeFaulty.printNumberFaulty(0);
    }

    @Test
    public void testPrintNumberBug() {
        VerySimpleCodeFaulty.printNumberFaulty(10);
    }
}
