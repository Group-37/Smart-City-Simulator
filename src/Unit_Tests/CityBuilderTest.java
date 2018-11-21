package Unit_Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import City_Parts.Apartment;
import City_Parts.Factory;
import City_Parts.GardaStation;
import City_Parts.Hospital;
import City_Parts.House;
import City_Parts.PowerPlant;
import City_Parts.Roads;
import City_Parts.School;
import City_Parts.Structure;
import Database_Controller.CRUD;
import Database_Controller.City_Builder.City;
import Database_Controller.City_Builder.CityBuilder;
import Database_Controller.City_Builder.CityDirector;
import Database_Controller.City_Builder.SmartCityBuilder;
import FileReadWrite.CSFile;
import FileReadWrite.IFile;

public class CityBuilderTest {

	@Test
	public void test() {
		IFile csFileReaderWriter = new CSFile();
    	csFileReaderWriter.get("src\\Resources\\Map.txt");
        CRUD crud = new CRUD(csFileReaderWriter);
    	String[][] cityArray = new String[0][0];
    	cityArray = crud.readFile();

        CityBuilder smartStyleCity = new SmartCityBuilder();

        CityDirector cityDirector = new CityDirector(smartStyleCity);

        cityDirector.makeCity(cityArray);

        City firstCity = cityDirector.getCity();
        
        
        ArrayList<ArrayList<Structure>> structures = new ArrayList<ArrayList<Structure>>();
        structures = firstCity.getStructures();
        
        for(int i = 0 ;  i < structures.size(); i ++)
        {
        	for(int j = 0 ; j <  structures.get(i).size(); j ++)
        	{
        		if(structures.get(i).get(j) != null)
        		{
        			System.out.print(structures.get(i).get(j).getSymbol() + " ");
        			validate(structures.get(i).get(j));
        		}
        		else
        			System.out.print("  ");
        	}
        	System.out.println("");
        		
        }
	}
	
	
	public void validate(Structure s)
	{
		if(s.getSymbol().equalsIgnoreCase("h"))
		{
			assert(s instanceof House);
		}
		if(s.getSymbol().equalsIgnoreCase("r"))
		{
			assert(s instanceof Roads);
		}
		if(s.getSymbol().equalsIgnoreCase("s"))
		{
			assert(s instanceof School);
		}
		if(s.getSymbol().equalsIgnoreCase("g"))
		{
			assert(s instanceof GardaStation);
		}
		if(s.getSymbol().equalsIgnoreCase("f"))
		{
			assert(s instanceof Factory);
		}
		if(s.getSymbol().equalsIgnoreCase("a"))
		{
			assert(s instanceof Apartment);
		}
		if(s.getSymbol().equalsIgnoreCase("p"))
		{
			assert(s instanceof PowerPlant);
		}
		if(s.getSymbol().equalsIgnoreCase("+"))
		{
			assert(s instanceof Hospital);
		}
	}
}
