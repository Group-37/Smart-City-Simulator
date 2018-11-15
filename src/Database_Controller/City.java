package Database_Controller;
import java.util.*;
import City_Parts.*;
import Resource_Management.*;
public class City implements CityPlan{

    ArrayList<ArrayList<Structure>> structures = new ArrayList<ArrayList<Structure>>();
    LowCostVisitor lowVisitor = new LowCostVisitor();
    MedCostVisitor medVisitor = new MedCostVisitor();
    HighCostVisitor highVisitor = new HighCostVisitor();
    
    @Override
    public void setCityApartment(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	//just random values for testing of resource costs
    	Apartment apartment = new Apartment();
    	Water water = new Water(apartment.getHoursOcc(), apartment.getResidents());
        Heat heat = new Heat(apartment.getHoursOcc(), apartment.getResidents());
    	apartment.setWaterCosts(water);
    	apartment.setHeatCosts(heat);
    	apartment.setWaterTotal(lowVisitor);
    	apartment.setHeatTotal(medVisitor);
    	apartment.setTotalCost();
    	structures.get(i).add(apartment);
    }

    @Override
    public void setCityFactory(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	Factory factory = new Factory();
    	//high water, norm heat
    	Water water = new Water(factory.getHoursOcc(), factory.getResidents());
        Heat heat = new Heat(factory.getHoursOcc(), factory.getResidents());
    	factory.setWaterCosts(water);
    	factory.setHeatCosts(heat);
    	factory.setWaterTotal(highVisitor);
    	factory.setHeatTotal(medVisitor);
    	factory.setTotalCost();
        structures.get(i).add(factory);
    }

    public void setCityGardaStation(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	GardaStation gardaStation = new GardaStation();
    	//low water, norm heat
    	Water water = new Water(gardaStation.getHoursOcc(), gardaStation.getResidents());
        Heat heat = new Heat(gardaStation.getHoursOcc(), gardaStation.getResidents());
        gardaStation.setWaterCosts(water);
        gardaStation.setHeatCosts(heat);
        gardaStation.setWaterTotal(lowVisitor);
        gardaStation.setHeatTotal(medVisitor);
        gardaStation.setTotalCost();
        structures.get(i).add(gardaStation);
    }
    
    public void setCityHospital(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	Hospital hospital = new Hospital();
    	//low water, norm heat;
    	Water water = new Water(hospital.getHoursOcc(), hospital.getResidents());
        Heat heat = new Heat(hospital.getHoursOcc(), hospital.getResidents());
        hospital.setWaterCosts(water);
        hospital.setHeatCosts(heat);
        hospital.setWaterTotal(lowVisitor);
        hospital.setHeatTotal(medVisitor);
        hospital.setTotalCost();
        structures.get(i).add(new Hospital());
    }
    
    public void setCityHouse(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	House house = new House();
    	//low water, norm heat
    	Water water = new Water(house.getHoursOcc(), house.getResidents());
        Heat heat = new Heat(house.getHoursOcc(), house.getResidents());
        house.setWaterCosts(water);
        house.setHeatCosts(heat);
        house.setWaterTotal(lowVisitor);
        house.setHeatTotal(medVisitor);
        house.setTotalCost();
        structures.get(i).add(house);
    }
    
    public void setCityPowerPlant(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	PowerPlant powerPlant = new PowerPlant();
    	//high water, norm heat
    	Water water = new Water(powerPlant.getHoursOcc(), powerPlant.getResidents());
        Heat heat = new Heat(powerPlant.getHoursOcc(), powerPlant.getResidents());
        powerPlant.setWaterCosts(water);
        powerPlant.setHeatCosts(heat);
        powerPlant.setWaterTotal(highVisitor);
        powerPlant.setHeatTotal(medVisitor);
        powerPlant.setTotalCost();
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
    	//high water, norm heat
    	Water water = new Water(school.getHoursOcc(), school.getResidents());
        Heat heat = new Heat(school.getHoursOcc(), school.getResidents());
        school.setWaterCosts(water);
        school.setHeatCosts(heat);
        school.setWaterTotal(highVisitor);
        school.setHeatTotal(medVisitor);
        school.setTotalCost();
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