package com.jtest.main;

public class UserRegistration {

    public static void registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (!PasswordValidator.isValidPassword(password)) {
            throw new IllegalArgumentException("Password is not strong enough");
        }
        System.out.println("User registered: " + username);
    }
}
