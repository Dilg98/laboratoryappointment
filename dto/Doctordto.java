/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import enums.GenderType;
import enums.LocalDateTime;
import java.time.LocalDate;
//import java.time.LocalDateTime;

/**
 *
 * @author ACER
 */
public class Doctordto {
        
        private String firstname;
        private String lastname;
        private GenderType gender;
        private LocalDate dateofbirth;
        private int contact_number;
        private String email_address;      
        private String specialization;      
        private String mediacal_license;      
        private String hospital_affiliation;      
        private double workinghours;       
        private double appointment_fee;      
        private int consultation_room;      
        private String availability;       
        private LocalDateTime created_at;
        private String created_by;
        private LocalDateTime updated_at;
        private String updated_by;

    public Doctordto(String firstname, String lastname, GenderType gender, LocalDate dateofbirth, int contact_number, String email_address, String specialization, String mediacal_license, String hospital_affiliation, double workinghours, double appointment_fee, int consultation_room, String availability, LocalDateTime created_at, String created_by, LocalDateTime updated_at, String updated_by) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
        this.contact_number = contact_number;
        this.email_address = email_address;
        this.specialization = specialization;
        this.mediacal_license = mediacal_license;
        this.hospital_affiliation = hospital_affiliation;
        this.workinghours = workinghours;
        this.appointment_fee = appointment_fee;
        this.consultation_room = consultation_room;
        this.availability = availability;
        this.created_at = created_at;
        this.created_by = created_by;
        this.updated_at = updated_at;
        this.updated_by = updated_by;
    }

    public Doctordto() {
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getMediacal_license() {
        return mediacal_license;
    }

    public void setMediacal_license(String mediacal_license) {
        this.mediacal_license = mediacal_license;
    }

    public String getHospital_affiliation() {
        return hospital_affiliation;
    }

    public void setHospital_affiliation(String hospital_affiliation) {
        this.hospital_affiliation = hospital_affiliation;
    }

    public double getWorkinghours() {
        return workinghours;
    }

    public void setWorkinghours(double workinghours) {
        this.workinghours = workinghours;
    }

    public double getAppointment_fee() {
        return appointment_fee;
    }

    public void setAppointment_fee(double appointment_fee) {
        this.appointment_fee = appointment_fee;
    }

    public int getConsultation_room() {
        return consultation_room;
    }

    public void setConsultation_room(int consultation_room) {
        this.consultation_room = consultation_room;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
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

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }

        
        
   
        
 
        
        
}
