package com.songvault;

public abstract class Media<T> {
    String title;
    T creator;
    String duration;

    public Media(String title, T creator, String duration) {
        this.title = title;
        this.creator = creator;
        this.duration = duration;
    }
}

