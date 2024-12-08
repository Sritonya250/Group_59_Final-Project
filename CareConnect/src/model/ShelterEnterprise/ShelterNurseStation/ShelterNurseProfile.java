/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ShelterEnterprise.ShelterNurseStation;

import model.Patient.PatientDirectory;
import model.Patient.PatientProfile;
import model.person.Person;
import model.profile.Profile;
import model.profile.UserRole;
import model.shelter.NurseStation;

/**
 *
 * @author sritonya
 */
public class ShelterNurseProfile extends Profile {
    
    NurseStation assignedNurseStation;
    PatientDirectory assignedPatientList;

    public ShelterNurseProfile(Person p) {
        super(p);
    }

    public NurseStation getAssignedNurseStation() {
        return assignedNurseStation;
    }

    public void setAssignedNurseStation(NurseStation assignedNurseStation) {
        this.assignedNurseStation = assignedNurseStation;
    }

    public PatientDirectory getAssignedPatientList() {
        return assignedPatientList;
    }

    public void setAssignedPatientList(PatientProfile assignedPatient) {
        this.assignedPatientList.addPatient(assignedPatient);
    }
    

    @Override
    public UserRole getRole() {
        return UserRole.SHELTER_NURSE;
    }
    
}
