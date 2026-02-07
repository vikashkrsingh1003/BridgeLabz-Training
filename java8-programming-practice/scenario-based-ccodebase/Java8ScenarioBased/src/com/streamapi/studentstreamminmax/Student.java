package com.streamapi.studentstreamminmax;

public class Student {

    private int id;
    private String name;
    private int age;
    private int rank;

    public Student(int id, String name, int age, int rank) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    public int getAge() {
        return age;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " " + name + " " + age + " " + rank;
    }
}
