package com.day04.edumentor;

public class EduMentorApp {
    public static void main(String[] args) {

        Learner learner = new Learner("Aarav", "aarav@mail.com", "L101");
        FullTimeLearner ftLearner = new FullTimeLearner("Riya", "riya@mail.com", "FT202");

        learner.displayRole();
        System.out.println(learner.generateCertificate());

        ftLearner.displayRole();
        System.out.println(ftLearner.generateCertificate());

        String[] questions = {"2+2?", "Capital of India?"};
        String[] answers = {"4", "delhi"};

        Quiz quiz = new Quiz(questions, answers, 2);

        String[] userAnswers = {"4", "delhi"};
        quiz.evaluate(userAnswers);

        System.out.println("Score: " + quiz.getScore());
        System.out.println("Percentage: " + quiz.getPercentage() + "%");
    }
}

