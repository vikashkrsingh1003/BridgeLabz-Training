package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {

    public static void main(String[] args) {

        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);

        String input = "My SSN is 123-45-6789.";

        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println(matcher.group() + " is valid");
        } else {
            System.out.println("Invalid SSN");
        }
    }
}
