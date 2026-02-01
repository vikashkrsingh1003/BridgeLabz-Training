package com.examresultuploader;

import java.util.*;

public class ResultProcessor {

    public static Map<String,List<Integer>> subjectMap(
            List<ExamRecord<Integer>> list) {

        Map<String,List<Integer>> map = new HashMap<>();

        for (ExamRecord<Integer> r : list) {
            map.computeIfAbsent(r.subject, k -> new ArrayList<>())
               .add(r.marks);
        }

        return map;
    }

    public static Map<String,Integer> topScorers(
            Map<String,List<Integer>> map) {

        Map<String,Integer> result = new HashMap<>();

        for (String sub : map.keySet()) {

            PriorityQueue<Integer> pq =
                    new PriorityQueue<>(Collections.reverseOrder());

            pq.addAll(map.get(sub));

            result.put(sub, pq.poll());
        }

        return result;
    }
}

