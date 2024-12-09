/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.CSREnterprise.CSRAdministration;

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