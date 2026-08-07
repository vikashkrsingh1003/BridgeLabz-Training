package com.healthclinicApp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.healthclinicApp.dbconnection.DBConnection;
import com.healthclinicApp.model.Patient;

public class PatientDAO {

    // Register Patient
    public boolean registerPatient(Patient patient) {

        boolean flag = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO patient(name,phone,dob) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, patient.getName());
            ps.setString(2, patient.getPhone());
            ps.setString(3, patient.getDob());

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

    // View Patients
    public void viewPatients() {

        try {

            Connection con = DBConnection.getConnection();

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

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Search Patient
    public Patient searchPatient(int id) {

        Patient patient = null;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM patient WHERE patient_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                patient = new Patient();

                patient.setPatient_id(rs.getInt("patient_id"));
                patient.setName(rs.getString("name"));
                patient.setPhone(rs.getString("phone"));
                patient.setDob(rs.getString("dob"));

            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return patient;
    }

    // Update Patient
    public boolean updatePatient(Patient patient) {

        boolean flag = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE patient SET name=?,phone=?,dob=? WHERE patient_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, patient.getName());
            ps.setString(2, patient.getPhone());
            ps.setString(3, patient.getDob());
            ps.setInt(4, patient.getPatient_id());

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

    // Delete Patient
    public boolean deletePatient(int patient_id) {

        boolean flag = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM patient WHERE patient_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, patient_id);

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
}