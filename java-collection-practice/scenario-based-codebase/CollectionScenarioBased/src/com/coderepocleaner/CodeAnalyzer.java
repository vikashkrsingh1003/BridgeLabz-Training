package com.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class CodeAnalyzer {

    static Pattern badMethod = Pattern.compile("\\b[A-Z][a-zA-Z0-9]*\\s*\\(");
    static Pattern unusedImport = Pattern.compile("import\\s+.*;");

    public static FileType analyze(Path path) throws Exception {

        List<String> lines = Files.readAllLines(path);

        boolean badName = false;
        boolean unused = false;

        for (String l : lines) {
            if (badMethod.matcher(l).find()) badName = true;
            if (l.trim().startsWith("import")) unused = true;
        }

        if (badName && unused) return FileType.ERROR;
        if (badName || unused) return FileType.WARNING;
        return FileType.VALID;
    }
}

