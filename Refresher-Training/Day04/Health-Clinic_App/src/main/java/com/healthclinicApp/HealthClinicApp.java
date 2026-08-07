package com.healthclinicApp;

import java.util.Scanner;

import com.healthclinicApp.dao.AppointmentDAO;
import com.healthclinicApp.dao.BillingDAO;
import com.healthclinicApp.dao.DoctorDAO;
import com.healthclinicApp.dao.PatientDAO;
import com.healthclinicApp.dao.VisitHistoryDAO;
import com.healthclinicApp.model.Appointment;
import com.healthclinicApp.model.Billing;
import com.healthclinicApp.model.Doctor;
import com.healthclinicApp.model.Patient;
import com.healthclinicApp.model.VisitHistory;

public class HealthClinicApp {

    static Scanner sc = new Scanner(System.in);

    static PatientDAO patientDAO = new PatientDAO();
    static DoctorDAO doctorDAO = new DoctorDAO();
    static AppointmentDAO appointmentDAO = new AppointmentDAO();
    static VisitHistoryDAO visitHistoryDAO = new VisitHistoryDAO();
    static BillingDAO billingDAO = new BillingDAO();

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
            System.out.println("9. Update Appointment Status");
            System.out.println("10. Cancel Appointment");
            System.out.println("11. Add Visit History");
            System.out.println("12. View Visit History");
            System.out.println("13. Generate Bill");
            System.out.println("14. View Bills");
            System.out.println("15. Get Doctor Count");
            System.out.println("0. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                Patient patient = new Patient();

                sc.nextLine();

                System.out.print("Enter Name : ");
                patient.setName(sc.nextLine());

                System.out.print("Enter Phone : ");
                patient.setPhone(sc.nextLine());

                System.out.print("Enter DOB (yyyy-MM-dd) : ");
                patient.setDob(sc.nextLine());

                if (patientDAO.registerPatient(patient))
                    System.out.println("Patient Registered Successfully.");
                else
                    System.out.println("Registration Failed.");

                break;

            case 2:

                patientDAO.viewPatients();

                break;

            case 3:

                System.out.print("Enter Patient ID : ");
                int id = sc.nextInt();

                Patient p = patientDAO.searchPatient(id);

                if (p != null) {

                    System.out.println("Patient ID : " + p.getPatient_id());
                    System.out.println("Name : " + p.getName());
                    System.out.println("Phone : " + p.getPhone());
                    System.out.println("DOB : " + p.getDob());

                } else {

                    System.out.println("Patient Not Found.");

                }

                break;

            case 4:

                Patient update = new Patient();

                System.out.print("Enter Patient ID : ");
                update.setPatient_id(sc.nextInt());

                sc.nextLine();

                System.out.print("Enter New Name : ");
                update.setName(sc.nextLine());

                System.out.print("Enter New Phone : ");
                update.setPhone(sc.nextLine());

                System.out.print("Enter New DOB : ");
                update.setDob(sc.nextLine());

                if (patientDAO.updatePatient(update))
                    System.out.println("Patient Updated Successfully.");
                else
                    System.out.println("Patient Not Found.");

                break;

            case 5:

                System.out.print("Enter Patient ID : ");
                int deleteId = sc.nextInt();

                if (patientDAO.deletePatient(deleteId))
                    System.out.println("Patient Deleted Successfully.");
                else
                    System.out.println("Patient Not Found.");

                break;

            case 6:

                Doctor doctor = new Doctor();

                sc.nextLine();

                System.out.print("Enter Doctor Name : ");
                doctor.setName(sc.nextLine());

                System.out.print("Enter Specialty : ");
                doctor.setSpecialty(sc.nextLine());

                if (doctorDAO.addDoctor(doctor))
                    System.out.println("Doctor Added Successfully.");
                else
                    System.out.println("Failed.");

                break;

            case 7:

                doctorDAO.viewDoctors();

                break;
                
                
            case 8:

                Appointment appointment = new Appointment();

                System.out.print("Enter Patient ID : ");
                appointment.setPatient_id(sc.nextInt());

                System.out.print("Enter Doctor ID : ");
                appointment.setDoctor_id(sc.nextInt());

                sc.nextLine();

                System.out.print("Enter Appointment Date (yyyy-MM-dd HH:mm:ss) : ");
                appointment.setAppointment_date(sc.nextLine());

                appointment.setStatus("Scheduled");

                if (appointmentDAO.scheduleAppointment(appointment))
                    System.out.println("Appointment Scheduled Successfully.");
                else
                    System.out.println("Failed.");

                break;

            case 9:

                System.out.print("Enter Appointment ID : ");
                int appointment_id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter New Status (Scheduled/Completed/Cancelled) : ");
                String status = sc.nextLine();

                if (appointmentDAO.updateAppointmentStatus(appointment_id, status))
                    System.out.println("Appointment Updated Successfully.");
                else
                    System.out.println("Appointment Not Found.");

                break;

            case 10:

                System.out.print("Enter Appointment ID : ");
                int cancelId = sc.nextInt();

                if (appointmentDAO.cancelAppointment(cancelId))
                    System.out.println("Appointment Cancelled Successfully.");
                else
                    System.out.println("Appointment Not Found.");

                break;

            case 11:

                VisitHistory visitHistory = new VisitHistory();

                System.out.print("Enter Patient ID : ");
                visitHistory.setPatient_id(sc.nextInt());

                System.out.print("Enter Doctor ID : ");
                visitHistory.setDoctor_id(sc.nextInt());

                sc.nextLine();

                System.out.print("Enter Diagnosis : ");
                visitHistory.setDiagnosis(sc.nextLine());

                System.out.print("Enter Prescription : ");
                visitHistory.setPrescription(sc.nextLine());

                System.out.print("Enter Visit Date (yyyy-MM-dd) : ");
                visitHistory.setVisit_date(sc.nextLine());

                if (visitHistoryDAO.addVisitHistory(visitHistory))
                    System.out.println("Visit History Added Successfully.");
                else
                    System.out.println("Failed.");

                break;

            case 12:

                visitHistoryDAO.viewVisitHistory();

                break;

            case 13:

                Billing billing = new Billing();

                System.out.print("Enter Patient ID : ");
                billing.setPatient_id(sc.nextInt());

                System.out.print("Enter Amount : ");
                billing.setAmount(sc.nextDouble());

                sc.nextLine();

                System.out.print("Enter Payment Status (Paid/Pending) : ");
                billing.setPayment_status(sc.nextLine());

                System.out.print("Enter Bill Date (yyyy-MM-dd) : ");
                billing.setBill_date(sc.nextLine());

                if (billingDAO.generateBill(billing))
                    System.out.println("Bill Generated Successfully.");
                else
                    System.out.println("Failed.");

                break;

            case 14:

                billingDAO.viewBills();

                break;

            case 15:

                System.out.println("Total Doctors : " + doctorDAO.getDoctorCount());

                break;

            case 0:

                System.out.println("Thank You...");
                System.exit(0);

                break;

            default:

                System.out.println("Continue in Part-2...");

            }

        }

    }

}