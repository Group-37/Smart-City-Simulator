package Database_Controller;
import java.util.*;
import City_Parts.*;
import Resource_Management.*;
public class City implements CityPlan{

    ArrayList<ArrayList<Structure>> structures = new ArrayList<ArrayList<Structure>>();
    LowCostVisitor lowVisitor = new LowCostVisitor();
    MedCostVisitor medVisitor = new MedCostVisitor();
    HighCostVisitor highVisitor = new HighCostVisitor();
    BuildingFactory bFactory = new BuildingFactory();
    
    @Override
    public void setCityApartment(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	//just random values for testing of resource costs
    	Building apartment = new Apartment();
        apartment = bFactory.Build(apartment, lowVisitor, medVisitor);
    	structures.get(i).add(apartment);
    }

    @Override
    public void setCityFactory(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	Building factory = new Factory();
    	//high water, norm heat
        factory = bFactory.Build(factory, highVisitor, medVisitor);
        structures.get(i).add(factory);
    }

    public void setCityGardaStation(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	Building gardaStation = new GardaStation();
    	//low water, norm heat
    	gardaStation = bFactory.Build(gardaStation, lowVisitor, medVisitor);
        structures.get(i).add(gardaStation);
    }
    
    public void setCityHospital(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	Building hospital = new Hospital();
    	//low water, norm heat;
    	hospital= bFactory.Build(hospital, highVisitor, medVisitor);
        structures.get(i).add(new Hospital());
    }
    
    public void setCityHouse(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	Building house = new House();
    	//low water, norm heat
    	house = bFactory.Build(house, lowVisitor, medVisitor);
        structures.get(i).add(house);
    }
    
    public void setCityPowerPlant(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	Building powerPlant = new PowerPlant();
    	//high water, norm heat
    	powerPlant = bFactory.Build(powerPlant, highVisitor, medVisitor);
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
    	Building school = new School();
    	//high water, norm heat
    	school = bFactory.Build(school, highVisitor, medVisitor);
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