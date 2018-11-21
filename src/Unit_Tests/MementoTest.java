package Unit_Tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;

import org.junit.Test;

import City_Parts.Structure;
import Database_Controller.CRUD;
import Database_Controller.City_Builder.City;
import Database_Controller.City_Builder.CityBuilder;
import Database_Controller.City_Builder.CityDirector;
import Database_Controller.City_Builder.SmartCityBuilder;
import FileReadWrite.CSFile;
import FileReadWrite.IFile;
import Main_Controller.Calculate_Resources;
import Main_Controller.Calculate_ResourcesCommand;
import Main_Controller.Calculate_ResourcesPrintCityCommand;
import Main_Controller.CityDetails;
import Main_Controller.Commander;
import Main_Controller.ShowDetails;
import Main_Controller.ShowDetailsCommand;
import Main_Controller.Memento.Caretaker;
import Main_Controller.Memento.Originator;

public class MementoTest {

	static Caretaker caretaker = new Caretaker();
	static Originator originator = new Originator();
	static int savedCities = -1, currentCity = -1;
	
	@Test
	public void test() {
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
	    
	    assertEquals(0, smartCity.getStructures().size());
	    
	    printInfo(smartCity);
	    
	    smartCity = undo(smartCity);
	    
	    printInfo(smartCity);
	    
	    assertNotEquals(0, smartCity.getStructures().size());
	    
	    smartCity = redo(smartCity);
	    
	    printInfo(smartCity);
	    
	    assertEquals(0, smartCity.getStructures().size());
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
