package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIP {

    public static void main(String[] args) {

        String regex = 
            "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        Pattern pattern = Pattern.compile(regex);

        String input = "192.168.1.1"; 

        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid IP Address");
        } else {
            System.out.println("Invalid IP Address");
        }
    }
}
