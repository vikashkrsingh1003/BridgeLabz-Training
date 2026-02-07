package com.streamapi.studentstreamgender;

public class Student {

    private int id;
    private String name;
    private int age;
    private String gender;
    private int rank;

    public Student(int id, String name, int age, String gender, int rank) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rank = rank;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getRank() {
        return rank;
    }

    public String toString() {
        return id + " " + name + " " + age + " " + gender + " " + rank;
    }
}
