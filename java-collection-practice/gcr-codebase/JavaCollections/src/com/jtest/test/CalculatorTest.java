package com.jtest.test;

import org.junit.jupiter.api.Test;

import com.jtest.main.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }

    // 👉 Bonus: Division by zero
    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class,
                () -> calculator.divide(10, 0));
    }
}
