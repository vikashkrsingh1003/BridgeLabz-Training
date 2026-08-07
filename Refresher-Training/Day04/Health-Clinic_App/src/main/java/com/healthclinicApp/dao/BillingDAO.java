package com.healthclinicApp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.healthclinicApp.dbconnection.DBConnection;
import com.healthclinicApp.model.Billing;

public class BillingDAO {

    // Generate Bill
    public boolean generateBill(Billing billing) {

        boolean flag = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO billing(patient_id, amount, payment_status, bill_date) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, billing.getPatient_id());
            ps.setDouble(2, billing.getAmount());
            ps.setString(3, billing.getPayment_status());
            ps.setString(4, billing.getBill_date());

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

    // View Bills
    public void viewBills() {

        try {

            Connection con = DBConnection.getConnection();

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

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}