/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model.shelter;

/**
 *
 * @author sritonya
 */
public enum Grade {
    A("Excellent"),
    B("Good"),
    C("Satisfactory"),
    D("Needs Improvement"),
    F("Fail");

    private final String description;

    Grade(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
