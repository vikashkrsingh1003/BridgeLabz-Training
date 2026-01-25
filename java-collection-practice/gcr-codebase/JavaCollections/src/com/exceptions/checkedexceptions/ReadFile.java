package com.exceptions.checkedexceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile{

    public static void main(String[] args) {

        try {
            // Attempt to open and read the file
            BufferedReader reader = new BufferedReader(new FileReader("All-File/data.txt"));
            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file
            reader.close();

        } catch (IOException e) {
            // Handles file not found or other IO issues
            System.out.println("File not found");
        }
    }
}
