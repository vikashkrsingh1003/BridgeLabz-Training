package com.jtest.main;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if (password == null) return false;
        if (password.length() < 8) return false;
        if (!password.matches(".*[A-Z].*")) return false; 
        if (!password.matches(".*\\d.*")) return false;  
        return true;
    }
}

