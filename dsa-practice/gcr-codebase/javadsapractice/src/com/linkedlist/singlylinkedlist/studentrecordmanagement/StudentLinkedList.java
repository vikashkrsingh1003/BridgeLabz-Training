package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentLinkedList {
        
	StudentNode head;
	
	//Add element at beginning
    void addAtBeginning(int rollNo, String name, int age, char grade) {
        StudentNode newStudent = new StudentNode(rollNo, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    //Add element at the last
    void addAtEnd(int rollNo, String name, int age, char grade) {
        StudentNode newStudent = new StudentNode(rollNo, name, age, grade);

        if (head == null) {
            head = newStudent;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    //Add elememnt at specefic position
    void addAtPosition(int position, int rollNo, String name, int age, char grade) {
        if (position == 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }

        StudentNode newStudent = new StudentNode(rollNo, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    //delete element by using roll number
    void deleteByRollNo(int rollNo) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
        }
    }

    //search element by using roll number
    void searchStudent(int rollNo) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found: " + temp.rollNo + " " + temp.name + " " +
                        temp.age + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    //update grade by using roll number
    void updateGrade(int rollNo, char newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }
    //methode to display student details
    void displayStudents() {
        StudentNode temp = head;

        while (temp != null) {
            System.out.println( "RollNo: " + temp.rollNo +", Name: " + temp.name +", Age: " + temp.age +", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}


