package com.healthclinicApp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.healthclinicApp.dbconnection.DBConnection;
import com.healthclinicApp.model.Appointment;

public class AppointmentDAO {

    // Schedule Appointment
    public boolean scheduleAppointment(Appointment appointment) {

        boolean flag = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO appointment(patient_id, doctor_id, appointment_date, status) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, appointment.getPatient_id());
            ps.setInt(2, appointment.getDoctor_id());
            ps.setString(3, appointment.getAppointment_date());
            ps.setString(4, appointment.getStatus());

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

    // Update Appointment Status
    public boolean updateAppointmentStatus(int appointment_id, String status) {

        boolean flag = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE appointment SET status=? WHERE appointment_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, status);
            ps.setInt(2, appointment_id);

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

    // Cancel Appointment
    public boolean cancelAppointment(int appointment_id) {

        boolean flag = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE appointment SET status='Cancelled' WHERE appointment_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, appointment_id);

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