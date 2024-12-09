/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.CSREnterprise.CSRAdministration.CSRAdminProfile;
import model.CSREnterprise.CSREmployer.CSREmployerProfile;
import model.ClinicEnterprise.ClinicAdministration.ClinicStaffProfile;
import model.Enterprise.Enterprise;
import model.Enterprise.EnterpriseCatalog;
import model.NGOEnterprise.NGOAdministration.NGOSupervisorProfile;
import model.NGOEnterprise.NGOVolunteer.NGOVolunteerProfile;
import model.Organization.Organization;
import model.Patient.PatientDirectory;
import model.Patient.PatientProfile;
import model.ShelterEnterprise.ShelterAdministration.ShelterSupervisorProfile;
import model.ShelterEnterprise.ShelterNurseStation.ShelterNurseProfile;
import model.ClinicEnterprise.ClinicDoctor.ClinicDoctorProfile;
import model.ShelterEnterprise.ShelterUpSkillDept.ShelterTrainerProfile;
import model.person.Ethnicity;
import model.person.Gender;
import model.person.Person;
import model.profile.UserRole;
import model.shelter.NurseStation;
import model.userAccounts.UserAccount;
import model.userAccounts.UserAccountDirectory;
import utils.DoctorSpecalization;
import utils.Neighbourhood;

/**
 *
 * @author Monisha Narendran
 */
public class Model {
    String name;
    UserAccountDirectory masterPatientList;
    EnterpriseCatalog enterpriseCatalog;

    public Model(String name) {
        this.name = name;
        initializeModel();
    }
    
