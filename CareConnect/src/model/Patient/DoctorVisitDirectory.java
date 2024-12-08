/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Patient;

import model.ClinicEnterprise.ClinicDoctor.ClinicDoctorProfile;
import java.util.ArrayList;

/**
 *
 * @author Monisha Narendran
 */
public class DoctorVisitDirectory {
    private ArrayList<DoctorVisit> doctorVisitList;

    public DoctorVisitDirectory() {
        this.doctorVisitList = new ArrayList<DoctorVisit>();
    }
    
    public DoctorVisit createDoctorVisit(ClinicDoctorProfile doctorProfile){
        DoctorVisit doctorVisit = new DoctorVisit(doctorProfile);
        this.doctorVisitList.add(doctorVisit);
        return doctorVisit;
    }

    public ArrayList<DoctorVisit> getDoctorVisitList() {
        return doctorVisitList;
    }
    
    public void addDoctorVisit(DoctorVisit doctorVisit) {
        doctorVisitList.add(doctorVisit);
    }
}