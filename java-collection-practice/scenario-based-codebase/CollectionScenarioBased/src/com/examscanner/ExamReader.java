package com.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamReader {

    static Pattern valid = Pattern.compile("^[A-Za-z ]+(,[A-D])+$");

    public static List<String[]> read(String file) throws Exception {

        List<String[]> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {
            if (valid.matcher(line).matches())
                list.add(line.split(","));
        }
        br.close();
        return list;
    }
}

