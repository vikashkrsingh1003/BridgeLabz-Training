package com.day03.examproctor;

public class ExamProctorMain {

    public static void main(String[] args) {

        QuestionNavigator navigator = new QuestionNavigator();
        AnswerStore answerStore = new AnswerStore();
        ScoreEvaluator evaluator = new ScoreEvaluator();

        // Setup correct answers
        answerStore.addCorrectAnswer(1, "A");
        answerStore.addCorrectAnswer(2, "B");
        answerStore.addCorrectAnswer(3, "C");

        // Student navigation and answering
        navigator.visitQuestion(1);
        answerStore.submitAnswer(1, "A");

        navigator.visitQuestion(2);
        answerStore.submitAnswer(2, "C");

        navigator.visitQuestion(3);
        answerStore.submitAnswer(3, "C");

        navigator.goBack();

        // Auto evaluation
        int score = evaluator.calculateScore(
                answerStore.getStudentAnswers(),
                answerStore.getCorrectAnswers());

        System.out.println("Final Score: " + score);
    }
}

