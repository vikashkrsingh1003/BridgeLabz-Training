package com.streamapi.studentstreamflatmap;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private List<String> contacts;

    public Student(int id, String name, List<String> contacts) {
        this.id = id;
        this.name = name;
        this.contacts = contacts;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public String getName() {
        return name;
    }
}
