/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enums;

/**
 *
 * @author ACER
 */
public class BigDecimal {

    private static BigDecimal valueOf(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static BigDecimal valueOf(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     public enum CurrencyType {
    USD(BigDecimal.valueOf(1)),
    EUR(BigDecimal.valueOf(0.84)),
    GBP(BigDecimal.valueOf(0.74));

    private final BigDecimal exchangeRate;

    CurrencyType(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }
         
 }
}