package com.healthclinicApp;
import java.sql.*;
import java.util.Scanner;

public class TransactionExample {

    static final String URL = "jdbc:mysql://localhost:3306/healthclinicApp";
    static final String USER = "root";
    static final String PASSWORD = "vikash@1006";

    public static void bookAppointmentAndGenerateBill() {

        Scanner sc = new Scanner(System.in);
        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(URL, USER, PASSWORD);

            // Start Transaction --> default is true but i dont want to yet to true;
            con.setAutoCommit(false);

            System.out.print("Enter Patient ID: ");
            int patientId = sc.nextInt();

            System.out.print("Enter Doctor ID: ");
            int doctorId = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Appointment Date (yyyy-MM-dd HH:mm:ss): ");
            String date = sc.nextLine();

            // Insert Appointment
            String appointmentSql =
                    "INSERT INTO appointment(patient_id, doctor_id, appointment_date, status) VALUES(?,?,?,?)";

            PreparedStatement ps1 = con.prepareStatement(appointmentSql);

            ps1.setInt(1, patientId);
            ps1.setInt(2, doctorId);
            ps1.setString(3, date);
            ps1.setString(4, "Scheduled");

            ps1.executeUpdate();

            System.out.print("Enter Bill Amount: ");
            double amount = sc.nextDouble();

            // Insert Bill
            String billSql =
                    "INSERT INTO billing(patient_id, amount, payment_status, bill_date) VALUES(?,?,?,CURDATE())";

            PreparedStatement ps2 = con.prepareStatement(billSql);

            ps2.setInt(1, patientId);
            ps2.setDouble(2, amount);
            ps2.setString(3, "Pending");

            ps2.executeUpdate();

            // Commit Transaction
            con.commit();

            System.out.println("Transaction Successful.");
            System.out.println("Appointment Booked and Bill Generated.");

        } catch (Exception e) {

            try {

                if (con != null) {
                    con.rollback();
                    System.out.println("Transaction Rolled Back.");
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();

        } finally {

            try {

                if (con != null) {
                    con.setAutoCommit(true);
                    con.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        bookAppointmentAndGenerateBill();
    }
}