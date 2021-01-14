package ex02;

import org.junit.Test;

public class VerySimpleCodeTest {

    @Test
    public void testPrintNumber() {
        VerySimpleCode.printNumber(10);
    }

    @Test
    public void testPrintNumberFullCoverage() {
        VerySimpleCode.printNumber(0);
    }
}
