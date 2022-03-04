package org.AM.Fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test cases:
 * Fibonacci 0 -> 0
 * Fibonacci 1 -> 1
 * Fibonacci n -> Fibonacci(n - 1) + Fibonacci(n-2)
 * Fibonacci NegativeNumber -> ERROR
 */
class FibonacciTest {
    private Fibonacci fibonacci;

    @Test
    public void testComputeReturnZeroIfTheNumberIsZero() { // This method retun 0 if the computed value is 0
        fibonacci = new Fibonacci();
        int expectedValue = 0;
        int obtainedValue = fibonacci.compute(0);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void testComputeReturnOneIfTheNumberIsOne() { // This method retun 1 if the computed value is 1
        fibonacci = new Fibonacci();
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(1);

        assertEquals(expectedValue,obtainedValue);
    }
}