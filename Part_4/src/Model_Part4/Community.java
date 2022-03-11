/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_Part4;

import java.util.ArrayList;

/**
 *
 * @author sushm
 */
public class Community {
    
    String communityName;
    ArrayList<House> houseList;

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }
    
    public Community() {
        this.houseList = new ArrayList<>();
    }
    
    public House getHouse(int houNum){
    
        for(House house: houseList){
         if(house.getHouseNum() == houNum){
          return house;
         }
        }
        
        House houseNew = new House();
        houseNew.setHouseNum(houNum);
        houseList.add(houseNew);
        return houseNew;
    }
}
