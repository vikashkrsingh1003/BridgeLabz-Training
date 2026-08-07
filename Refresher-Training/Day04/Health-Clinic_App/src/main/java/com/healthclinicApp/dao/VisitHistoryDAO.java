package com.healthclinicApp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.healthclinicApp.dbconnection.DBConnection;
import com.healthclinicApp.model.VisitHistory;

public class VisitHistoryDAO {

    // Add Visit History
    public boolean addVisitHistory(VisitHistory visitHistory) {

        boolean flag = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO visit_history(patient_id, doctor_id, diagnosis, prescription, visit_date) VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, visitHistory.getPatient_id());
            ps.setInt(2, visitHistory.getDoctor_id());
            ps.setString(3, visitHistory.getDiagnosis());
            ps.setString(4, visitHistory.getPrescription());
            ps.setString(5, visitHistory.getVisit_date());

            int row = ps.executeUpdate();

            if (row > 0) {
                flag = true;
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return flag;
    }

    // View Visit History
    public void viewVisitHistory() {

        try {

            Connection con = DBConnection.getConnection();

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

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}