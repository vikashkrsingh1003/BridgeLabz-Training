package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNames{

    public static void main(String[] args) {

        String regex = "\\b(Java|Python|JavaScript|Go)\\b";

        Pattern pattern = Pattern.compile(regex);

        String input = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
