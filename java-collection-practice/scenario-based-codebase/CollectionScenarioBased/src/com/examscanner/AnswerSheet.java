package com.examscanner;

import java.util.*;

public abstract class AnswerSheet<T> {

	String student;
    List<String> answers;

    public AnswerSheet(String student, List<String> answers) {
        this.student = student;
        this.answers = answers;
    }

    public abstract int evaluate(List<String> key);
}
