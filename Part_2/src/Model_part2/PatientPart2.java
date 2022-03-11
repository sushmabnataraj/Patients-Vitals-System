/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_part2;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author sushm
 */
public class PatientPart2 {
    
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private VitalSignsHistory vitalSignsHistory;

    public PatientPart2(String name) {
        this.name = name;
        this.vitalSignsHistory = new VitalSignsHistory();
    }
    
    public VitalSignsHistory getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(VitalSignsHistory vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }
    
    private PatientData patientData;
                                       //MainFunction starts from here
    public static void main(String[] args) {
        PatientPart2 pp = new PatientPart2();
        pp.build();
    }
    
    
    // pCondition asks user to input the options 
    public static void pConditions() {                       
        System.out.println("\nSelect from below options: ");
        System.out.println("\t 1 - Add new record. ");
        System.out.println("\t 2 - Display all records. ");
        System.out.println("\t 3 - Check Status of Vital Signs. ");
        System.out.println("\t 4 - Exit");
    }

    // build() is called to display the user input data
    private void build() {
        Scanner scanObj = new Scanner(System.in);

        boolean exit = false;
        int choiceNum = 0;

        System.out.println("Welcome to Vital Signs Portal");

        pConditions();

        while (!exit) {
            System.out.println("\nPlease enter any one of the above options : ");
            choiceNum = scanObj.nextInt();
            scanObj.nextLine();

            switch (choiceNum) {
                case 1:
                    addVSigns();
                    pConditions();
                    break;
                case 2:
                    displayRecords();
                    pConditions();
                    break;
                case 3:
                    isThisVitalSignNormal();
                    pConditions();
                    break;
                case 4:
                    System.out.println("\nStay healthy and fit.. Thank you for visiting..");
                    exit = true;
                    break;
            }
        }

    }
    
    
    // Allocated the specific memeory location to patientPart2 class
    public PatientPart2() {
        this.patientData = new PatientData();
    }
    
    
    
    // addVsigns ask user to input the Vital Signs of patient
    public void addVSigns() {
        
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter patient's Name: ");

        String patientName = scanObj.nextLine();

        PatientPart2 patientPart2 = this.patientData.getPatientPart2(patientName);

        System.out.println("\nMake sure you enter 0 for new born and for Infants as 1.");
        System.out.println("\nMention the Age: ");

        int ageGroup = scanObj.nextInt();

        System.out.println("Enter Respiratory Rate: ");
        int respiratoryRate = scanObj.nextInt();

        System.out.println("Enter Heart Rate: ");
        int heartRate = scanObj.nextInt();

        System.out.println("Enter Blood Pressure: ");
        int sysBloodPressure = scanObj.nextInt();

        System.out.println("Enter Weight in Kgs: ");
        double weightInKgs = scanObj.nextDouble();

        patientPart2.addNewVitalSign(ageGroup, respiratoryRate, heartRate, sysBloodPressure, weightInKgs);

        System.out.println("\nYou have succesfully entered the vital signs ");

    }
    
    
    // addNewVitalSign adds new to record to existing lists or to add new one to it
    public void addNewVitalSign(int ageGroup, int respiratoryRate, int heartRate, int sysBloodPressure, double weightInKgs) {
        for (int i = 0; i < this.vitalSignsHistory.getVitalSignsHistory().size(); i++) {
            VitalSignsPart2 vsign = this.vitalSignsHistory.getVitalSignsHistory().get(i);
            if (vsign.getIsIsRecent()) {
                vsign.setIsRecent(false);
            }
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        VitalSignsPart2 vitalSignPart2 = new VitalSignsPart2();
        vitalSignPart2.setAgeGroup(ageGroup);
        vitalSignPart2.setRespiratoryRate(respiratoryRate);
        vitalSignPart2.setHeartRate(heartRate);
        vitalSignPart2.setSysBloodPressure(sysBloodPressure);
        vitalSignPart2.setWeightInKgs(weightInKgs);
        vitalSignPart2.setIsRecent(true);
        vitalSignPart2.setTimestamp(timestamp.toString());
        this.vitalSignsHistory.addVital(vitalSignPart2);
    }
    
    
    // displayrecords one praticular record asking full name
    private void displayRecords() {
        System.out.println("VitalSigns-History: ");
        for (PatientPart2 p : this.patientData.getPatientData()) {
            System.out.println("\nPatient Name: " + p.getName());
            p.displayVitalSignsHistory();
        }
    }

    // display and fetch all records from the Patients  data
    public void displayVitalSignsHistory() {

        for (int i = 0; i < this.vitalSignsHistory.getVitalSignsHistory().size(); i++) {
            VitalSignsPart2 vsign = this.vitalSignsHistory.getVitalSignsHistory().get(i);
            System.out.println("\n\nRecord " + (i + 1) + " : ");
            System.out.println("Timestamp: " + vsign.getTimestamp());
            System.out.println("Age: " + vsign.getAgeGroup());
            System.out.println("Respiratory Rate: " + vsign.getRespiratoryRate());
            System.out.println("Heart Rate: " + vsign.getHeartRate());
            System.out.println("Systolic Blood pressure: " + vsign.getSysBloodPressure());
            System.out.println("Weight In Kgs: " + vsign.getWeightInKgs());
        }
    }
    
    
    // Check whether patient is normal or abnormal
    
    private void isThisVitalSignNormal() {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Please Enter Patient's Name: ");

        String name = scanObj.nextLine();

        System.out.println("Please enter the attribute which you want to see: ");
        System.out.println("\nRespiratoryRate");
        System.out.println("HeartRate");
        System.out.println("SysBloodPressure");
        System.out.println("WeightInKgs");
//        System.out.println("\"All\"");

        String selectedOption = scanObj.nextLine();

        PatientPart2 p = this.patientData.getPatientPart2(name);

        boolean result = false;

        switch (selectedOption) {
            case "RespiratoryRate":
                result = p.isThisVitalSignNormal("RespiratoryRate");
                break;

            case "HeartRate":
                result = p.isThisVitalSignNormal("HeartRate");
                break;

            case "SysBloodPressure":
                result = p.isThisVitalSignNormal("SysBloodPressure");
                break;

            case "WeightInKgs":
                result = p.isThisVitalSignNormal("WeightInKgs");
                break;
                
//            case "All":
//                result = p.isThisVitalSignNormal("RespiratoryRate");
//                result = p.isThisVitalSignNormal("HeartRate");
//                result = p.isThisVitalSignNormal("BloodPressure");
//                result = p.isThisVitalSignNormal("WeightInKgs");
//                break;
        }

        if (result) {
            System.out.println("\nVital sign is normal");
        } else {
            System.out.println("\nVital sign is abnormal");
        }
    }

    public boolean isThisVitalSignNormal(String selectedVitalSignName) {
        for (VitalSignsPart2 vsign : this.vitalSignsHistory.getVitalSignsHistory()) {
            if (vsign.getIsIsRecent()) {
                return vsign.isThisVitalSignNormal(selectedVitalSignName);
            }
        }
        return false;
    }
        
}
