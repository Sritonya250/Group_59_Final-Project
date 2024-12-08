/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ShelterEnterprise.ShelterNurseStation;

import java.util.ArrayList;

/**
 *
 * @author sritonya
 */
public class ShelterNurseDirectory {
    ArrayList<ShelterNurseProfile> nurseList;

    public ShelterNurseDirectory() {
        nurseList = new ArrayList<ShelterNurseProfile>();
    }
    
    public void addNurse(ShelterNurseProfile nurse){
        nurseList.add(nurse);
    }

    public ArrayList<ShelterNurseProfile> getNurseList() {
        return nurseList;
    }
    
}
