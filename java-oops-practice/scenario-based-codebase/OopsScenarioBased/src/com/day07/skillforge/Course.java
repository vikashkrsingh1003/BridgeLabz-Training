package com.day07.skillforge;

import java.util.*;

class Course {

    private String title;
    private Instructor instructor;
    private double rating;
    private List<String> modules;
    private List<Integer> reviews; 


    public Course(String title, Instructor instructor) {
        this(title, instructor, Arrays.asList("Intro", "Basics", "Project"));
    }

    public Course(String title, Instructor instructor, List<String> modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new ArrayList<>();
        this.rating = 0.0;
    }

    protected void addReview(int score) {
        reviews.add(score);
        calculateRating();
    }

    private void calculateRating() {
        int sum = 0;
        for (int r : reviews)
            sum += r;
        rating = (double) sum / reviews.size();
    }

    public double getRating() {
        return rating;
    }

    public List<Integer> getReviews() {
        return Collections.unmodifiableList(reviews); 
    }
}

