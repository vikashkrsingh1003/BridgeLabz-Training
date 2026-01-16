package com.day03.examproctor;

import java.util.Stack;

public class QuestionNavigator {

    private Stack<Integer> navigationStack = new Stack<>();

    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    public void goBack() {
        if (!navigationStack.isEmpty()) {
            int lastQuestion = navigationStack.pop();
            System.out.println("Back from Question: " + lastQuestion);
        } else {
            System.out.println("No previous question.");
        }
    }
}

