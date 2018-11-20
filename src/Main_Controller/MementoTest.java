package Main_Controller;
import Database_Controller.*;
import FileReadWrite.*;
import java.util.ArrayList;
import City_Parts.*;
import FileReadWrite.*;
public class MementoTest {
	
	static Caretaker caretaker = new Caretaker();
	static Originator originator = new Originator();
	static int savedCities = -1, currentCity = -1;
	
	
	public static void main(String [] args)
	{
		
		IFile fileReaderWriter = new CSFile();
		fileReaderWriter.get("src\\Resources\\Map.txt");
		CRUD crud = new CRUD(fileReaderWriter);
		String[][] cityArray = new String[0][0];
		cityArray = crud.readFile();
		
		CityBuilder smartStyleCity = new SmartCityBuilder();

        CityDirector cityDirector = new CityDirector(smartStyleCity);
	
	    cityDirector.makeCity(cityArray);
	    
	    City smartCity = cityDirector.getCity();
	    
	    saveCity(smartCity);
	    
	    printInfo(smartCity);
	    
	    smartCity = new City();
	    
	    saveCity(smartCity);
	    
	    printInfo(smartCity);
	    
	    smartCity = undo(smartCity);
	    
	    printInfo(smartCity);
	    
	    smartCity = redo(smartCity);
	    
	    printInfo(smartCity);
	}
	
	public static void saveCity(City c)
	{
		originator.set(c);
		caretaker.addMemento(originator.storeInMemento());
		
		savedCities++;
		currentCity++;
	}
	
	public static City undo(City c)
	{
		if(currentCity >= 1)
		{
			currentCity--;
			c = originator.restoreFromMemento(caretaker.getMemento(currentCity));
			return c;
		}
		return c;
	}
	
	public static City redo(City c)
	{
		if((savedCities - 1) >= currentCity)
		{
			currentCity++;
			c = originator.restoreFromMemento(caretaker.getMemento(currentCity));
			return c;
		}
		return c;
	}
	
	public static void printInfo(City c)
	{
		Commander c1 = new Commander();
        
        
        ArrayList<ArrayList<Structure>> structures = new ArrayList<ArrayList<Structure>>();
        structures = c.getStructures();
        
        
		CityDetails cityDetails = new CityDetails();
		
		Calculate_Resources calculateResources = new Calculate_Resources(structures, cityDetails);
		Calculate_ResourcesPrintCityCommand cRPCC1 = new Calculate_ResourcesPrintCityCommand(calculateResources);
		Calculate_ResourcesCommand cRC1 = new Calculate_ResourcesCommand(calculateResources);
		
		c1.setCommand(cRPCC1);
		c1.doCommand();
		c1.setCommand(cRC1);
		c1.doCommand();
		
		cityDetails = calculateResources.getCityDetails();
		
		ShowDetails sD1 = new ShowDetails(cityDetails);
		ShowDetailsCommand sDC1 = new ShowDetailsCommand(sD1);
	
		c1.setCommand(sDC1);
		c1.doCommand();
	}
}
