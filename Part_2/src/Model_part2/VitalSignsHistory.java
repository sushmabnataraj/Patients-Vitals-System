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
public class VitalSignsHistory {
    
    private ArrayList<VitalSignsPart2> vitalSignsHistory;
    
    public VitalSignsHistory() {
        this.vitalSignsHistory = new ArrayList<VitalSignsPart2>();
    }

    public ArrayList<VitalSignsPart2> getVitalSignsHistory() {
        return this.vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSignsPart2> history) {
        this.vitalSignsHistory = history;
    }

    public void addVital(VitalSignsPart2 vs) {
        vitalSignsHistory.add(vs);
    }
    
    
}
