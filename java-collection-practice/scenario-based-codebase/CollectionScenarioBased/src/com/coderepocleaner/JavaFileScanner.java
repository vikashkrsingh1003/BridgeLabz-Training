package com.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class JavaFileScanner {

	public static List<Path> scan(String root) {

	    List<Path> result = new ArrayList<>();

	    try {
	        Path path = Paths.get(root);

	        if (!Files.exists(path)) return result;

	        Files.walk(path)
	             .filter(p -> p.toString().endsWith(".java"))
	             .forEach(result::add);

	    } catch (IOException e) {
	        System.out.println("Unable to scan folder: " + root);
	    }

	    return result;
	}
}

