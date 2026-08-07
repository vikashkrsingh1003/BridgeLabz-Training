package com.healthclinicApp.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

import com.healthclinicApp.dbconnection.DBConnection;
import com.healthclinicApp.model.Doctor;

public class DoctorDAO {

    // Add Doctor using Stored Procedure
    public boolean addDoctor(Doctor doctor) {

        boolean flag = false;

        try {

            Connection con = DBConnection.getConnection();

            CallableStatement cs = con.prepareCall("{call AddDoctor(?, ?)}");

            cs.setString(1, doctor.getName());
            cs.setString(2, doctor.getSpecialty());

            cs.execute();

            flag = true;

            cs.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return flag;
    }

    // View Doctors
    public void viewDoctors() {

        try {

            Connection con = DBConnection.getConnection();

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

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Get Doctor Count using Stored Procedure
    public int getDoctorCount() {

        int total = 0;

        try {

            Connection con = DBConnection.getConnection();

            CallableStatement cs = con.prepareCall("{call GetDoctorCount(?)}");

            cs.registerOutParameter(1, Types.INTEGER);

            cs.execute();

            total = cs.getInt(1);

            cs.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return total;
    }

}