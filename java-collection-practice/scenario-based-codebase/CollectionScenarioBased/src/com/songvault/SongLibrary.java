package com.songvault;

import java.util.*;
import java.util.stream.*;

public class SongLibrary {

    public static Map<String,List<Song>> byGenre(List<Song> songs) {

        return songs.stream()
                .collect(Collectors.groupingBy(s -> s.genre));
    }

    public static Set<String> artists(List<Song> songs) {

        return songs.stream()
                .map(s -> s.creator)
                .collect(Collectors.toSet());
    }

    public static List<Song> sortByTitle(List<Song> songs) {

        return songs.stream()
                .sorted((a,b) -> a.title.compareTo(b.title))
                .toList();
    }

    public static List<Song> filterGenre(List<Song> songs, String g) {

        return songs.stream()
                .filter(s -> s.genre.equalsIgnoreCase(g))
                .toList();
    }
}

