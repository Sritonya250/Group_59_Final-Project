/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.Enterprise.Enterprise;
import model.Enterprise.Enterprise.Type;
import model.Organization.Organization;
import model.profile.UserRole;
import java.util.ArrayList;

/**
 *
 * @author Monisha Narendran
 */
public class EnterpriseCatalog {
    ArrayList<Enterprise> enterpriseList;

    public EnterpriseCatalog() {
        this.enterpriseList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createEnterprise(Type type){
        Enterprise enterprise = null;
        
        if(type.getValue().equals(type.NGO.getValue())){
            enterprise = new NGOEnterprise();
            enterpriseList.add(enterprise);
        }
        else if(type.getValue().equals(type.SHELTER.getValue())){
            enterprise = new ShelterEnterprise();
            enterpriseList.add(enterprise);
        }
        else if(type.getValue().equals(type.CLINIC.getValue())){
            enterprise = new ClinicEnterprise();
            enterpriseList.add(enterprise);
        }
        else if(type.getValue().equals(type.CSR.getValue())){
            enterprise = new CSREnterprise();
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
        
    }
    
    public Enterprise getSupportedEnterpriseGivenRole(UserRole role){
        for(Enterprise enterprise: this.enterpriseList){
            if(enterprise.isSupportedUserRole(role)){
                return enterprise;
            }
        }
        return null;
    }
    
}
