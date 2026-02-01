package com.examresultuploader;

import java.util.*;

public class ExamResultUploaderApp {

    public static void main(String[] args) {

        try {
            List<ExamRecord<Integer>> records =
                    ResultReader.read("/Users/apple/Desktop/Java-Programming-Workspace/java-collection-practice/scenario-based-codebase/CollectionScenarioBased/SampleFile/marks.csv");

            Map<String,List<Integer>> subjectMarks =
                    ResultProcessor.subjectMap(records);

            Map<String,Integer> toppers =
                    ResultProcessor.topScorers(subjectMarks);

            System.out.println(subjectMarks);
            System.out.println(toppers);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

