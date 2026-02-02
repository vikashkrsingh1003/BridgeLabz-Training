package com.interfaces.functional;

import java.util.function.Function;

public class StringLengthChecker {

    private static void checkLength(String message) {

        Function<String, Integer> lengthFinder = msg -> msg.length();

        int length = lengthFinder.apply(message);

        if (length > 10)
        	System.out.println("Message too long - Length: " + length);
        else
        	System.out.println("Message accepted - Length: " + length);
        
    }
        
    public static void main(String[] args) {
        checkLength("Welcome");
        checkLength("I am vikash");
    }
}