    public void initializeModel(){
        //Initialize
        this.masterPatientList = new UserAccountDirectory();
        this.enterpriseCatalog = new EnterpriseCatalog();
        
        //Create Enterprises
        Enterprise ngo = enterpriseCatalog.createEnterprise(Enterprise.Type.NGO);
        Enterprise shelter = enterpriseCatalog.createEnterprise(Enterprise.Type.SHELTER);
        Enterprise clinic = enterpriseCatalog.createEnterprise(Enterprise.Type.CLINIC);
        Enterprise csr = enterpriseCatalog.createEnterprise(Enterprise.Type.CSR);
        
        //Create Organizations under the corresponding Enterprises
        Organization ngoAdministration = ngo.getOrganizationCatalog().createOrganization(Organization.Type.NGO_ADMINISTRATION);
        Organization ngoVolunteer = ngo.getOrganizationCatalog().createOrganization(Organization.Type.NGO_VOLUNTEER_DEPT);
        
        Organization shelterAdministration = shelter.getOrganizationCatalog().createOrganization(Organization.Type.SHELTER_ADMINISTRATION);
        Organization shelterNurseStationNorth = shelter.getOrganizationCatalog().createOrganization(Organization.Type.SHELTER_NURSE_STATION);
        Organization shelterUpSkill = shelter.getOrganizationCatalog().createOrganization(Organization.Type.SHELTER_UP_SKILL_DEPT);
        
        Organization clinicAdministration = clinic.getOrganizationCatalog().createOrganization(Organization.Type.CLINIC_ADMINISTRATION);
        Organization clinicDoctors = clinic.getOrganizationCatalog().createOrganization(Organization.Type.CLINIC_DOCTOR_DEPT);
        
        Organization csrAdministration = csr.getOrganizationCatalog().createOrganization(Organization.Type.CSR_ADMINISTRATION);
        Organization csrEmployerDept = csr.getOrganizationCatalog().createOrganization(Organization.Type.CSR_EMPLOYER_DEPT);
        
        //Add the valid roles under each enterprise
        ngo.getValidUserRoleList().addUserRole(UserRole.NGO_SUPERVISOR);
        ngo.getValidUserRoleList().addUserRole(UserRole.NGO_VOLUNTEER);
        
        shelter.getValidUserRoleList().addUserRole(UserRole.SHELTER_SUPERVISOR);
        shelter.getValidUserRoleList().addUserRole(UserRole.SHELTER_NURSE);
        shelter.getValidUserRoleList().addUserRole(UserRole.SHELTER_TRAINER);
        
        clinic.getValidUserRoleList().addUserRole(UserRole.CLINIC_STAFF);
        clinic.getValidUserRoleList().addUserRole(UserRole.CLINIC_DOCTOR);
        
        csr.getValidUserRoleList().addUserRole(UserRole.CSR_ADMIN);
        csr.getValidUserRoleList().addUserRole(UserRole.CSR_EMPLOYER);
        
        //create the admins under each enterprise
        
        //NGO_Administrator
        Person p1 = new Person();
        p1.setFirstName("Arun");
        p1.setLastName("Kumar");
        p1.setGender(Gender.MALE);
        p1.setEthnicity(Ethnicity.ASIAN);
        p1.setAge(23);
        p1.setPhoneNum("9838466759");
        p1.setEmail("arun.kumar@gmail.com");
        p1.setAddress("344, Mass Ave");
        
        NGOSupervisorProfile ngoSupervisor = new NGOSupervisorProfile(p1);
        
        ngoAdministration.getOrganizationUserDirectory().createUserAccount(ngoSupervisor, "kumar", "ak24$", true);
        
         Person p7 = new Person();
        p7.setFirstName("Lokesh");
        p7.setLastName("Dev");
        p7.setGender(Gender.MALE);
        p7.setEthnicity(Ethnicity.ASIAN);
        p7.setAge(29);
        p7.setPhoneNum("7652431789");
        p7.setEmail("lokesh.dev@gmail.com");
        p7.setAddress("499, Rox Ave");
        
        NGOSupervisorProfile ngoSupervisor1 = new NGOSupervisorProfile(p7);
        
        ngoAdministration.getOrganizationUserDirectory().createUserAccount(ngoSupervisor1, "dev", "lv24$", true);
        
        //Shelter_Administrator
        Person p2 = new Person();
        p2.setFirstName("Swetha");
        p2.setLastName("Murugan");
        p2.setGender(Gender.FEMALE);
        p2.setEthnicity(Ethnicity.ASIAN);
        p2.setAge(23);
        p2.setPhoneNum("8979765432");
        p2.setEmail("swetha.murugan@gmail.com");
        p2.setAddress("150, Mass Ave");
        
        ShelterSupervisorProfile shelterSupervisor = new ShelterSupervisorProfile(p2);
        
        shelterAdministration.getOrganizationUserDirectory().createUserAccount(shelterSupervisor, "murugan", "sv24$", true);
        
        //Clinic_Staff
//        Person p3 = new Person();
//        p3.setFirstName("Anne");
//        p3.setLastName("Jane");
//        p3.setGender(Gender.PREFER_NOT_TO_SAY);
//        p3.setEthnicity(Ethnicity.NATIVE_AMERICAN);
//        p3.setAge(23);
//        p3.setPhoneNum(8573977239L);
//        p3.setEmail("jane.anne@gmail.com");
//        p3.setAddress("150, Mass Ave");
//        
//        ClinicStaffProfile clinicStaff = new ClinicStaffProfile(p3);
//        
//        UserAccount clinicStaffUser = ecosystemUserAccountDirectory.createUserAccount(clinicStaff, "jane", "pass@1", true);
        
        //CSR_Admin
        Person p4 = new Person();
        p4.setFirstName("Tonya");
        p4.setLastName("Lakshmi");
        p4.setGender(Gender.FEMALE);
        p4.setEthnicity(Ethnicity.WHITE_CAUCASIAN);
        p4.setAge(23);
        p4.setPhoneNum("9087657689");
        p4.setEmail("tonya.lakshmi@gmail.com");
        p4.setAddress("190, Mass Ave");
        
        CSRAdminProfile csrAdmin = new CSRAdminProfile(p4);
                
        csrAdministration.getOrganizationUserDirectory().createUserAccount(csrAdmin, "lakshmi", "tl24$", true);
        
        //Delete these user after testing
        //NGO Volunteer 1
        Person p5 = new Person();
        p5.setFirstName("Mannu");
        p5.setLastName("Shinde");
        p5.setGender(Gender.MALE);
        p5.setEthnicity(Ethnicity.HISPANIC_LATINO);
        p5.setAge(25);
        p5.setPhoneNum("7654892063");
        p5.setEmail("mannu.shinde@gmail.com");
        p5.setAddress("121, Mass Ave");
        
        NGOVolunteerProfile patient = new NGOVolunteerProfile(p5);
        patient.setAssignedNeighbourhood(Neighbourhood.ALLSTON_BRIGHTON);
        
        UserAccount ngoVolunteerUser = ngoVolunteer.getOrganizationUserDirectory().createUserAccount(patient, "shinde", "ms24$", true);
        
        Person p6 = new Person();
        p6.setFirstName("Testing");
        p6.setLastName("Volunteer");
        p6.setGender(Gender.FEMALE);
        p6.setEthnicity(Ethnicity.MIDDLE_EASTERN_NORTH_AFRICAN);
        p6.setAge(19);
        p6.setPhoneNum("8910203");
        p6.setEmail("testing.volunteer@gmail.com");
        p6.setAddress("310, Mass Ave");
        
        NGOVolunteerProfile volunteer = new NGOVolunteerProfile(p6);
//        volunteer.setAssignedNeighbourhood(Neighbourhood.CHARLESTOWN);
        
        UserAccount ngoVolunteerUser2 = ngoVolunteer.getOrganizationUserDirectory().createUserAccount(volunteer, "testing", "pass@1", true);
        
        Person p8 = new Person();
        p8.setFirstName("nurse fnmae");
        p8.setLastName("lname nurse");
        p8.setGender(Gender.FEMALE);
        p8.setEthnicity(Ethnicity.MIDDLE_EASTERN_NORTH_AFRICAN);
        p8.setAge(19);
        p8.setPhoneNum("8910203");
        p8.setEmail("testing.volunteer@gmail.com");
        p8.setAddress("310, Mass Ave");
        
        ShelterNurseProfile nurse1 = new ShelterNurseProfile(p8);
        nurse1.setAssignedNurseStation(NurseStation.WEST);
//        volunteer.setAssignedNeighbourhood(Neighbourhood.CHARLESTOWN);
        
        UserAccount nurseUser1 = shelterNurseStationNorth.getOrganizationUserDirectory().createUserAccount(nurse1, "nurse1", "pass@1", true);
        
        Person p9 = new Person();
        p9.setFirstName("nurse fnmae2");
        p9.setLastName("lname nurse2");
        p9.setGender(Gender.FEMALE);
        p9.setEthnicity(Ethnicity.MIDDLE_EASTERN_NORTH_AFRICAN);
        p9.setAge(29);
        p9.setPhoneNum("8910203");
        p9.setEmail("testing.volunteer@gmail.com");
        p9.setAddress("310, Mass Ave");
        
        ShelterNurseProfile nurse2 = new ShelterNurseProfile(p9);
        nurse2.setAssignedNurseStation(NurseStation.NORTH);
//        volunteer.setAssignedNeighbourhood(Neighbourhood.CHARLESTOWN);
        
        UserAccount nurseUser2 = shelterNurseStationNorth.getOrganizationUserDirectory().createUserAccount(nurse2, "nurse2", "pass@1", true);
        
        Person p10 = new Person();
        p10.setFirstName("Clinic Staff");
        p10.setLastName("John");
        p10.setGender(Gender.FEMALE);
        p10.setEthnicity(Ethnicity.MIDDLE_EASTERN_NORTH_AFRICAN);
        p10.setAge(29);
        p10.setPhoneNum("8910203");
        p10.setEmail("staff.volunteer@gmail.com");
        p10.setAddress("310, Mass Ave");
        
        ClinicStaffProfile staff1 = new ClinicStaffProfile(p10);
        
        UserAccount staffUser = clinicAdministration.getOrganizationUserDirectory().createUserAccount(staff1, "staff1", "pass@1", true);
        
          Person p11 = new Person();
        p11.setFirstName("Doc Sri");
        p11.setLastName("Kumar");
        p1.setGender(Gender.MALE);
        p11.setEthnicity(Ethnicity.MIDDLE_EASTERN_NORTH_AFRICAN);
        p11.setAge(29);
        p11.setPhoneNum("9876543216");
        p11.setEmail("doc.volunteer@gmail.com");
        p11.setAddress("290, Hunt Ave");
        
        ClinicDoctorProfile doc1 = new ClinicDoctorProfile(p11);
        doc1.setSpecalization(DoctorSpecalization.PEDIATRICIAN);
        
        UserAccount docUser1 = clinicDoctors.getOrganizationUserDirectory().createUserAccount(doc1, "doc1", "pass@1", true);
        
         Person p12 = new Person();
        p12.setFirstName("Doctor Radha");
        p12.setLastName("Krishnan");
        p12.setGender(Gender.FEMALE);
        p12.setEthnicity(Ethnicity.MIDDLE_EASTERN_NORTH_AFRICAN);
        p12.setAge(22);
        p12.setPhoneNum("9876543216");
        p12.setEmail("doc2.volunteer@gmail.com");
        p12.setAddress("Good Shepard Ave");
        
        ClinicDoctorProfile doc2 = new ClinicDoctorProfile(p12);
        doc2.setSpecalization(DoctorSpecalization.ENDOCRINOLOGIST);
        
        UserAccount docUser2 = clinicDoctors.getOrganizationUserDirectory().createUserAccount(doc2, "doc2", "pass@1", true);
        
        //Create CSR Employer
        Person p13 = new Person();
        p13.setFirstName("csr emp fname");
        p13.setLastName("csr emp lname");
        p13.setGender(Gender.FEMALE);
        p13.setEthnicity(Ethnicity.MIDDLE_EASTERN_NORTH_AFRICAN);
        p13.setAge(29);
        p13.setPhoneNum("(111) 111-1111");
        p13.setEmail("testing.csrEmp@gmail.com");
        p13.setAddress("310, Mass Ave");
        
        CSREmployerProfile csrEmployer = new CSREmployerProfile(p13);
        
        UserAccount csrEmployerUser = csrEmployerDept.getOrganizationUserDirectory().createUserAccount(csrEmployer, "csrEmp", "pass@1", true);

    }

    public String getName() {
        return name;
    }

    public UserAccountDirectory getMasterPatientList() {
        return masterPatientList;
    }

    public EnterpriseCatalog getEnterpriseCatalog() {
        return enterpriseCatalog;
    }
    
    public boolean isExistingUserByUserName(String userName) {
        UserAccount userAccount = null;
        
        //Checking if present in Patient Directory
        userAccount = this.masterPatientList.findUserAccountByUserName(userName);
        
        //In not found in Patient Directory, checking if present in Organization User Directory
        if(userAccount == null){
            for(Enterprise enterprise: this.enterpriseCatalog.getEnterpriseList()){
                for(Organization organization: enterprise.getOrganizationCatalog().getOrganizationList()){
                    userAccount = organization.getOrganizationUserDirectory().findUserAccountByUserName(userName);
//                    System.out.println("UserAccount for " + organization.getName() + " : " + userAccount);
                    if(userAccount != null){
                        break;
                    }

                }
                if(userAccount != null){
                    break;
                }
            }
        }
        
        //Returning decision
        if(userAccount == null){
            return false;
        }
        else {
            return true;
        }
    
    }
    
    
    
}
