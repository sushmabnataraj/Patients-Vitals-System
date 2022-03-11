/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_Part4;

import Model_Part4.Patient;
import java.util.ArrayList;

/**
 *
 * @author sushm
 */
public class PatientData {
    
    private ArrayList<Patient> patientData;
    
    public ArrayList<Patient> getPatientData() {
        return patientData;
    }
    
    public void setPatientData(ArrayList<Patient> patientList) {
        this.patientData = patientData;
    }
    
    public PatientData() {
        this.patientData = new ArrayList<Patient>();
    }
    
    public Patient getPatient(String name) {
        for (Patient p : this.patientData) {
            if (p.getName().toLowerCase().equals(name.toLowerCase())) {
                return p;
            }
        }
        Patient p = new Patient(name);
        this.patientData.add(p);
        return p;
    }   
}
