package com.healthclinicApp.Health_Clinic_App;


import java.sql.*;
import java.util.Scanner;

public class HealthClinicApp {

    static Scanner sc = new Scanner(System.in);

    // Database Connection
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/healthclinicApp",
                    "root",
                    "vikash@1006");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

   
    // Register Patient
    public static void registerPatient() {

        try {

            Connection con = getConnection();

            System.out.print("Enter Name : ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Enter Phone : ");
            String phone = sc.nextLine();

            System.out.print("Enter DOB (yyyy-mm-dd) : ");
            String dob = sc.nextLine();

            String sql = "INSERT INTO patient(name,phone,dob) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, dob);

            int row = ps.executeUpdate();

            if (row > 0)
                System.out.println("Patient Registered Successfully.");

            con.close();

        } catch (Exception e) {
          System.out.println(e);;
        }

    }


    // View Patients
    public static void viewPatients() {

        try {

            Connection con = getConnection();

            String sql = "SELECT * FROM patient";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            System.out.println("-----------------------------------------------");
            System.out.println("ID\tName\tPhone\tDOB");
            System.out.println("-----------------------------------------------");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("patient_id") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getString("phone") + "\t" +
                        rs.getDate("dob"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Search Patient
    public static void searchPatient() {

        try {

            Connection con = getConnection();

            System.out.print("Enter Patient ID : ");
            int id = sc.nextInt();

            String sql = "SELECT * FROM patient WHERE patient_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("Patient ID : " + rs.getInt("patient_id"));
                System.out.println("Name       : " + rs.getString("name"));
                System.out.println("Phone      : " + rs.getString("phone"));
                System.out.println("DOB        : " + rs.getDate("dob"));

            } else {

                System.out.println("Patient Not Found.");

            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Update Patient
    public static void updatePatient() {

        try {

            Connection con = getConnection();

            System.out.print("Enter Patient ID : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Name : ");
            String name = sc.nextLine();

            System.out.print("Enter New Phone : ");
            String phone = sc.nextLine();

            System.out.print("Enter New DOB (yyyy-mm-dd) : ");
            String dob = sc.nextLine();

            String sql = "UPDATE patient SET name=?,phone=?,dob=? WHERE patient_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, dob);
            ps.setInt(4, id);

            int row = ps.executeUpdate();

            if (row > 0)
                System.out.println("Patient Updated Successfully.");
            else
                System.out.println("Patient Not Found.");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Delete Patient
    public static void deletePatient() {

        try {

            Connection con = getConnection();

            System.out.print("Enter Patient ID : ");
            int id = sc.nextInt();

            String sql = "DELETE FROM patient WHERE patient_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int row = ps.executeUpdate();

            if (row > 0)
                System.out.println("Patient Deleted Successfully.");
            else
                System.out.println("Patient Not Found.");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
     }

    // ==========================
    // Doctor Methods
    // ==========================

 // Add Doctor
    public static void addDoctor() {

        try {

            Connection con = getConnection();

            sc.nextLine();

            System.out.print("Enter Doctor Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Specialty : ");
            String specialty = sc.nextLine();

            String sql = "INSERT INTO doctor(name, specialty) VALUES(?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, specialty);

            int row = ps.executeUpdate();

            if (row > 0)
                System.out.println("Doctor Added Successfully.");
            else
                System.out.println("Failed to Add Doctor.");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 // View Doctors
    public static void viewDoctors() {

        try {

            Connection con = getConnection();

            String sql = "SELECT * FROM doctor";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            System.out.println("\n--------------------------------------------");
            System.out.printf("%-10s %-25s %-20s%n", "ID", "Name", "Specialty");
            System.out.println("--------------------------------------------");

            while (rs.next()) {

                System.out.printf("%-10d %-25s %-20s%n",
                        rs.getInt("doctor_id"),
                        rs.getString("name"),
                        rs.getString("specialty"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ==========================
    // Appointment Methods
    // ==========================

 // Schedule Appointment
    public static void scheduleAppointment() {

        try {

            Connection con = getConnection();

            System.out.print("Enter Patient ID : ");
            int patientId = sc.nextInt();

            System.out.print("Enter Doctor ID : ");
            int doctorId = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Appointment Date & Time (yyyy-MM-dd HH:mm:ss): ");
            String dateTime = sc.nextLine();

            String sql = "INSERT INTO appointment(patient_id, doctor_id, appointment_date, status) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, patientId);
            ps.setInt(2, doctorId);
            ps.setString(3, dateTime);
            ps.setString(4, "Scheduled");

            int row = ps.executeUpdate();

            if (row > 0)
                System.out.println("Appointment Scheduled Successfully.");
            else
                System.out.println("Failed to Schedule Appointment.");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void viewAppointments() {

    }

 // Update Appointment Status
    public static void updateAppointmentStatus() {

        try {

            Connection con = getConnection();

            System.out.print("Enter Appointment ID : ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter New Status (Scheduled/Completed/Cancelled): ");
            String status = sc.nextLine();

            String sql = "UPDATE appointment SET status=? WHERE appointment_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, status);
            ps.setInt(2, id);

            int row = ps.executeUpdate();

            if (row > 0)
                System.out.println("Appointment Status Updated.");
            else
                System.out.println("Appointment Not Found.");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
 // Cancel Appointment
    public static void cancelAppointment() {

        try {

            Connection con = getConnection();

            System.out.print("Enter Appointment ID : ");
            int id = sc.nextInt();

            String sql = "UPDATE appointment SET status='Cancelled' WHERE appointment_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int row = ps.executeUpdate();

            if (row > 0)
                System.out.println("Appointment Cancelled Successfully.");
            else
                System.out.println("Appointment Not Found.");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    

 // Add Visit History
    public static void addVisitHistory() {

        try {

            Connection con = getConnection();

            System.out.print("Enter Patient ID : ");
            int patientId = sc.nextInt();

            System.out.print("Enter Doctor ID : ");
            int doctorId = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Diagnosis : ");
            String diagnosis = sc.nextLine();

            System.out.print("Enter Prescription : ");
            String prescription = sc.nextLine();

            System.out.print("Enter Visit Date (yyyy-MM-dd) : ");
            String visitDate = sc.nextLine();

            String sql = "INSERT INTO visit_history(patient_id, doctor_id, diagnosis, prescription, visit_date) VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, patientId);
            ps.setInt(2, doctorId);
            ps.setString(3, diagnosis);
            ps.setString(4, prescription);
            ps.setString(5, visitDate);

            int row = ps.executeUpdate();

            if (row > 0)
                System.out.println("Visit History Added Successfully.");
            else
                System.out.println("Failed to Add Visit History.");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 // View Visit History
    public static void viewVisitHistory() {

        try {

            Connection con = getConnection();

            String sql =
                    "SELECT v.visit_id, " +
                    "p.name AS patient_name, " +
                    "d.name AS doctor_name, " +
                    "v.diagnosis, " +
                    "v.prescription, " +
                    "v.visit_date " +
                    "FROM visit_history v " +
                    "JOIN patient p ON v.patient_id = p.patient_id " +
                    "JOIN doctor d ON v.doctor_id = d.doctor_id";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            System.out.println("--------------------------------------------------------------------------------------------------------------");
            System.out.printf("%-5s %-20s %-20s %-25s %-25s %-15s%n",
                    "ID", "Patient", "Doctor", "Diagnosis", "Prescription", "Visit Date");
            System.out.println("--------------------------------------------------------------------------------------------------------------");

            while (rs.next()) {

                System.out.printf("%-5d %-20s %-20s %-25s %-25s %-15s%n",
                        rs.getInt("visit_id"),
                        rs.getString("patient_name"),
                        rs.getString("doctor_name"),
                        rs.getString("diagnosis"),
                        rs.getString("prescription"),
                        rs.getDate("visit_date"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 // Generate Bill
    public static void generateBill() {

        try {

            Connection con = getConnection();

            System.out.print("Enter Patient ID : ");
            int patientId = sc.nextInt();

            System.out.print("Enter Bill Amount : ");
            double amount = sc.nextDouble();

            sc.nextLine();

            System.out.print("Enter Payment Status (Paid/Pending) : ");
            String status = sc.nextLine();

            System.out.print("Enter Bill Date (yyyy-MM-dd) : ");
            String billDate = sc.nextLine();

            String sql = "INSERT INTO billing(patient_id, amount, payment_status, bill_date) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, patientId);
            ps.setDouble(2, amount);
            ps.setString(3, status);
            ps.setString(4, billDate);

            int row = ps.executeUpdate();

            if (row > 0)
                System.out.println("Bill Generated Successfully.");
            else
                System.out.println("Failed to Generate Bill.");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 // View Bills
    public static void viewBills() {

        try {

            Connection con = getConnection();

            String sql =
                    "SELECT b.bill_id, " +
                    "p.name AS patient_name, " +
                    "b.amount, " +
                    "b.payment_status, " +
                    "b.bill_date " +
                    "FROM billing b " +
                    "JOIN patient p ON b.patient_id = p.patient_id";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            System.out.println("----------------------------------------------------------------------------");
            System.out.printf("%-8s %-25s %-12s %-15s %-15s%n",
                    "Bill ID", "Patient", "Amount", "Status", "Bill Date");
            System.out.println("----------------------------------------------------------------------------");

            while (rs.next()) {

                System.out.printf("%-8d %-25s %-12.2f %-15s %-15s%n",
                        rs.getInt("bill_id"),
                        rs.getString("patient_name"),
                        rs.getDouble("amount"),
                        rs.getString("payment_status"),
                        rs.getDate("bill_date"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ==========================
    // Main Method
    // ==========================

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== HEALTH CLINIC MANAGEMENT SYSTEM =====");
            System.out.println("1. Register Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Update Patient");
            System.out.println("5. Delete Patient");
            System.out.println("6. Add Doctor");
            System.out.println("7. View Doctors");
            System.out.println("8. Schedule Appointment");
            System.out.println("9. View Appointments");
            System.out.println("10. Update Appointment Status");
            System.out.println("11. Cancel Appointment");
            System.out.println("12. Add Visit History");
            System.out.println("13. View Visit History");
            System.out.println("14. Generate Bill");
            System.out.println("15. View Bills");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    registerPatient();
                    break;

                case 2:
                    viewPatients();
                    break;

                case 3:
                    searchPatient();
                    break;

                case 4:
                    updatePatient();
                    break;

                case 5:
                    deletePatient();
                    break;

                case 6:
                    addDoctor();
                    break;

                case 7:
                    viewDoctors();
                    break;

                case 8:
                    scheduleAppointment();
                    break;

                case 9:
                    viewAppointments();
                    break;

                case 10:
                    updateAppointmentStatus();
                    break;

                case 11:
                    cancelAppointment();
                    break;

                case 12:
                    addVisitHistory();
                    break;

                case 13:
                    viewVisitHistory();
                    break;

                case 14:
                    generateBill();
                    break;

                case 15:
                    viewBills();
                    break;

                case 0:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}