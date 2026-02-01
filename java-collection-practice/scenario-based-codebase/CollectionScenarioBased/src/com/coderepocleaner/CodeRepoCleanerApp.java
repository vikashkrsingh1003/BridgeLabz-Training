package com.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class CodeRepoCleanerApp {

    public static void main(String[] args) throws Exception {

        List<Path> javaFiles = JavaFileScanner.scan("repo");

        Map<FileType,List<File>> result = RepoOrganizer.organize(javaFiles);

        List<File> largeFiles = FileFilterUtil.bySize(
                result.get(FileType.WARNING), 2000);

        System.out.println(result);
        System.out.println(largeFiles);
    }
}

