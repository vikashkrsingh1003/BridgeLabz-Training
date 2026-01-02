package com.inheritance.hybridinheritance.resturentmanagementsystem;


public class Waiter extends Person implements Worker {
    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving " + tablesAssigned + " tables");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tables Assigned: " + tablesAssigned);
    }
}

