/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import enums.LocalDateTime;
import java.time.LocalDate;

/**
 *
 * @author ACER
 */
public class Reportdto {
    private String patient_name;
    private String test_name;
    private String test_results;
    private String doctor_name;
    private String technician;
    private LocalDateTime appointment_date;
    private String payment_status;
    private LocalDate report_date;
    private String comments;

    public Reportdto(String patient_name, String test_name, String test_results, String doctor_name, String technician, LocalDateTime appointment_date, String payment_status, LocalDate report_date, String comments) {
        this.patient_name = patient_name;
        this.test_name = test_name;
        this.test_results = test_results;
        this.doctor_name = doctor_name;
        this.technician = technician;
        this.appointment_date = appointment_date;
        this.payment_status = payment_status;
        this.report_date = report_date;
        this.comments = comments;
    }

    public Reportdto() {
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public String getTest_results() {
        return test_results;
    }

    public void setTest_results(String test_results) {
        this.test_results = test_results;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public LocalDateTime getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(LocalDateTime appointment_date) {
        this.appointment_date = appointment_date;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public LocalDate getReport_date() {
        return report_date;
    }

    public void setReport_date(LocalDate report_date) {
        this.report_date = report_date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
   
    
    
    
    
    
}
