package com.songvault;

import java.util.*;

public class SongVaultApp {

    public static void main(String[] args) throws Exception {

        List<Song> songs = SongReader.readFolder("songs");

        System.out.println(SongLibrary.byGenre(songs));

        System.out.println(SongLibrary.artists(songs));

        System.out.println(SongLibrary.sortByTitle(songs));

        System.out.println(SongLibrary.filterGenre(songs,"Rock"));
    }
}

