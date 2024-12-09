/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ShelterEnterprise.ShelterAdministration;

import model.person.Person;
import model.profile.Profile;
import model.profile.UserRole;

/**
 *
 * @author sritonya
 */
public class ShelterSupervisorProfile extends Profile {

    public ShelterSupervisorProfile(Person p) {
        super(p);
    }

    @Override
    public UserRole getRole() {
        return UserRole.SHELTER_SUPERVISOR;
    }
    
}
