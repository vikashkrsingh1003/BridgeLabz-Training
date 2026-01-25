package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCard {

    public static void main(String[] args) {

        String regex = "^(4[0-9]{15}|5[0-9]{15})$";

        Pattern pattern = Pattern.compile(regex);

        String input = "4123456789012345";  
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid Credit Card Number");
        } else {
            System.out.println("Invalid Credit Card Number");
        }
    }
}
