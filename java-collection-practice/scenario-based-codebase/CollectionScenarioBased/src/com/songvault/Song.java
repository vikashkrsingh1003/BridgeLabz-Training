package com.songvault;

public class Song extends Media<String> {
    String genre;

    public Song(String title, String artist, String duration, String genre) {
        super(title, artist, duration);
        this.genre = genre;
    }
}

