package com.csvdata.csvtoobject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class StudentCSVReader {

    public static void main(String[] args) throws Exception {

        InputStream is = StudentCSVReader.class
                .getClassLoader()
                .getResourceAsStream("samplefiles/csvtoobject/students.csv");

        if (is == null) {
            throw new RuntimeException("students.csv not found");
        }

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(is, StandardCharsets.UTF_8))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                // skip empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                // skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                // validate column count
                if (data.length < 4) {
                    System.out.println("Skipping invalid row: " + line);
                    continue;
                }

                try {
                    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();
                    int age = Integer.parseInt(data[2].trim());
                    int marks = Integer.parseInt(data[3].trim());

                    Student student = new Student(id, name, age, marks);
                    System.out.println(student);

                } catch (NumberFormatException e) {
                    System.out.println("Skipping row with invalid number: " + line);
                }
            }
        }
    }
}
