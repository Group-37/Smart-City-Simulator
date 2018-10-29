package Database_Controller;
import java.util.*;
import City_Parts.*;
public class City implements CityPlan{

    ArrayList<ArrayList<Structure>> structures = new ArrayList<ArrayList<Structure>>();
    
    @Override
    public void setCityApartment(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());

        structures.get(i).add(new Apartment());
    }

    @Override
    public void setCityFactory(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	
        structures.get(i).add(new Factory());
    }

    public void setCityGardaStation(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	
        structures.get(i).add(new GardaStation());
    }
    
    public void setCityHospital(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	
        structures.get(i).add(new Hospital());
    }
    
    public void setCityHouse(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	
        structures.get(i).add(new House());
    }
    
    public void setCityPowerPlant(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	
        structures.get(i).add(new PowerPlant());
    }
    
    public void setCityRoad(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	
        structures.get(i).add(new Roads());
    }
    
    public void setCitySchool(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	
        structures.get(i).add(new School());
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