/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author sushm
 */
public class Patient {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    boolean isPatientNormal = false;
    
    
    public boolean isPatientNormal(VitalSigns vitalSigns){
        
    int ageGroup = vitalSigns.getAgeGroup();
    int isAge = 0;
    int respiratoryRate = vitalSigns.getRespiratoryRate();
    int heartRate = vitalSigns.getHeartRate();
    int sysBloodPressure = vitalSigns.getSysBloodPressure();
    double weightInKgs = vitalSigns.getWeightInKgs();
    
        if (ageGroup == 0){
            
            isAge = 1;
        }
        else if (ageGroup == 1){
             
            isAge = 2;
        }
        else if (ageGroup > 1 && ageGroup <= 3){
             
            isAge = 3;
        }
        else if (ageGroup >= 4 && ageGroup <= 5){
             
            isAge = 4;
        }
        else if (ageGroup >= 6 && ageGroup <= 12){
             
            isAge = 5;
        }
        else if (ageGroup >= 13){
             
            isAge = 6;
        }
        else{
             
            System.out.println("Age is not defined");
        }
        
        switch(isAge){
            
            case 1 :
                
                if (respiratoryRate >= 30 && respiratoryRate <=50 && heartRate >= 120 && heartRate <= 160 && sysBloodPressure >= 50 && sysBloodPressure <= 70 &&
                weightInKgs >= 2 && weightInKgs <=3){
                isPatientNormal = true;   
                }
                else {
                isPatientNormal = false;
                }
                break;
                
            case 2 :
                
                if (respiratoryRate >= 20 && respiratoryRate <= 30 && heartRate >= 80 && heartRate <= 140 && sysBloodPressure >= 70 && sysBloodPressure <= 100 &&
                weightInKgs >= 4 && weightInKgs <= 10){
                isPatientNormal = true;   
                }
                else {
                isPatientNormal = false;
                }
                break;
                
            case 3 :
                
                if (respiratoryRate >= 20 && respiratoryRate <= 30 && heartRate >= 80 && heartRate <= 130 && sysBloodPressure >= 80 && sysBloodPressure <= 110 &&
                weightInKgs >= 10 && weightInKgs <= 14){
                isPatientNormal = true;   
                }
                else {
                isPatientNormal = false;
                }
                break;
                
            case 4 :
                
                if (respiratoryRate >= 20 && respiratoryRate <= 30 && heartRate >= 80 && heartRate <= 120 && sysBloodPressure >= 80 && sysBloodPressure <= 110 &&
                weightInKgs >= 14 && weightInKgs <= 18){
                isPatientNormal = true;   
                }
                else {
                isPatientNormal = false;
                }
                break;
                
            case 5 :
                
                if (respiratoryRate >= 20 && respiratoryRate <= 30 && heartRate >= 70 && heartRate <= 110 && sysBloodPressure >= 80 && sysBloodPressure <= 120 &&
                weightInKgs >= 20 && weightInKgs <= 42){
                isPatientNormal = true;   
                }
                else {
                isPatientNormal = false;
                }
                break;
                
            case 6 :
                
                if (respiratoryRate >= 12 && respiratoryRate <= 20 && heartRate >= 55 && heartRate <= 105 && sysBloodPressure >= 110 && sysBloodPressure <= 120 &&
                weightInKgs >= 50){
                isPatientNormal = true;   
                }
                else {
                isPatientNormal = false;
                }
                break;
         
        }
        return isPatientNormal;
    }
}
