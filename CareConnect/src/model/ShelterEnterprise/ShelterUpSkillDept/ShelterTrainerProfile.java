/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ShelterEnterprise.ShelterUpSkillDept;

import model.person.Person;
import model.profile.Profile;
import model.profile.UserRole;
import model.shelter.TrainingModuleDirectory;

/**
 *
 * @author sritonya
 */
public class ShelterTrainerProfile extends Profile {
    
    TrainingModuleDirectory shelterTrainingModule;

    public ShelterTrainerProfile(Person p) {
        super(p);
        
        //Initialize
        shelterTrainingModule = new TrainingModuleDirectory();
    }

    @Override
    public UserRole getRole() {
        return UserRole.SHELTER_TRAINER;
    }

    public TrainingModuleDirectory getShelterTrainingModule() {
        return shelterTrainingModule;
    }
    
}
