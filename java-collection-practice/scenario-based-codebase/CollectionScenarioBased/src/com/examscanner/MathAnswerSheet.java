package com.examscanner;

import java.util.*;

public class MathAnswerSheet extends AnswerSheet<String> {

    public MathAnswerSheet(String student, List<String> answers) {
        super(student, answers);
    }

    public int evaluate(List<String> key) {
        int score = 0;
        for (int i = 0; i < Math.min(answers.size(), key.size()); i++)
            if (answers.get(i).equals(key.get(i))) score++;
        return score;
    }
}

