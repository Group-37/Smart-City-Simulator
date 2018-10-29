package Database_Controller;

import java.util.ArrayList;

import City_Parts.Structure;

public class TestCityBuilder {

    public static void main(String [] args){
        
        CRUD crud = new CRUD();
    	String[][] cityArray = new String[0][0];
    	cityArray = crud.readFile();

        CityBuilder oldStyleCity = new OldCityBuilder();

        CityDirector cityDirector = new CityDirector(oldStyleCity);

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