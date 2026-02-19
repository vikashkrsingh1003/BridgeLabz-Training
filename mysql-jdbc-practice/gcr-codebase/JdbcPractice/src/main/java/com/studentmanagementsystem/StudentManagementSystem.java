package com.studentmanagementsystem;

import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {

	private static StudentDAO studentDAO = new StudentDAO();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean running = true;

		while (running) {
			displayMenu();
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				addStudent();
				break;
			case 2:
				viewAllStudents();
				break;
			case 3:
				viewStudentById();
				break;
			case 4:
				updateStudent();

				break;
			case 5:
				deleteStudent();
				break;
			case 6:
				running = false;
				System.out.println("Exiting... Goodbye!");
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}

		scanner.close();
	}

	private static void displayMenu() {
		System.out.println("\n===== Student Management System =====");
		System.out.println("1. Add New Student");
		System.out.println("2. View All Students");
		System.out.println("3. View Student by ID");
		System.out.println("4. Update Student");
		System.out.println("5. Delete Student");
		System.out.println("6. Exit");
		System.out.print("Enter your choice: ");
	}

	private static void addStudent() {
		System.out.print("Enter name: ");

		String name = scanner.nextLine();

		System.out.print("Enter email: ");
		String email = scanner.nextLine();

		System.out.print("Enter age: ");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter grade: ");
		String grade = scanner.nextLine();

		Student student = new Student(0, name, email, age, grade);

		if (studentDAO.insertStudent(student)) {
			System.out.println("Student added successfully!");
		} else {
			System.out.println("Failed to add student!");
		}
	}

	private static void viewAllStudents() {
		List<Student> students = studentDAO.getAllStudents();

		if (students.isEmpty()) {
			System.out.println("No students found!");
		} else {
			System.out.println("\n===== All Students =====");
			System.out.printf("%-5s %-20s %-30s %-5s %-10s%n",

					"ID", "Name", "Email", "Age", "Grade");
			System.out.println("-------------------------------------------------------------");

			for (Student student : students) {
				System.out.printf("%-5d %-20s %-30s %-5d %-10s%n", student.getId(), student.getName(),
						student.getEmail(), student.getAge(), student.getGrade());
			}
		}
	}

	private static void viewStudentById() {
		System.out.print("Enter student ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		Student student = studentDAO.getStudentById(id);

		if (student != null) {
			System.out.println("\n===== Student Details =====");
			System.out.println("ID: " + student.getId());
			System.out.println("Name: " + student.getName());
			System.out.println("Email: " + student.getEmail());
			System.out.println("Age: " + student.getAge());
			System.out.println("Grade: " + student.getGrade());
		} else {
			System.out.println("Student not found!");
		}
	}

	private static void updateStudent() {
		System.out.print("Enter student ID to update: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		Student student = studentDAO.getStudentById(id);

		if (student == null) {
			System.out.println("Student not found!");
			return;
		}

		System.out.println("Current details: " + student);

		System.out.print("Enter new name (press Enter to keep current): ");
		String name = scanner.nextLine();
		if (!name.isEmpty()) {
			student.setName(name);
		}

		System.out.print("Enter new email (press Enter to keep current): ");
		String email = scanner.nextLine();
		if (!email.isEmpty()) {
			student.setEmail(email);
		}

		System.out.print("Enter new age (0 to keep current): ");
		int age = scanner.nextInt();

		scanner.nextLine();
		if (age > 0) {
			student.setAge(age);
		}

		System.out.print("Enter new grade (press Enter to keep current): ");
		String grade = scanner.nextLine();
		if (!grade.isEmpty()) {
			student.setGrade(grade);
		}

		if (studentDAO.updateStudent(student)) {
			System.out.println("Student updated successfully!");
		} else {
			System.out.println("Failed to update student!");
		}
	}

	private static void deleteStudent() {
		System.out.print("Enter student ID to delete: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		Student student = studentDAO.getStudentById(id);

		if (student == null) {
			System.out.println("Student not found!");
			return;
		}

		System.out.println("Are you sure you want to delete this student?");
		System.out.println(student);
		System.out.print("Enter 'yes' to confirm: ");
		String confirm = scanner.nextLine();

		if (confirm.equalsIgnoreCase("yes")) {
			if (studentDAO.deleteStudent(id)) {
				System.out.println("Student deleted successfully!");
			} else {
				System.out.println("Failed to delete student!");
			}
		} else {
			System.out.println("Deletion cancelled.");
		}
	}
}
