/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SignIn;

import ui.CSREnterprise.WorkArea.CSRAdmin.CSRAdminWorkArea;
import ui.CSREnterprise.WorkArea.CSREmployer.CSREmployerWorkArea;
import ui.ClinicEnterprise.WorkArea.ClinicDoctor.ClinicDoctorWorkArea;
import ui.ClinicEnterprise.WorkArea.ClinicStaff.ClinicStaffWorkArea;
import ui.NGOEnterprise.WorkArea.NGOAdmin.NGOAdminJPanel;
import ui.NGOEnterprise.WorkArea.NGOVolunteer.NGOVolunteerJPanel;
import ui.ShelterEnterprise.WorkArea.ShelterNurse.ShelterNurseWorkArea;
import ui.ShelterEnterprise.WorkArea.ShelterSupervisor.ShelterSupervisorWorkArea;
import ui.ShelterEnterprise.WorkArea.ShelterTrainer.ShelterTrainerWorkArea;
import ui.SignUp.SignUpJPanel;
import ui.WorkAreas.PatientRole.PatientWorkAreaJPanel;
import model.Model;
import model.CSREnterprise.CSRAdministration.CSRAdminProfile;
import model.CSREnterprise.CSREmployer.CSREmployerProfile;
import model.ClinicEnterprise.ClinicAdministration.ClinicStaffProfile;
import model.ClinicEnterprise.ClinicDoctor.ClinicDoctorProfile;
import model.Enterprise.CSREnterprise;
import model.Enterprise.ClinicEnterprise;
import model.Enterprise.Enterprise;
import model.Enterprise.NGOEnterprise;
import model.Enterprise.ShelterEnterprise;
import model.NGOEnterprise.NGOAdministration.NGOSupervisorProfile;
import model.NGOEnterprise.NGOVolunteer.NGOVolunteerProfile;
import model.Organization.CSRAdministrationOrganization;
import model.Organization.CSREmployerOrganization;
import model.Organization.ClinicAdministrationOrganization;
import model.Organization.ClinicDoctorOrganization;
import model.Organization.NGOAdministrationOrganization;
import model.Organization.NGOVolunteerOrganization;
import model.Organization.Organization;
import model.Organization.ShelterAdministrationOrganization;
import model.Organization.ShelterNurseStationOrganization;
import model.Organization.ShelterUpSkillOrganization;
import model.Patient.BloodGroup;
import model.Patient.Issue;
import model.Patient.PatientDirectory;
import model.Patient.PatientProfile;
import model.ShelterEnterprise.ShelterAdministration.ShelterSupervisorProfile;
import model.ShelterEnterprise.ShelterNurseStation.ShelterNurseProfile;
import model.ShelterEnterprise.ShelterUpSkillDept.ShelterTrainerProfile;
import model.person.Ethnicity;
import model.person.Gender;
import model.person.Person;
import model.profile.Profile;
import model.userAccounts.UserAccount;
import model.userAccounts.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import utils.ModelUtils;
import utils.Neighbourhood;

/**
 *
 * @author sritonya
 */
