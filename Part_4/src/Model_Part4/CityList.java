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
public class CityList {
    
    ArrayList<City> cityList;

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    
    public CityList() {
        this.cityList = new ArrayList<>();
    }
    
    
    // to chech whether city exists or not
    public City getCity(String ctName){
        
        for (int i=0;i<cityList.size();i++){
         City city = cityList.get(i);
         if(city.getCityName().equalsIgnoreCase(ctName)){
         return city;
         }
        }
        
        City cityNew = new City();
        cityNew.setCityName(ctName);
        cityList.add(cityNew);
        return cityNew;
    }
}
