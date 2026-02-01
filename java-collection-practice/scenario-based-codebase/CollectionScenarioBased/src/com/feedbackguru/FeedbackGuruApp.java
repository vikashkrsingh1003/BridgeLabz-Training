package com.feedbackguru;

import java.util.*;

public class FeedbackGuruApp {

    public static void main(String[] args) throws Exception {

        List<String> lines = FeedbackReader.readFiles("feedback");

        List<Feedback<String>> feedbacks = FeedbackProcessor.parse(lines);

        Map<String,List<String>> result = FeedbackProcessor.categorize(feedbacks);

        System.out.println(result);
    }
}

