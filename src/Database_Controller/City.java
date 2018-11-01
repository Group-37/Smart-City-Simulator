package Database_Controller;
import java.util.*;
import City_Parts.*;
public class City implements CityPlan{

    ArrayList<ArrayList<Structure>> structures = new ArrayList<ArrayList<Structure>>();
    BuildingFactory buildfact = new BuildingFactory();
    
    @Override
    public void setCityApartment(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());

        Building building = buildfact.Build("a");
        structures.get(i).add(building);
    }

    @Override
    public void setCityFactory(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	
        Building building = buildfact.Build("f");
        structures.get(i).add(building);
    }

    public void setCityGardaStation(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	
        Building building = buildfact.Build("g");
        structures.get(i).add(building);
    }
    
    public void setCityHospital(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	
        Building building = buildfact.Build("+");
        structures.get(i).add(building);
    }
    
    public void setCityHouse(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	
        Building building = buildfact.Build("h");
        structures.get(i).add(building);
    }
    
    public void setCityPowerPlant(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	
        Building building = buildfact.Build("p");
        structures.get(i).add(building);
    }
    
    public void setCityRoad(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	
        structures.get(i).add(new Roads());
    }
    
    public void setCitySchool(int i, int j){
    	if (structures.size() < i+1)
    		structures.add(new ArrayList<Structure>());
    	
        Building building = buildfact.Build("s");
        structures.get(i).add(building);
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