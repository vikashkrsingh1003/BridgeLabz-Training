package com.streamapi.studentstreambonus;

public class Student {

    private int id;
    private String name;
    private int age;
    private int rank;
    private String city;
    private String department;

    public Student(int id, String name, int age, int rank,
                   String city, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.city = city;
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public int getRank() {
        return rank;
    }

    public String getCity() {
        return city;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return id + " " + name + " " + age + " " + rank + " " + city + " " + department;
    }
}
