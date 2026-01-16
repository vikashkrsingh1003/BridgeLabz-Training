package com.day03.examproctor;

import java.util.Map;

 public class ScoreEvaluator {

	  public int calculateScore(Map<Integer, String> studentAnswers,Map<Integer, String> correctAnswers) {

	        int score = 0;

	        for (int questionId : correctAnswers.keySet()) {
	            if (studentAnswers.containsKey(questionId) &&
	                studentAnswers.get(questionId)
	                        .equalsIgnoreCase(correctAnswers.get(questionId))) {
	                score++;
	            }
	        }
	        return score;
	  }
}
