/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_part3;

import java.util.ArrayList;

/**
 *
 * @author sushm
 */
public class EncounterHistory {
    
    public ArrayList<Encounter> encounterList;
    
    public EncounterHistory(){
    encounterList = new ArrayList<>();
    }
    
    public void addEncounter(Encounter encounter){
        this.encounterList.add(encounter);
    
    }
            
}
