/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import enums.BigDecimal;
import enums.LocalDateTime;

import java.time.LocalDate;

/**
 *
 * @author ACER
 */
public class Paymentdto {
     private LocalDate payment_date;
     private String amount;
     private String payment_method;
     private String transaction_id;
     private String status;
     private BigDecimal currency;
     private String description;
     private LocalDateTime created_at;
     private String created_by;
     private LocalDateTime updated_at;
     private String updated_by;

    public Paymentdto(LocalDate payment_date, String amount, String payment_method, String transaction_id, String status, BigDecimal currency, String description, LocalDateTime created_at, String created_by, LocalDateTime updated_at, String updated_by) {
        this.payment_date = payment_date;
        this.amount = amount;
        this.payment_method = payment_method;
        this.transaction_id = transaction_id;
        this.status = status;
        this.currency = currency;
        this.description = description;
        this.created_at = created_at;
        this.created_by = created_by;
        this.updated_at = updated_at;
        this.updated_by = updated_by;
    }

    public Paymentdto() {
    }

    public LocalDate getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(LocalDate payment_date) {
        this.payment_date = payment_date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getCurrency() {
        return currency;
    }

    public void setCurrency(BigDecimal currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
