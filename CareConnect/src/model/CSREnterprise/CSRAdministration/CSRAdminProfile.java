/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.CSREnterprise.CSRAdministration;

<<<<<<< HEAD
import model.person.Person;
import model.profile.Profile;
import model.profile.UserRole;
=======
import model.Profile.Profile;
import model.Profile.UserRole;
import model.person.Person;
>>>>>>> 36de84e22a5fdfd60b6022debe21717dd918fd97

/**
 *
 * @author tbhar
 */
public class CSRAdminProfile extends Profile {

    public CSRAdminProfile(Person p) {
        super(p);
    }

    @Override
    public UserRole getRole() {
        return UserRole.CSR_ADMIN;
    }
    
}
