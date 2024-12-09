/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.shelter;

import model.ShelterEnterprise.ShelterUpSkillDept.ShelterTrainerProfile;
import model.csr.Opportunity;
import java.util.ArrayList;

/**
 *
 * @author sritonya
 */
public class TrainingModuleDirectory {
    ArrayList<TrainingModule> trainingModuleList;

    public TrainingModuleDirectory() {
        this.trainingModuleList = new ArrayList<TrainingModule>();
    }

    public ArrayList<TrainingModule> getTrainingModuleList() {
        return trainingModuleList;
    }
    
    public TrainingModule createTrainingModule(ShelterTrainerProfile trainingInstructor, Opportunity opportunity){
        TrainingModule newTrainingModule = new TrainingModule(trainingInstructor, opportunity);
        trainingModuleList.add(newTrainingModule);
        return newTrainingModule;
    }
    
    public void addTrainingModule(TrainingModule trainingModule){
        trainingModuleList.add(trainingModule);
    }
    
}
