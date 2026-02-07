package com.lambdaexpressions.studentstreamsystems;

public class Student {
    int id;
    String firstName;
    int age;
    String gender;
    String city;
    String branch;
    int rank;
    String contacts;

    public Student(int id, String firstName, int age, String gender,
                   String city, String branch, int rank, String contacts) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.branch = branch;
        this.rank = rank;
        this.contacts = contacts;
    }

    public String toString() {
        return id + " " + firstName + " " + age + " " + gender + " "
                + city + " " + branch + " " + rank + " " + contacts;
    }
}
