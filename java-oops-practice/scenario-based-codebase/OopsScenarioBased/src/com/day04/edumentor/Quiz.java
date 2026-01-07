package com.day04.edumentor;

public class Quiz {
	
    private String[] questions;      // private question bank
    private final String[] answers;  // encapsulated answers (cannot be modified)
    private int score;
    private int difficultyLevel;

    // Constructor with difficulty
    public Quiz(String[] questions, String[] answers, int difficultyLevel) {
        this.questions = questions;
        this.answers = answers;
        this.difficultyLevel = difficultyLevel;
        this.score = 0;
    }

    // Operator usage for scoring
    public void evaluate(String[] userAnswers) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equalsIgnoreCase(userAnswers[i])) {
                score++; 
            }
        }
    }

    // Percentage calculation
    public double getPercentage() {
        return (score * 100.0) / answers.length;
    }

    public int getScore() {
        return score;
    }
}
