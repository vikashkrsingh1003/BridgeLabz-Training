package com.jtest.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.jtest.main.NumberUtils;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    public void testIsEvenWithEvenNumbers(int number) {
        assertTrue(NumberUtils.isEven(number), number + " should be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    public void testIsEvenWithOddNumbers(int number) {
        assertFalse(NumberUtils.isEven(number), number + " should be odd");
    }

    @ParameterizedTest
    @CsvSource({
        "2, true",
        "4, true",
        "6, true",
        "7, false",
        "9, false"
    })
    public void testIsEvenWithCsvSource(int number, boolean expected) {
        assertEquals(expected, NumberUtils.isEven(number));
    }
}

