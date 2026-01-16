package com.day04.hospitalqueue;

public class HospitalQueue {

    //Patient class
    static class Patient {
        String name;
        int criticality; 

        Patient(String name, int criticality) {
            this.name = name;
            this.criticality = criticality;
        }
    }

    // Bubble Sort function (Descending order of criticality)
    static void bubbleSort(Patient[] patients) {
        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if next patient is more critical
                if (patients[j].criticality < patients[j + 1].criticality) {
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        Patient[] queue = { new Patient("Rahul", 4),
                             new Patient("Anita", 9),
                            new Patient("Suresh", 6),
                             new Patient("Kiran", 10),
                            new Patient("Meena", 3) };

        System.out.println("Before Sorting (Arrival Order):");
        for (Patient p : queue) {
            System.out.println(p.name + " - Criticality: " + p.criticality);
        }

        bubbleSort(queue);

        System.out.println("\nAfter Sorting (By Criticality):");
        for (Patient p : queue) {
            System.out.println(p.name + " - Criticality: " + p.criticality);
        }
    }
}

