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
public class Testdto {
       private String test_type; 
       private LocalDate test_date;
       private String test_results;
       private String test_status;
       private String testtechnical_id;
       private String comments;
       private LocalDateTime created_at;
       private String  created_by;
       private LocalDateTime updated_at;
       private String  updated_by;

    public Testdto(String test_type, LocalDate test_date, String test_results, String test_status, String testtechnical_id, String comments, LocalDateTime created_at, String created_by, LocalDateTime updated_at, String updated_by) {
        this.test_type = test_type;
        this.test_date = test_date;
        this.test_results = test_results;
        this.test_status = test_status;
        this.testtechnical_id = testtechnical_id;
        this.comments = comments;
        this.created_at = created_at;
        this.created_by = created_by;
        this.updated_at = updated_at;
        this.updated_by = updated_by;
    }

    public Testdto() {
    }

    public String getTest_type() {
        return test_type;
    }

    public void setTest_type(String test_type) {
        this.test_type = test_type;
    }

    public LocalDate getTest_date() {
        return test_date;
    }

    public void setTest_date(LocalDate test_date) {
        this.test_date = test_date;
    }

    public String getTest_results() {
        return test_results;
    }

    public void setTest_results(String test_results) {
        this.test_results = test_results;
    }

    public String getTest_status() {
        return test_status;
    }

    public void setTest_status(String test_status) {
        this.test_status = test_status;
    }

    public String getTesttechnical_id() {
        return testtechnical_id;
    }

    public void setTesttechnical_id(String testtechnical_id) {
        this.testtechnical_id = testtechnical_id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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
