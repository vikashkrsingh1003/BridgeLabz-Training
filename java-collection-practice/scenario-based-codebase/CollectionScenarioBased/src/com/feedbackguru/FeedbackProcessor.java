package com.feedbackguru;

import java.util.*;
import java.util.regex.*;

public class FeedbackProcessor {

    public static List<Feedback<String>> parse(List<String> lines) {
        List<Feedback<String>> list = new ArrayList<>();
        Pattern p = Pattern.compile("(\\d{1,2})/10");

        for (String line : lines) {
            try {
                Matcher m = p.matcher(line);
                if (!m.find()) continue;

                int rating = Integer.parseInt(m.group(1));
                String type = line.toLowerCase().contains("service") ? "Service" : "Product";

                list.add(new Feedback<>(type, line, rating));
            } catch (Exception e) {
            }
        }
        return list;
    }

    public static Map<String,List<String>> categorize(List<Feedback<String>> feedbacks) {
        Map<String,List<String>> map = new HashMap<>();

        map.put("Positive", new ArrayList<>());
        map.put("Neutral", new ArrayList<>());
        map.put("Negative", new ArrayList<>());

        for (Feedback<String> f : feedbacks) {
            if (f.rating >= 8)
                map.get("Positive").add(f.message);
            else if (f.rating >= 5)
                map.get("Neutral").add(f.message);
            else
                map.get("Negative").add(f.message);
        }

        return map;
    }
}

