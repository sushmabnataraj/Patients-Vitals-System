/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_part3;

/**
 *
 * @author sushm
 */
public class Patient extends Person {
    
    private PatientData patientData;
    private EncounterHistory encounterHistory;

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }
    

    public Patient(String name) {
        super.setName(name);
         encounterHistory = new EncounterHistory();
       
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    
        
    // Allocated the specific memeory location to patientPart2 class
    public Patient() {
        this.patientData = new PatientData();
//        encounterHistory = new EncounterHistory();
    }
    
    public boolean isThisVitalSignNormal(String selectedVitalSignName) {
        for (Encounter encounter : this.encounterHistory.encounterList) {
            VitalSigns vsign = encounter.getVitalSigns();
            if (vsign.getIsIsRecent()) {
                return vsign.isThisVitalSignNormal(selectedVitalSignName);
            }
        }
        return false;
    }
    
    public void printEncounterHistory(){
        int i = 0;
        for(Encounter enc:this.encounterHistory.encounterList){
            VitalSigns vsign = enc.getVitalSigns();
            System.out.println("\nRecord " + (++i) + " : ");
            System.out.println("Timestamp: " + enc.getTimeStamp());
            System.out.println("Age: " + vsign.getAgeGroup());
            System.out.println("Respiratory Rate: " + vsign.getRespiratoryRate());
            System.out.println("Heart Rate: " + vsign.getHeartRate());
            System.out.println("Systolic Blood pressure: " + vsign.getSysBloodPressure());
            System.out.println("Weight In Kgs: " + vsign.getWeightInKgs());
        }
    }
}
