package com.jtest.test;

import org.junit.jupiter.api.Test;

import com.jtest.main.UserRegistration;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    @Test
    public void testValidRegistration() {
        assertDoesNotThrow(() -> 
            UserRegistration.registerUser("JohnDoe", "john@example.com", "Password1")
        );
    }

    @Test
    public void testInvalidUsername() {
        Exception ex = assertThrows(IllegalArgumentException.class, () ->
            UserRegistration.registerUser("", "john@example.com", "Password1")
        );
        assertEquals("Username cannot be empty", ex.getMessage());
    }

    @Test
    public void testInvalidEmail() {
        Exception ex = assertThrows(IllegalArgumentException.class, () ->
            UserRegistration.registerUser("JohnDoe", "invalidEmail", "Password1")
        );
        assertEquals("Invalid email format", ex.getMessage());
    }

    @Test
    public void testWeakPassword() {
        Exception ex = assertThrows(IllegalArgumentException.class, () ->
            UserRegistration.registerUser("JohnDoe", "john@example.com", "weakpass")
        );
        assertEquals("Password is not strong enough", ex.getMessage());
    }

    @Test
    public void testNullInputs() {
        assertThrows(IllegalArgumentException.class, () ->
            UserRegistration.registerUser(null, "john@example.com", "Password1")
        );
        assertThrows(IllegalArgumentException.class, () ->
            UserRegistration.registerUser("JohnDoe", null, "Password1")
        );
        assertThrows(IllegalArgumentException.class, () ->
            UserRegistration.registerUser("JohnDoe", "john@example.com", null)
        );
    }
}

