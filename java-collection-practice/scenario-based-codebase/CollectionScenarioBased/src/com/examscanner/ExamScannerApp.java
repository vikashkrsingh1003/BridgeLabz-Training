package com.examscanner;

import java.util.*;

public class ExamScannerApp {

    public static void main(String[] args) throws Exception {

        List<String> key = List.of("A","B","C","D","A","B","C");

        List<String[]> raw = ExamReader.read("/Users/apple/Desktop/Java-Programming-Workspace/java-collection-practice/scenario-based-codebase/CollectionScenarioBased/SampleFile/answer.csv");

        List<MathAnswerSheet> sheets = new ArrayList<>();

        for (String[] r : raw) {
            sheets.add(new MathAnswerSheet(
                    r[0],
                    Arrays.asList(Arrays.copyOfRange(r,1,r.length))
            ));
        }

        Map<String,Integer> scores = ExamProcessor.score(sheets, key);

        PriorityQueue<Map.Entry<String,Integer>> ranking =
                ExamProcessor.rank(scores);

        while (!ranking.isEmpty())
            System.out.println(ranking.poll());
    }
}

