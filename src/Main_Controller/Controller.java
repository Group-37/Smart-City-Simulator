package Main_Controller;
import Database_Controller.*;
import FileReadWrite.*;

import java.util.ArrayList;

import City_Parts.*;
public class Controller {
	
	CRUD crud;
	
	public Controller(String fileType, String fileName)
	{
		IFileFactory.addIFile("SCFile", new SCFile());
		IFileFactory.addIFile("CSFile", new CSFile());
		IFileFactory.addIFile("TDFile", new TDFile());
		IFile fileReader = IFileFactory.getIFile(fileType);
		fileReader.get(fileName);
		crud = new CRUD(fileReader);
	}
	
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
        
        Commander c1 = new Commander();
        
        
        ArrayList<ArrayList<Structure>> structures = new ArrayList<ArrayList<Structure>>();
        structures = smartCity.getStructures();
        
        
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
	
	void run()
	{
    	String[][] cityArray = new String[0][0];
    	cityArray = crud.readFile();

        CityBuilder smartStyleCity = new SmartCityBuilder();

        CityDirector cityDirector = new CityDirector(smartStyleCity);

        cityDirector.makeCity(cityArray);

        City smartCity = cityDirector.getCity();
        
        Commander c1 = new Commander();
        
        
        ArrayList<ArrayList<Structure>> structures = new ArrayList<ArrayList<Structure>>();
        structures = smartCity.getStructures();
        
        
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
