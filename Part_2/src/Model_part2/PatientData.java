/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_part2;

import java.util.ArrayList;

/**
 *
 * @author sushm
 */
public class PatientData {
    
    private ArrayList<PatientPart2> patientData;
    
    public ArrayList<PatientPart2> getPatientData() {
        return patientData;
    }
    
    public void setPatientData(ArrayList<PatientPart2> patientList) {
        this.patientData = patientData;
    }
    
    public PatientData() {
        this.patientData = new ArrayList<PatientPart2>();
    }
    
   
    public PatientPart2 getPatientPart2(String name) {
        for (PatientPart2 p : this.patientData) {
            if (p.getName().toLowerCase().equals(name.toLowerCase())) {
                return p;
            }
        }
        PatientPart2 p = new PatientPart2(name);
        this.patientData.add(p);
        return p;
    }
    
}
