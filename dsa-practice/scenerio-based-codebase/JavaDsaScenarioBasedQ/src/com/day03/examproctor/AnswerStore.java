package com.day03.examproctor;

import java.util.HashMap;

public class AnswerStore {

    private HashMap<Integer, String> studentAnswers = new HashMap<>();
    private HashMap<Integer, String> correctAnswers = new HashMap<>();

    public void submitAnswer(int questionId, String answer) {
        studentAnswers.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    public void addCorrectAnswer(int questionId, String answer) {
        correctAnswers.put(questionId, answer);
    }

    public HashMap<Integer, String> getStudentAnswers() {
        return studentAnswers;
    }

    public HashMap<Integer, String> getCorrectAnswers() {
        return correctAnswers;
    }
}
