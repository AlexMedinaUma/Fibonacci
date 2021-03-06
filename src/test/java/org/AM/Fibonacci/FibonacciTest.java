package org.AM.Fibonacci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test cases:
 * Fibonacci 0 -> 0 *
 * Fibonacci 1 -> 1 *
 * Fibonacci 2 -> 1
 * Fibonacci 3 -> 2
 * Fibonacci 8 -> 21
 * Fibonacci NegativeNumber -> ERROR
 */
class FibonacciTest {
    private Fibonacci fibonacci;
    @BeforeEach
    public void setUp(){
        fibonacci = new Fibonacci();
    }
    @AfterEach
    public void finish(){ fibonacci = null;
    }
    @Test
    public void testComputeReturn0IfTheNumberIs0() { // This method retun 0 if the computed value is 0
        int expectedValue = 0;
        int obtainedValue = fibonacci.compute(0);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void testComputeReturn1IfTheNumberIs1() { // This method retun 1 if the computed value is 1
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(1);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void testComputeReturn1IfTheNumberIs2() { // This method retun 1 if the computed value is 2
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(2);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void testComputeReturn2IfTheNumberIs3() { // This method retun 2 if the computed value is 3
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(1);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void testComputeReturn21IfTheNumberIs8() {// This method return 21 if the computed value is 8
        int expectedValue = 21;
        int obtainedValue = fibonacci.compute(8);

        Assertions.assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void testComputeReturnErrorIfTheNumberIsNegative() {
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-6));

    }
}