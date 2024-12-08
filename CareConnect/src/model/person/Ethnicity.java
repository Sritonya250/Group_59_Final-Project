/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.person;

/**
 *
 * @author sritonya
 */
public class Ethnicity {
    AFRICAN_AMERICAN("African American"),
    ASIAN("Asian"),
    HISPANIC_LATINO("Hispanic or Latino"),
    NATIVE_AMERICAN("Native American or Alaska Native"),
    WHITE_CAUCASIAN("White or Caucasian"),
    MIDDLE_EASTERN_NORTH_AFRICAN("Middle Eastern or North African"),
    PACIFIC_ISLANDER("Pacific Islander"),
    BIRACIAL_MULTIRACIAL("Biracial/Multiracial"),
    OTHER("Other");

    private final String label;

    Ethnicity(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
