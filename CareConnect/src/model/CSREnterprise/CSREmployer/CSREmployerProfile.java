/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.CSREnterprise.CSREmployer;

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
public class CSREmployerProfile extends Profile{
    
    String license;

    public CSREmployerProfile(Person p) {
        super(p);
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public UserRole getRole() {
        return UserRole.CSR_EMPLOYER;
    }
    
}
