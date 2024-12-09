/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

<<<<<<< HEAD
import model.Organization.Organization;
import model.csr.OpportunityDirectory;
import model.profile.UserRole;
=======
import model.Profile.UserRole;
import model.csr.OpportunityDirectory;
>>>>>>> 36de84e22a5fdfd60b6022debe21717dd918fd97

/**
 *
 * @author tbhar
 */
public class CSREnterprise extends Enterprise{
    
    OpportunityDirectory masterOpportunityCatalog;
    
    public CSREnterprise() {
        super(Enterprise.Type.CSR.getValue());
        this.masterOpportunityCatalog = new OpportunityDirectory();
    }
    
    @Override
    public Organization getOrganizationGivenRole(UserRole role) {
        for(Organization organization : this.getOrganizationCatalog().getOrganizationList()){
            if(role == UserRole.CSR_ADMIN && organization.getName() == Organization.Type.CSR_ADMINISTRATION.getValue()){
                return organization;
            }
            else if(role == UserRole.CSR_EMPLOYER && organization.getName() == Organization.Type.CSR_EMPLOYER_DEPT.getValue()){
                return organization;
            }
        }
        return null; //return null if not found       
    }

    public OpportunityDirectory getMasterOpportunityCatalog() {
        return masterOpportunityCatalog;
    }
    
}
