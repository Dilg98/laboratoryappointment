/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import enums.GenderType;
import enums.LocalDateTime;
import java.time.LocalDate;

/**
 *
 * @author ACER
 */
public class Patientdto {
    
        private String firstname;
        private String lastname;
        private GenderType gender;
        private LocalDate dateofbirth;
        private String address;
        private int contact_number;
        private String email_address;      
        private String mediacal_history;      
        private String insurance_information;      
        private double emergancycontact;      
        private int registration_date;      
        private String registration_status;       
        private LocalDateTime created_at;
        private String created_by;
        private LocalDateTime update_dat;
        private String updated_by;

    public Patientdto(String firstname, String lastname, GenderType gender, LocalDate dateofbirth, String address, int contact_number, String email_address, String mediacal_history, String insurance_information, double emergancycontact, int registration_date, String registration_status, LocalDateTime created_at, String created_by, LocalDateTime update_dat, String updated_by) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
        this.address = address;
        this.contact_number = contact_number;
        this.email_address = email_address;
        this.mediacal_history = mediacal_history;
        this.insurance_information = insurance_information;
        this.emergancycontact = emergancycontact;
        this.registration_date = registration_date;
        this.registration_status = registration_status;
        this.created_at = created_at;
        this.created_by = created_by;
        this.update_dat = update_dat;
        this.updated_by = updated_by;
    }

    public Patientdto() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact_number() {
        return contact_number;
    }

    public void setContact_number(int contact_number) {
        this.contact_number = contact_number;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getMediacal_history() {
        return mediacal_history;
    }

    public void setMediacal_history(String mediacal_history) {
        this.mediacal_history = mediacal_history;
    }

    public String getInsurance_information() {
        return insurance_information;
    }

    public void setInsurance_information(String insurance_information) {
        this.insurance_information = insurance_information;
    }

    public double getEmergancycontact() {
        return emergancycontact;
    }

    public void setEmergancycontact(double emergancycontact) {
        this.emergancycontact = emergancycontact;
    }

    public int getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(int registration_date) {
        this.registration_date = registration_date;
    }

    public String getRegistration_status() {
        return registration_status;
    }

    public void setRegistration_status(String registration_status) {
        this.registration_status = registration_status;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public LocalDateTime getUpdate_dat() {
        return update_dat;
    }

    public void setUpdate_dat(LocalDateTime update_dat) {
        this.update_dat = update_dat;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }

        
        
        
        
        
        
        
}