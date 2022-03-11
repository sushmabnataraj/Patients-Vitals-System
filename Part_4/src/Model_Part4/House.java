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
public class House {
    
    int houseNum;
    ArrayList<Patient> patientList;
    

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public void addPatient(Patient patient){
        patientList.add(patient);
    }
    
    public House() {
        this.patientList = new ArrayList<>();
    }
}
