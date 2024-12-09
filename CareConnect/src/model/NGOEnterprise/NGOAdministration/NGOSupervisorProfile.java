/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.NGOEnterprise.NGOAdministration;

import model.person.Person;
import model.profile.Profile;
import model.profile.UserRole;

/**
 *
 * @author tbhar
 */
public class NGOSupervisorProfile extends Profile {

    public NGOSupervisorProfile(Person p) {
        super(p);
    }

    @Override
    public UserRole getRole() {
        return UserRole.NGO_SUPERVISOR;
    }
    
}
