/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model.shelter;

/**
 *
 * @author sritonya
 */
public enum EnrollmentStatus {
    IN_PROGRESS("In Progress"),
    COMPLETED("Completed");

    private final String value;

    EnrollmentStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
