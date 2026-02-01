package com.examresultuploader;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResultReader {

    static Pattern valid =
            Pattern.compile("\\d+,\\w+,\\w+,\\d{1,3}");

    public static List<ExamRecord<Integer>> read(String file)
            throws Exception {

        List<ExamRecord<Integer>> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {

            if (!valid.matcher(line).matches())
                throw new InvalidFormatException(line);

            String[] p = line.split(",");

            int marks = Integer.parseInt(p[3]);

            list.add(new ExamRecord<>(p[0], p[1], p[2], marks));
        }

        br.close();
        return list;
    }
}
