/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Patient;

import model.ShelterEnterprise.ShelterNurseStation.ShelterNurseProfile;
import java.util.ArrayList;

/**
 *
 * @author Monisha Narendran
 */
public class NurseVisitDirectory {
    ArrayList<NurseVisit> nurseVisitList;

    public NurseVisitDirectory() {
        this.nurseVisitList = new ArrayList<NurseVisit>();
    }

    public ArrayList<NurseVisit> getNurseVisitList() {
        return nurseVisitList;
    }
    
    public NurseVisit createNurseVisit(ShelterNurseProfile nurseProfile){
        NurseVisit nurseVisit = new NurseVisit(nurseProfile);
        nurseVisitList.add(nurseVisit);
        return nurseVisit;
    }  
    
    public void addNurseVisit(NurseVisit nurseVisit){
        nurseVisitList.add(nurseVisit);
    }
}
