package com.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class RepoOrganizer {

    public static Map<FileType,List<File>> organize(List<Path> files) throws Exception {

        Map<FileType,List<File>> map = new HashMap<>();

        for (FileType t : FileType.values())
            map.put(t, new ArrayList<>());

        for (Path p : files) {
            FileType type = CodeAnalyzer.analyze(p);
            map.get(type).add(p.toFile());
        }

        return map;
    }
}

