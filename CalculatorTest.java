package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests of the Calculator class
 */
public class CalculatorTest {

    @Test
    public void calculate_test1() {
        String str = "12115+93*(768-3)";
        Calculator exp = new Calculator(str);
        assertTrue(exp.calculate());
        assertEquals("757030.0",exp.toString());
    }

    @Test
    public void calculate_test2() {
        String str = "12115+93*(128-3))";
        Calculator exp = new Calculator(str);
        assertFalse(exp.calculate());
    }

    @Test
    public void calculate_test3() {
        String str = "12115+93**(128-3)";
        Calculator exp = new Calculator(str);
        assertFalse(exp.calculate());
    }

    @Test
    public void calculate_test4() {
        String str = "12115+93)*(128-3";
        Calculator exp = new Calculator(str);
        assertFalse(exp.calculate());
    }

    @Test
    public void calculate_test5() {
        String str = "(12115+93)/(128-3)";
        Calculator exp = new Calculator(str);
        assertTrue(exp.calculate());
        assertEquals("757030.0",exp.toString());
    }

    @Test
    public void calculate_test6() {
            String str = "12115*r+93*(128-3)";
        Calculator exp = new Calculator(str);
        assertFalse(exp.calculate());
    }
}