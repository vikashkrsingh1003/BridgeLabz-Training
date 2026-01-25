package com.streams.readalargefile;

import java.io.*;

public class ReadALargeFile {

    public static void main(String[] args) {

        String filePath = "All-File/largefile.log";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
