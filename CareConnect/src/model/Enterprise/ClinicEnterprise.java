/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.Organization.Organization;
import model.profile.UserRole;

/**
 *
 * @author Monisha Narendran
 */
public class ClinicEnterprise extends Enterprise {
    
    public ClinicEnterprise() {
        super(Enterprise.Type.CLINIC.getValue());
    }
    
    @Override
    public Organization getOrganizationGivenRole(UserRole role) {
        for(Organization organization : this.getOrganizationCatalog().getOrganizationList()){
            if(role == UserRole.CLINIC_STAFF && organization.getName() == Organization.Type.CLINIC_ADMINISTRATION.getValue()){
                return organization;
            }
            else if(role == UserRole.CLINIC_DOCTOR && organization.getName() == Organization.Type.CLINIC_DOCTOR_DEPT.getValue()){
                return organization;
            }
        }
        return null; //return null if not found       
    }
    
}