public class SignInJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignInJPanel
     */
    private Model model;
    private JPanel UserMainContainer;
    public SignInJPanel(JPanel UserMainContainer, Model model) {
        
        initComponents();
        
        this.UserMainContainer = UserMainContainer;
        this.model = model;
        
        populateInitialData();
    }
    
    public void populateInitialData(){
        UserAccountDirectory masterPatientList = model.getMasterPatientList();
        
        //Patient 1
        Person p = new Person();
        p.setFirstName("Patient 1");
        p.setLastName("John");
        p.setGender(Gender.FEMALE);
        p.setEthnicity(Ethnicity.ASIAN);
        p.setAge(19);
        p.setPhoneNum("1234567891");
        p.setEmail("smith.john@gmail.com");
        p.setAddress("150, Mass Ave");
        
        PatientProfile patient = new PatientProfile(p);
        
        //Need to create the NGO Volunteer, and then add the NGO volunteer who onboarded the patient
        patient.setNeighbourhood(Neighbourhood.FENWAY_KENMORE);
        patient.setPrimaryIssue(Issue.ANXIETY_DISORDERS);
        patient.setSecondaryIssue(Issue.DENTAL_PROBLEMS);
        patient.setBloodGroup(BloodGroup.O_NEGATIVE);
        
        UserAccount patientUser = masterPatientList.createUserAccount(patient, "smith", "pass@1", true); 
        
        Person p2 = new Person();
        p2.setFirstName("Patient 2");
        p2.setLastName("Varun");
        p2.setGender(Gender.MALE);
        p2.setEthnicity(Ethnicity.MIDDLE_EASTERN_NORTH_AFRICAN);
        p2.setAge(22);
        p2.setPhoneNum("1234567891");
        p2.setEmail("smith.john@gmail.com");
        p2.setAddress("150, Mass Ave");
        
        PatientProfile patient2 = new PatientProfile(p2);
        
        //Need to create the NGO Volunteer, and then add the NGO volunteer who onboarded the patient
        patient2.setNeighbourhood(Neighbourhood.BACK_BAY);
        patient2.setPrimaryIssue(Issue.DENTAL_PROBLEMS);
        patient2.setSecondaryIssue(Issue.DENTAL_PROBLEMS);
         patient2.setBloodGroup(BloodGroup.AB_POSITIVE);
        
        UserAccount patientUse2 = masterPatientList.createUserAccount(patient2, "smith", "pass@1", true); 
        
        Person p3 = new Person();
        p3.setFirstName("Patient 3");
        p3.setLastName("Cruise");
        p3.setGender(Gender.FEMALE);
        p3.setEthnicity(Ethnicity.NATIVE_AMERICAN);
        p3.setAge(44);
        p3.setPhoneNum("1234567891");
        p3.setEmail("mary.john@gmail.com");
        p3.setAddress("150, Mass Ave");
        
        PatientProfile patient3 = new PatientProfile(p3);
        
        //Need to create the NGO Volunteer, and then add the NGO volunteer who onboarded the patient
        patient3.setNeighbourhood(Neighbourhood.BACK_BAY);
        patient3.setPrimaryIssue(Issue.ANXIETY_DISORDERS);
        patient3.setSecondaryIssue(Issue.DISCRIMINATION_STIGMATIZATION);
        patient3.setBloodGroup(BloodGroup.B_POSITIVE);
        
        UserAccount patientUse3 = masterPatientList.createUserAccount(patient3, "smith", "pass@1", true); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPanelTitle = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnSignIn = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        txtUserNameField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        labelPanelTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        labelPanelTitle.setText("Welcome to Transformation Inc");

        labelUserName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        labelUserName.setText("User Name:");

        labelPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        labelPassword.setText("Password:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        txtUserNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSignIn)
                                .addGap(46, 46, 46)
                                .addComponent(btnSignUp)))
                        .addGap(51, 51, 51))
                    .addComponent(labelPanelTitle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(labelPanelTitle)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserName)
                    .addComponent(txtUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignIn)
                    .addComponent(btnSignUp))
                .addContainerGap(234, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:

        String userName = txtUserNameField.getText();
        String password = txtPassword.getText();

        if(userName.isBlank()) {
            JOptionPane.showMessageDialog(this, "UserName can't be empty");
            return;
        }

        if(password.isBlank()){
            JOptionPane.showMessageDialog(this, "Password can't be empty");
            return;
        }

        if(!ModelUtils.isValidPassword(password)) {
            JOptionPane.showMessageDialog(this, "Entered Password is not Valid!");
            return;
        }

        String encryptedPassword = ModelUtils.encryptPassword(password);

        if(encryptedPassword == null) {
            JOptionPane.showMessageDialog(this, "There was an error in encrypting the password");
            return;
        }

        UserAccount userAccount = null;
        Enterprise supportingEnterprise = null;
        Organization supportingOrganization = null;
        
        UserAccountDirectory uad = model.getMasterPatientList();
        userAccount = uad.AuthenticateUser(userName, password);
        
        if(userAccount == null){
            for(Enterprise enterprise: model.getEnterpriseCatalog().getEnterpriseList()){
                for(Organization organization: enterprise.getOrganizationCatalog().getOrganizationList()){
                    userAccount = organization.getOrganizationUserDirectory().AuthenticateUser(userName, password);
//                    System.out.println("UserAccount for " + organization.getName() + " : " + userAccount);
                    if(userAccount != null){
                        supportingEnterprise = enterprise;
                        supportingOrganization = organization;
                        break;
                    }

                }
                if(userAccount != null){
                    break;
                }
            }
        }
        
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentials: Invalid Credentials\nThe username or password you entered is incorrect.");
            return;
        }
        
        if(!userAccount.getIsUserEnabled()) {
            JOptionPane.showMessageDialog(null, "Your User Profile is not yet enabled, Please wait for Admin to process request!");
            return;
        }
               
        else {
            Profile profile = userAccount.getAssociatedProfile();

            if(profile instanceof PatientProfile) {
                PatientProfile patient = (PatientProfile) profile;
                PatientWorkAreaJPanel patientWorkArea = new PatientWorkAreaJPanel(UserMainContainer, model, patient, userAccount);
                UserMainContainer.add("PatientWorkArea", patientWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof NGOVolunteerProfile) {
                NGOVolunteerProfile ngoVolunteer = (NGOVolunteerProfile) profile;
                NGOVolunteerJPanel ngoVolunteerWorkArea = new NGOVolunteerJPanel(UserMainContainer, model, (NGOEnterprise) supportingEnterprise, (NGOVolunteerOrganization) supportingOrganization, ngoVolunteer, userAccount);
                UserMainContainer.add("NGOVolunteerWorkArea", ngoVolunteerWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof NGOSupervisorProfile) {
                NGOSupervisorProfile ngoSupervisor = (NGOSupervisorProfile) profile;
                NGOAdminJPanel ngoSupervisorWorkArea = new NGOAdminJPanel(UserMainContainer, model, (NGOEnterprise) supportingEnterprise, (NGOAdministrationOrganization) supportingOrganization, ngoSupervisor, userAccount);
                UserMainContainer.add("NGOSupervisorWorkArea", ngoSupervisorWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof ShelterSupervisorProfile) {
                ShelterSupervisorProfile shelterSupervisor = (ShelterSupervisorProfile) profile;
                ShelterSupervisorWorkArea shelterSupervisorWorkArea = new ShelterSupervisorWorkArea(UserMainContainer, model, (ShelterEnterprise) supportingEnterprise, (ShelterAdministrationOrganization) supportingOrganization, shelterSupervisor, userAccount);
                UserMainContainer.add("ShelterSupervisorWorkArea", shelterSupervisorWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof ShelterNurseProfile) {
                ShelterNurseProfile shelterNurse = (ShelterNurseProfile) profile;
                ShelterNurseWorkArea shelterNurseWorkArea = new ShelterNurseWorkArea(UserMainContainer, model, (ShelterEnterprise) supportingEnterprise, (ShelterNurseStationOrganization) supportingOrganization, shelterNurse, userAccount);
                UserMainContainer.add("ShelterNurseWorkArea", shelterNurseWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof ShelterTrainerProfile) {
                ShelterTrainerProfile shelterTrainer = (ShelterTrainerProfile) profile;
                ShelterTrainerWorkArea shelterTrainerWorkArea = new ShelterTrainerWorkArea(UserMainContainer, model, (ShelterEnterprise) supportingEnterprise, (ShelterUpSkillOrganization) supportingOrganization, shelterTrainer, userAccount);
                UserMainContainer.add("ShelterTrainerWorkArea", shelterTrainerWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof ClinicStaffProfile) {
                ClinicStaffProfile clinicStaff = (ClinicStaffProfile) profile;
                ClinicStaffWorkArea clinicStaffWorkArea = new ClinicStaffWorkArea(UserMainContainer, model, (ClinicEnterprise) supportingEnterprise, (ClinicAdministrationOrganization) supportingOrganization, clinicStaff, userAccount);
                UserMainContainer.add("ClinicStaffWorkArea", clinicStaffWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof ClinicDoctorProfile) {
                ClinicDoctorProfile clinicDoctor = (ClinicDoctorProfile) profile;
                ClinicDoctorWorkArea clinicDoctorWorkArea = new ClinicDoctorWorkArea(UserMainContainer, model, (ClinicEnterprise) supportingEnterprise, (ClinicDoctorOrganization) supportingOrganization, clinicDoctor, userAccount);
                UserMainContainer.add("ClinicDoctorWorkArea", clinicDoctorWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof CSRAdminProfile) {
                CSRAdminProfile csrAdmin = (CSRAdminProfile) profile;
                CSRAdminWorkArea csrAdminWorkArea = new CSRAdminWorkArea(UserMainContainer, model, (CSREnterprise) supportingEnterprise, (CSRAdministrationOrganization) supportingOrganization, csrAdmin, userAccount);
                UserMainContainer.add("CSRAdminWorkArea", csrAdminWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof CSREmployerProfile) {
                CSREmployerProfile csrEmployer = (CSREmployerProfile) profile;
                CSREmployerWorkArea csrEmployerWorkArea = new CSREmployerWorkArea(UserMainContainer, model, (CSREnterprise) supportingEnterprise, (CSREmployerOrganization) supportingOrganization, csrEmployer, userAccount);
                UserMainContainer.add("CSREmployerWorkArea", csrEmployerWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else{
                JOptionPane.showMessageDialog(null, "Selected wrong Role");
            }
        }

    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        SignUpJPanel signUpPanel = new SignUpJPanel(UserMainContainer, model);
        UserMainContainer.add("SignUpJPanel", signUpPanel);
        CardLayout layout = (CardLayout) UserMainContainer.getLayout();
        layout.next(UserMainContainer);
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void txtUserNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel labelPanelTitle;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserNameField;
    // End of variables declaration//GEN-END:variables
}
