package com.examscanner;

import java.util.*;

public class ExamProcessor {

    public static <T extends AnswerSheet<?>> Map<String,Integer> score(
            List<T> sheets, List<String> key) {

        Map<String,Integer> map = new HashMap<>();

        for (T s : sheets)
            map.put(s.student, s.evaluate(key));

        return map;
    }

    public static PriorityQueue<Map.Entry<String,Integer>> rank(Map<String,Integer> scores) {

        PriorityQueue<Map.Entry<String,Integer>> pq =
                new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        pq.addAll(scores.entrySet());
        return pq;
    }
}

