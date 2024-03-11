/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author ACER
 */


import java.time.LocalDateTime;

public enum LocalDateTimeEnum {
    DATE_TIME_1(LocalDateTime.of(2023, 12, 6, 10, 30)),
    DATE_TIME_2(LocalDateTime.of(2023, 12, 7, 15, 45)),
    DATE_TIME_3(LocalDateTime.of(2023, 12, 8, 9, 0));

    private final LocalDateTime dateTime;

    LocalDateTimeEnum(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}




