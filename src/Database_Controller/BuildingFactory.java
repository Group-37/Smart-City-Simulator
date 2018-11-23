/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database_Controller;
import City_Parts.*;
import Resource_Management.*;
/**
 *
 * @author user1
 */
public class BuildingFactory {
     
    public CityBuilder Build(String symbol, CityBuilder cb, int i, int j){
      
     
         
                if(symbol.equalsIgnoreCase("a")) {
                {
                	cb.buildCityApartment(i, j);
                }
                
                if(symbol.equalsIgnoreCase("f"))
                {
                	cb.buildCityFactory(i, j);
                }
                
                if(symbol.equalsIgnoreCase("r"))
                {
                	cb.buildCityRoads(i, j);
                }
                
                if(symbol.equalsIgnoreCase("+"))
                {
                	cb.buildCityHospital(i, j);
                }
                
                if(symbol.equalsIgnoreCase("h"))
                {
                	cb.buildCityHouse(i, j);
                }
                
                if(symbol.equalsIgnoreCase("s"))
                {
                	cb.buildCitySchool(i, j);
                }
                
                if(symbol.equalsIgnoreCase("g"))
                {
                	cb.buildCityGardaStation(i, j);
                }
                
                if(symbol.equalsIgnoreCase("p"))
                {
                	cb.buildCityPowerPlant(i, j);
                }
                
                if(symbol.equalsIgnoreCase("0"))
                {
                	cb.buildCityBlank(i, j);
                }
                
            }  return cb;
     }
     
     public Building Build(Building building, Visitor a, Visitor b){
      Water water = new Water(building.getHoursOcc(), building.getResidents());
        Heat heat = new Heat(building.getHoursOcc(), building.getResidents());
    	building.setWaterCosts(water);
    	building.setHeatCosts(heat);
    	building.setWaterTotal(a);
    	building.setHeatTotal(b);
    	building .setTotalCost();   
        
        return building;
     }
}





