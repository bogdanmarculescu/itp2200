package ex02;

import org.junit.Test;

public class VerySimpleCodeTest {

    @Test
    public void testPrintNumberFullCoverage() {
        VerySimpleCode.printNumber(10);
    }

    @Test
    public void testPrintNumber() {
        VerySimpleCode.printNumber(0);
    }
}
