/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ClinicEnterprise.ClinicAdministration;

import model.person.Person;
import model.profile.Profile;
import model.profile.UserRole;

/**
 *
 * @author Monisha Narendran
 */
public class ClinicStaffProfile extends Profile {

    public ClinicStaffProfile(Person p) {
        super(p);
    }

    @Override
    public UserRole getRole() {
        return UserRole.CLINIC_STAFF;
    }
    
}
