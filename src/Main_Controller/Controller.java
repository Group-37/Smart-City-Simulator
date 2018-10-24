package Main_Controller;
import Database_Controller.*;
import City_Parts.*;
public class Controller {
	
	public static void main(String [] args)
	{
		Structure[][] structures;
		CRUD c = new CRUD();
		structures = c.readFile();

	System.out.println(" ");
		for(int i = 0; i < structures.length; i++)
		{
			for(int j = 0; j < structures[i].length; j++)
			{
				System.out.print(structures[i][j].getSymbol());
			}
			System.out.println();
		}

		int totalPop = 0;
		float totalEnergyConsumptionPerDay = 0.0f;
		float totalHeatCost = 0.0f;
		float totalEnergyCost = 0.0f;
		float totalEnergyCostPerDay = 0f;

		for(int i = 0; i < structures.length; i++)
		{
			for(int j = 0; j < structures[i].length; j++)
			{

				if(structures[i][j] instanceof Building)
				{
					if(structures[i][i] instanceof House || structures[i][i] instanceof Apartment)
					{
						totalPop += structures[i][j].getResidents();
					}
					totalHeatCost += structures[i][j].getHeatingCostPerDay();
					totalEnergyCost += structures[i][j].getEnergyCostPerDay();
					totalEnergyCostPerDay += structures[i][j].getTotalCost();
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
