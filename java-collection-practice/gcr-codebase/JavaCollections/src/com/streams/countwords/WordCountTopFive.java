package com.streams.countwords;

import java.io.*;
import java.util.*;

public class WordCountTopFive {

    public static void main(String[] args) {

        String filePath = "All-File/input.txt";

        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                line = line.toLowerCase();

                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(
                            word,
                            wordCountMap.getOrDefault(word, 0) + 1
                        );
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(wordCountMap.entrySet());

        list.sort((e1, e2) -> e2.getValue() - e1.getValue());

        System.out.println("Top 5 most frequent words:");
        int count = 0;

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            count++;
            if (count == 5) break;
        }
    }
}

