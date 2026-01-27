package com.jtest.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessor {

    public static void writeToFile(String filename, String content) throws IOException {
        Files.writeString(Path.of(filename), content);
    }

    public static String readFromFile(String filename) throws IOException {
        return Files.readString(Path.of(filename));
    }
}

