package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class Main {
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtEnd(101, "Amit", 20, 'A');
        list.addAtBeginning(102, "Ravi", 21, 'B');
        list.addAtPosition(2, 103, "Neha", 19, 'A');

        list.displayStudents();

        list.searchStudent(103);

        list.updateGrade(101, 'A');

        list.deleteByRollNo(102);

        list.displayStudents();
    }
}

