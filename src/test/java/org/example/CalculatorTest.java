package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @Test
    public void addTest() {
        Calculator calc = new Calculator();
        int result = calc.add(3, 4);
        int expected = 7;
        assertEquals(expected, result);
    }
    @Test
    public void multiplyTest() {
        Calculator calc = new Calculator();
        int result = calc.multiply(8, 4);
        int expected = 32;
        assertEquals(expected, result);
    }


}
