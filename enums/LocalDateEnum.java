/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author ACER
 */

import java.time.LocalDate;

public enum LocalDateEnum {
    DATE_1(LocalDate.of(2023, 12, 6)),
    DATE_2(LocalDate.of(2023, 12, 7)),
    DATE_3(LocalDate.of(2023, 12, 8));

    private final LocalDate date;

    LocalDateEnum(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}

    
    
    
    

