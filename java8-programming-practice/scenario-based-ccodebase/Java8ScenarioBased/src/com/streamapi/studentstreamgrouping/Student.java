package com.streamapi.studentstreamgrouping;

public class Student {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String city;
    private String department;
    private int rank;

    public Student(int id, String name, int age, String gender,
                   String city, String department, int rank) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.department = department;
        this.rank = rank;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public String getDepartment() {
        return department;
    }

    public int getRank() {
        return rank;
    }
}
