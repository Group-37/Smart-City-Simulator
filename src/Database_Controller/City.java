package Database_Controller;
import java.util.*;
import City_Parts.*;
import Resource_Management.*;
public class City implements CityPlan{

    ArrayList<ArrayList<Structure>> structures = new ArrayList<ArrayList<Structure>>();
    
    @Override
    public void setCityApartment(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	//just random values for testing of resource costs
    	Apartment apartment = new Apartment();
    	WaterCost waterCost = new LowConsumerWater(apartment.getHoursOcc(), apartment.getResidents());
        HeatCost heatCost = new HeatCostGeneric(apartment.getHoursOcc(), apartment.getResidents());
    	apartment.setWaterCosts(waterCost);
    	apartment.setHeatCosts(heatCost);
    	structures.get(i).add(apartment);
    }

    @Override
    public void setCityFactory(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	Factory factory = new Factory();
    	WaterCost waterCost = new HighConsumerWater(factory.getHoursOcc(), factory.getResidents());
        HeatCost heatCost = new HeatCostGeneric(factory.getHoursOcc(), factory.getResidents());
    	factory.setWaterCosts(waterCost);
    	factory.setHeatCosts(heatCost);
        structures.get(i).add(factory);
    }

    public void setCityGardaStation(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	GardaStation gardaStation = new GardaStation();
    	WaterCost waterCost = new LowConsumerWater(gardaStation.getHoursOcc(), gardaStation.getResidents());
        HeatCost heatCost = new HeatCostGeneric(gardaStation.getHoursOcc(), gardaStation.getResidents());
        gardaStation.setWaterCosts(waterCost);
        gardaStation.setHeatCosts(heatCost);
        structures.get(i).add(gardaStation);
    }
    
    public void setCityHospital(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	Hospital hospital = new Hospital();
    	WaterCost waterCost = new LowConsumerWater(hospital.getHoursOcc(), hospital.getResidents());
        HeatCost heatCost = new HeatCostGeneric(hospital.getHoursOcc(), hospital.getResidents());
        hospital.setWaterCosts(waterCost);
        hospital.setHeatCosts(heatCost);
        structures.get(i).add(new Hospital());
    }
    
    public void setCityHouse(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	House house = new House();
    	WaterCost waterCost = new LowConsumerWater(house.getHoursOcc(), house.getResidents());
        HeatCost heatCost = new HeatCostGeneric(house.getHoursOcc(), house.getResidents());
        house.setWaterCosts(waterCost);
        house.setHeatCosts(heatCost);
        structures.get(i).add(house);
    }
    
    public void setCityPowerPlant(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	PowerPlant powerPlant = new PowerPlant();
    	WaterCost waterCost = new HighConsumerWater(powerPlant.getHoursOcc(), powerPlant.getResidents());
        HeatCost heatCost = new HeatCostGeneric(powerPlant.getHoursOcc(), powerPlant.getResidents());
        powerPlant.setWaterCosts(waterCost);
        powerPlant.setHeatCosts(heatCost);
        structures.get(i).add(powerPlant);
    }
    
    public void setCityRoad(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	
        structures.get(i).add(new Roads());
    }
    
    public void setCitySchool(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	School school = new School();
    	WaterCost waterCost = new HighConsumerWater(school.getHoursOcc(), school.getResidents());
        HeatCost heatCost = new HeatCostGeneric(school.getHoursOcc(), school.getResidents());
        school.setWaterCosts(waterCost);
        school.setHeatCosts(heatCost);
        structures.get(i).add(school);
    }
    
    public void setCityBlank(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	
        structures.get(i).add(null);
    }
    
    
    
    public ArrayList<ArrayList<Structure>> getStructures()
    {
    	return structures;
    }
}