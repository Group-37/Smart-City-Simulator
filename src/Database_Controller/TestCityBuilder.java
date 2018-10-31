package Database_Controller;

import java.util.ArrayList;
import FileReadWrite.*;

import City_Parts.Structure;

public class TestCityBuilder {

    public static void main(String [] args){
        
    	IFile csFileReaderWriter = new CSFile();
    	csFileReaderWriter.get("C:\\Users\\Chris Mulcahy\\Documents\\GitHub\\Smart-City-Again\\Smart-City-Simulator\\src\\Resources\\Map.txt");
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
        			System.out.print(structures.get(i).get(j).getSymbol() + " ");
        		else
        			System.out.print("  ");
        	}
        	System.out.println("");
        		
        }

    }
}