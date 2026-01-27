package com.jtest.test;

import org.junit.jupiter.api.Test;

import com.jtest.main.PasswordValidator;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    public void testValidPasswords() {
        assertTrue(PasswordValidator.isValidPassword("Password1"));
        assertTrue(PasswordValidator.isValidPassword("Abcdefg9"));
        assertTrue(PasswordValidator.isValidPassword("StrongPass123"));
    }

    @Test
    public void testInvalidPasswords() {
        assertFalse(PasswordValidator.isValidPassword("short1"));     // less than 8 chars
        assertFalse(PasswordValidator.isValidPassword("nouppercase1")); // no uppercase
        assertFalse(PasswordValidator.isValidPassword("NoDigitHere"));  // no digit
        assertFalse(PasswordValidator.isValidPassword(""));            // empty string
        assertFalse(PasswordValidator.isValidPassword(null));          // null
    }
}

