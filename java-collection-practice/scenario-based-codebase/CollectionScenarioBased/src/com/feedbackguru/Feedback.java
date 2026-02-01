package com.feedbackguru;

public class Feedback<T> {
    T type;
    String message;
    int rating;

    public Feedback(T type, String message, int rating) {
        this.type = type;
        this.message = message;
        this.rating = rating;
    }
}

