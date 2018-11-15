package Main_Controller;

import java.util.ArrayList;

import City_Parts.Apartment;
import City_Parts.Building;
import City_Parts.House;
import City_Parts.Structure;

public class Calculate_Resources {
	ArrayList<ArrayList<Structure>> structures;
	CityDetails cityDetails;
	int totalPop = 0;
	float totalEnergyConsumptionPerDay = 0.0f;
	float totalHeatCost = 0.0f;
	float totalEnergyCost = 0.0f;
	float totalEnergyCostPerDay = 0f;
	
	public Calculate_Resources(ArrayList<ArrayList<Structure>> structures, CityDetails cityDetails)
	{
		this.structures = structures;
		this.cityDetails = cityDetails;
	}
	
	public void calculateTheResources()
	{
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
					Building building = (Building)structures.get(i).get(j);
					if (building.getHeatCosts() != null)
						totalHeatCost += building.getHeatTotal();
					if (building.getElectricityCosts() != null)
						totalEnergyCost += building.getElectricityTotal();
					if (building.getWaterCosts() != null)
						totalEnergyCost += building.getWaterTotal();
					totalEnergyCostPerDay += structures.get(i).get(j).getTotalCost();
				}
			}
		}
		cityDetails.setTotalPop(totalPop);
		cityDetails.setTotalHeatCost(totalHeatCost);
		cityDetails.setTotalEnergyCost(totalEnergyCost);
		cityDetails.setTotalEnergyCostPerDay(totalEnergyCostPerDay);
	}
	
	public void printTheCity()
	{
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
	}
	
	public CityDetails getCityDetails()
	{
		return cityDetails;
	}

}
