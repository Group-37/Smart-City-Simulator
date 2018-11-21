package Main_Controller.Chain_Of_Responsibility;

import java.util.*;
import City_Parts.*;

public class CalcTotalHeatCost implements Chain 
{
	private ArrayList<ArrayList<Structure>> structures;
	private Chain nextResource;
	@Override
	public void setNextChain(Chain nextResource)
	{
		this.nextResource = nextResource;
	}

	@Override
	public float calculate(StructureCalculation structureCalc) 
	{
		float totalHeatCost = 0;
		if(structureCalc.getCalcResource() == "heat")
		{
			structures = structureCalc.getStructures();
			for(int i = 0; i < structures.size(); i++)
			{
				for(int j = 0; j < structures.get(i).size(); j++)
				{

					if(structures.get(i).get(j) instanceof Building)
					{
						Building building = (Building)structures.get(i).get(j);
						if (building.getHeatCosts() != null)
							totalHeatCost += building.getHeatTotal();
					}
				}
			}
			return totalHeatCost;
		}
		else
		{
			return nextResource.calculate(structureCalc);
		}
	}
}
