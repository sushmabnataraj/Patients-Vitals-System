/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import Model_part3.Encounter;
import Model_part3.PatientData;
import Model_part3.Patient;
import Model_part3.VitalSigns;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author sushm
 */
public class MainClass {
    
    //MainFunction starts from here
    public static void main(String[] args) {
        PatientData patientData = new PatientData();
        build(patientData);
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
    private static void build(PatientData patientData) {
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
                    addVSigns(patientData);
                    pConditions();
                    break;
                case 2:
                    displayRecords(patientData);
                    pConditions();
                    break;
                case 3:
                    isThisVitalSignNormal(patientData);
                    pConditions();
                    break;
                case 4:
                    System.out.println("\nStay healthy and fit.. Thank you for visiting..");
                    exit = true;
                    break;
            }
        }

    }
    
    
    // addVsigns ask user to input the Vital Signs of patient
    public static void addVSigns(PatientData patientData) {
        
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter patient's Name: ");

        String patientName = scanObj.nextLine();
        
        if (patientName.matches("[0-9]+") && patientName.length() > 2) {
            System.out.println("Please enter the Patient name using alphabets ");
            System.out.println("Please enter patient name correctly: ");
            patientName = scanObj.next();
        }

        Patient patient = patientData.getPatient(patientName);
                
        System.out.println("\nMake sure you enter 0 for new born and 1 for Infants.");
        System.out.println("\nMention the Age: ");
        int ageGroup;
        try{
            
            ageGroup = scanObj.nextInt();
        }
        catch(Exception exc){
             System.out.println("Mention the age in numerical values");
             scanObj.next();
             System.out.println("Enter correct age here:");
            ageGroup = scanObj.nextInt();
        }

        System.out.println("Enter Respiratory Rate: ");
//        int respiratoryRate = scanObj.nextInt();
        int respiratoryRate;
        try{
            
            respiratoryRate = scanObj.nextInt();
        }
        catch(Exception exc){
             System.out.println("Mention the Respiratory Rate in numerical values");
             scanObj.next();
             System.out.println("Enter correct Respiratory Rate here:");
             respiratoryRate = scanObj.nextInt();
        }

        System.out.println("Enter Heart Rate: ");
//      int heartRate = scanObj.nextInt();
        int heartRate;
        try{
            
            heartRate = scanObj.nextInt();
        }
        catch(Exception exc){
             System.out.println("Mention the Heart Rate in numerical values");
             scanObj.next();
             System.out.println("Enter correct Heart Rate here:");
             heartRate = scanObj.nextInt();
        }

        System.out.println("Enter Blood Pressure: ");
//        int sysBloodPressure = scanObj.nextInt();
        int sysBloodPressure;
        try{
            
            sysBloodPressure = scanObj.nextInt();
        }
        catch(Exception exc){
             System.out.println("Mention the Blood Pressure in numerical values");
             scanObj.next();
             System.out.println("Enter correct Blood pressure here:");
             sysBloodPressure = scanObj.nextInt();
        }

        System.out.println("Enter Weight in Kgs: ");
//        double weightInKgs = scanObj.nextDouble();
        int weightInKgs;
        try{
            
            weightInKgs = scanObj.nextInt();
        }
        catch(Exception exc){
             System.out.println("Mention the Weight in numerical values");
             scanObj.next();
             System.out.println("Enter correct Weight here:");
             weightInKgs = scanObj.nextInt();
        }
        
        VitalSigns vitalSign = new VitalSigns();
        vitalSign.setAgeGroup(ageGroup);
        vitalSign.setRespiratoryRate(respiratoryRate);
        vitalSign.setHeartRate(heartRate);
        vitalSign.setSysBloodPressure(sysBloodPressure);
        vitalSign.setWeightInKgs(weightInKgs);
        vitalSign.setIsRecent(true);
        
        //Creating encounter object
        Encounter enc = new Encounter();
        enc.setPatient(patient);
        enc.setVitalSigns(vitalSign);
        
        patient.getEncounterHistory().addEncounter(enc);

        //addNewVitalSign(ageGroup, respiratoryRate, heartRate, sysBloodPressure, weightInKgs);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
        enc.setTimeStamp(timeStamp.toString());
        System.out.println("\nYou have succesfully entered the vital signs ");

    }
    
    
     //addNewVitalSign adds new to record to existing lists or to add new one to it
    public static void addNewVitalSign(int ageGroup, int respiratoryRate, int heartRate, int sysBloodPressure, double weightInKgs) {

    }
    
    
    // displayrecords one praticular record asking full name
    private static void displayRecords(PatientData patientData) {
        System.out.println("Encounter-History: ");
        for (Patient p : patientData.getPatientData()) {
            System.out.println("\n\nPatient Name: " + p.getName());
            p.printEncounterHistory();
        }
    }
   
// Check whether patient is normal or abnormal
    
    private static void isThisVitalSignNormal(PatientData patientData) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Please Enter Patient's Name: ");

        String name = scanObj.nextLine();
        
        
        if (name.matches("[0-9]+") && name.length() > 2) {
            System.out.println("Patinet name contains only digits! please enter the name");
            System.out.println("Please enter patient name");
            name = scanObj.next();
        }
        System.out.println("Please enter the attribute which you want to see: ");
        System.out.println("\nRespiratoryRate");
        System.out.println("HeartRate");
        System.out.println("SysBloodPressure");
        System.out.println("WeightInKgs");

        String selectedOption = scanObj.nextLine();

        Patient pat = patientData.getPatient(name);

        boolean result = false;

        switch (selectedOption) {
            case "RespiratoryRate":
                result = pat.isThisVitalSignNormal("RespiratoryRate");
                break;

            case "HeartRate":
                result = pat.isThisVitalSignNormal("HeartRate");
                break;

            case "SysBloodPressure":
                result = pat.isThisVitalSignNormal("SysBloodPressure");
                break;

            case "WeightInKgs":
                result = pat.isThisVitalSignNormal("WeightInKgs");
                break;
                

    }

    }
    
}
