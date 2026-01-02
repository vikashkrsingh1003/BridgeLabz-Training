package com.objectmodel.level1.universitywithfaculties;

public class Main {
    public static void main(String[] args) {

        // Faculty exist independently (aggregation)
        Faculty f1 = new Faculty(101, "Dr. Smith");
        Faculty f2 = new Faculty(102, "Dr. Johnson");

        // University
        University university = new University("Global Tech University");

        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");

        university.addFaculty(f1);
        university.addFaculty(f2);

        university.displayUniversity();

        // Composition effect
        university = null;

        System.out.println("University deleted. All departments are deleted.");

        // Faculty still exist
        f1.displayFaculty();
        f2.displayFaculty();
    }
}

