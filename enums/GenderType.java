/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author ACER
 */
public enum GenderType {
    MALE(1),
    FEMALE(2);

    private final int state;

    GenderType(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
}
