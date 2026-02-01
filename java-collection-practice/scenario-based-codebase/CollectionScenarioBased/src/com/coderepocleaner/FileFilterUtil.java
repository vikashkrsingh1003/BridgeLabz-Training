package com.coderepocleaner;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class FileFilterUtil {

    public static List<File> bySize(List<File> files, long minSize) {
        return files.stream()
                .filter(f -> f.length() > minSize)
                .collect(Collectors.toList());
    }

    public static List<File> byModified(List<File> files, long after) {
        return files.stream()
                .filter(f -> f.lastModified() > after)
                .collect(Collectors.toList());
    }
}

