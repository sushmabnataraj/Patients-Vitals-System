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
public class City {
    
    String cityName;
    ArrayList<Community> communityList;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    public City() {
        this.communityList = new ArrayList<>();
    }
             
    //If community exists or not function
    public Community getCommunity(String cName){
        for (int i=0;i<communityList.size();i++){
            Community community = communityList.get(i);
            if(community.getCommunityName().equalsIgnoreCase(cName)){
             return community;
            }
        }
         //if its not exists
        Community communityNew =  new Community();
        communityNew.setCommunityName(cName);
        communityList.add(communityNew);
        return communityNew;
    
    }
}
