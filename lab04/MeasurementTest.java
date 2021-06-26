import org.junit.Test;

import static org.junit.Assert.*;

public class MeasurementTest {
    @Test
    public void test1() {
        // TODO: stub for first test
        Measurement getfit = new Measurement(5,6);
        assertEquals(5, getfit.getFeet());
    }
    @Test
    public void test2() {
        // TODO: stub for first test
        Measurement getfit_noinch = new Measurement(5);
        assertEquals(5, getfit_noinch.getFeet());
    }
    @Test
    public void test3() {
        // TODO: stub for first test
        Measurement getinch = new Measurement(5,6);
        assertEquals(6, getinch.getInches());
    }
    @Test
    public void test4() {
        // TODO: stub for first test
        Measurement get_zero_inch = new Measurement(5);
        assertEquals(0, get_zero_inch.getInches());
    }
    @Test
    public void test5() {
        // TODO: stub for first test
        Measurement adding = new Measurement(2,0);
        Measurement x = new Measurement(2,0);
        assertEquals("4'0\"", adding.plus(x).toString());
    }
    @Test
    public void test6() {
        // TODO: stub for first test
        Measurement subtracting = new Measurement(5,0);
        Measurement y=  new Measurement(4,0);
        assertEquals("1'0\"", subtracting.minus(y).toString());
    }
    @Test
    public void test7() {
        // TODO: stub for first test
        Measurement multi = new Measurement(2,3);
        assertEquals("4'6\"", multi.multiple(2).toString());
    }

    // TODO: Add additional JUnit tests for Measurement.java here.

}