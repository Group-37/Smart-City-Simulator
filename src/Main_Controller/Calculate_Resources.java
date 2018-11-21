package Main_Controller;

import java.util.ArrayList;

import City_Parts.Apartment;
import City_Parts.Building;
import City_Parts.House;
import City_Parts.Structure;
import Main_Controller.Chain_Of_Responsibility.*;

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
		Chain chainCalcHeat = new CalcTotalHeatCost();
		Chain chainCalcPop = new CalcTotalPop();
		Chain chainCalcEnergy = new CalcTotalEnergyCost();
		Chain chainCalcEnergyPerDay = new CalcTotalEnergyCostPerDay();
		
		chainCalcHeat.setNextChain(chainCalcPop);
		chainCalcPop.setNextChain(chainCalcEnergy);
		chainCalcEnergy.setNextChain(chainCalcEnergyPerDay);
		
		StructureCalculation totalPopCalc = new StructureCalculation(structures, "pop");
		StructureCalculation totalHeatCostCalc = new StructureCalculation(structures, "heat");
		StructureCalculation totalEnergyCostCalc = new StructureCalculation(structures, "energy");
		StructureCalculation totalEnergyCostPerDayCalc = new StructureCalculation(structures, "energyPerDay");
		
		cityDetails.setTotalPop((int)chainCalcHeat.calculate(totalPopCalc));
		cityDetails.setTotalHeatCost(chainCalcHeat.calculate(totalHeatCostCalc));
		cityDetails.setTotalEnergyCost(chainCalcHeat.calculate(totalEnergyCostCalc));
		cityDetails.setTotalEnergyCostPerDay(chainCalcHeat.calculate(totalEnergyCostPerDayCalc));
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
	
	public String stringCity()
	{
		String returnString = "";
		for(int i = 0; i < structures.size(); i++)
		{
			for(int j = 0; j < structures.get(i).size(); j++)
			{
				if(structures.get(i).get(j) != null)
					returnString += (structures.get(i).get(j).getSymbol() + " ");
				else {
					returnString += "  ";
				}
			}
			returnString += "\n";
		}
		return returnString;
	}
	
	public String results()
	{
		String resultString = "";
		resultString += "\nTotal population: " + cityDetails.getTotalPop() + "\n";
		resultString += "Total cost of energy per day: " + cityDetails.getTotalEnergyCost() + "\n";
		resultString += "Total cost of heat per day: " + cityDetails.getTotalHeatCost() + "\n";
		resultString += "Total Cost per day: " + cityDetails.getTotalEnergyCostPerDay() + "\n";
		int costPerYear = (int)cityDetails.getTotalEnergyCostPerDay() * 365;
		resultString += "Total Cost per year: " + costPerYear + "\n";
		return resultString;
	}
	
	public CityDetails getCityDetails()
	{
		return cityDetails;
	}

}
