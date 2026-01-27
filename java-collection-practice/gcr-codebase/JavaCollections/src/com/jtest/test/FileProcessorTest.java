package com.jtest.test;

import org.junit.jupiter.api.Test;

import com.jtest.main.FileProcessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {

    private final String testFile = "testfile.txt";
    private final String content = "Hello, JUnit!";

    @Test
    public void testWriteAndReadFile() throws IOException {
        
        FileProcessor.writeToFile(testFile, content);

     
        assertTrue(Files.exists(Path.of(testFile)), "File should exist after writing");

       
        String readContent = FileProcessor.readFromFile(testFile);
        assertEquals(content, readContent, "Content read should match content written");

     
        Files.deleteIfExists(Path.of(testFile));
    }

    @Test
    public void testReadFileIOException() {
       
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
    }

    @Test
    public void testWriteFileIOException() {
        assertThrows(IOException.class, () -> FileProcessor.writeToFile("/", "data"));
    }
}

