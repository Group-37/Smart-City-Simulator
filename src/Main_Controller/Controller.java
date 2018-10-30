package Main_Controller;
import Database_Controller.*;
import FileReadWrite.*;

import java.util.ArrayList;

import City_Parts.*;
public class Controller {
	
	public static void main(String [] args)
	{
		IFile fileReaderWriter = new CSFile();
		fileReaderWriter.get("C:\\Users\\Chris Mulcahy\\Documents\\GitHub\\Smart-City-Again\\Smart-City-Simulator\\src\\Resources\\Map.txt");
		 CRUD crud = new CRUD(fileReaderWriter);
    	String[][] cityArray = new String[0][0];
    	cityArray = crud.readFile();

        CityBuilder oldStyleCity = new OldCityBuilder();

        CityDirector cityDirector = new CityDirector(oldStyleCity);

        cityDirector.makeCity(cityArray);

        City firstCity = cityDirector.getCity();
        
        
        ArrayList<ArrayList<Structure>> structures = new ArrayList<ArrayList<Structure>>();
        structures = firstCity.getStructures();
        
        

		for(int i = 0; i < structures.size(); i++)
		{
			for(int j = 0; j < structures.get(i).size(); j++)
			{
				if(structures.get(i).get(j) != null)
					System.out.print(structures.get(i).get(j).getSymbol() + " ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		int totalPop = 0;
		float totalEnergyConsumptionPerDay = 0.0f;
		float totalHeatCost = 0.0f;
		float totalEnergyCost = 0.0f;
		float totalEnergyCostPerDay = 0f;

		for(int i = 0; i < structures.size(); i++)
		{
			for(int j = 0; j < structures.get(i).size(); j++)
			{

				if(structures.get(i).get(j) instanceof Building)
				{
					if(structures.get(i).get(j) instanceof House || structures.get(i).get(j) instanceof Apartment)
					{
						totalPop += structures.get(i).get(j).getResidents();
					}
					totalHeatCost += structures.get(i).get(j).getHeatingCostPerDay();
					totalEnergyCost += structures.get(i).get(j).getEnergyCostPerDay();
					totalEnergyCostPerDay += structures.get(i).get(j).getTotalCost();
				}
			}
		}

		System.out.println("\nTotal population: " + totalPop);
		System.out.println("Total cost of energy per day: " + totalEnergyCost);
		System.out.println("Total cost of heat per day: " + totalHeatCost);
		System.out.println("Total Cost per day: " + totalEnergyCostPerDay);
		int costPerYear = (int)totalEnergyCostPerDay * 365;
		System.out.println("Total Cost per year: " + costPerYear);


	}
}
