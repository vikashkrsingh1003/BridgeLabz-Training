package com.feedbackguru;

import java.io.*;
import java.util.*;

public class FeedbackReader {

    public static List<String> readFiles(String folderPath) throws Exception {
        List<String> lines = new ArrayList<>();
        File folder = new File(folderPath);

        File[] files = folder.listFiles();
        
        if(files == null ) return lines;
        for (File file : files) {
            if (file.getName().endsWith(".txt")) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null) {
                    lines.add(line);
                }
                br.close();
            }
        }
        return lines;
    }
}

