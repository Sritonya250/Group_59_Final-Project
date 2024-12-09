/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.NGOEnterprise.NGOVolunteer;

import model.Patient.PatientDirectory;
import model.Patient.PatientProfile;
import model.person.Person;
import model.profile.Profile;
import model.profile.UserRole;
import utils.Neighbourhood;

/**
 *
 * @author tbhar
 */
public class NGOVolunteerProfile extends Profile {

    //Assigned by NGO Supervisor
    Neighbourhood assignedNeighbourhood;
    
    //Patients he has onboarded on the platform
    PatientDirectory patientOnboardedList;
    
    public NGOVolunteerProfile(Person p) {
        super(p);
        this.patientOnboardedList = new PatientDirectory();
    }

    public Neighbourhood getAssignedNeighbourhood() {
        return assignedNeighbourhood;
    }

    public void setAssignedNeighbourhood(Neighbourhood assignedNeighbourhood) {
        this.assignedNeighbourhood = assignedNeighbourhood;
    }

    public PatientDirectory getPatientOnboardedList() {
        return patientOnboardedList;
    }

    public void assignPatient(PatientProfile patient){
        this.patientOnboardedList.addPatient(patient);
    }
    
    @Override
    public UserRole getRole() {
        return UserRole.NGO_VOLUNTEER;
    }
    
    @Override
    public String toString() {
        return this.getPerson().getFirstName();
    }
    
}
