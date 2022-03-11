/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestMain;

import Model.Patient;
import Model.VitalSigns;
import java.util.Scanner;

/**
 *
 * @author sushm
 */
public class TestFunctionality {
    
    public static void main(String[] args) {
        
    VitalSigns vSign = new VitalSigns();
    Patient patient = new Patient();
    boolean flag = true;
    
    
    while (flag){
        
        
        Scanner scanObj = new Scanner(System.in);
        
        System.out.println("Enter the name of the patient:");
        patient.setName(scanObj.nextLine());
        
        System.out.println("Enter the Age:");
        vSign.setAgeGroup(scanObj.nextInt());
        
        System.out.println("Enter the Respiratory Rate:");
        vSign.setRespiratoryRate(scanObj.nextInt());
        
        System.out.println("Enter the Heart Rate:");
        vSign.setHeartRate(scanObj.nextInt());
        
        System.out.println("Enter the Syscolic Blood Pressure:");
        vSign.setSysBloodPressure(scanObj.nextInt());
        
        System.out.println("Enter the weight in Kilograms(KGs):");
        vSign.setWeightInKgs(scanObj.nextDouble());
        
        boolean result = patient.isPatientNormal(vSign);
        
        if(result){
            
            System.out.println("\n Patient is Normal");
        }
        else{
            System.out.println("\n Patient is Abnormal");
        }
        
        System.out.println("Please enter Y to continue or any other letter to exit");
        String toContinue = scanObj.next();
        
        if (toContinue.equalsIgnoreCase("y")){
        flag = true;
        }
        else{
        flag = false;
        }
    
    }

    
        
    }
   
    
}
