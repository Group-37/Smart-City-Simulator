package Main_Controller.Chain_Of_Responsibility;

import City_Parts.*;
import java.util.*;

public class CalcTotalPop implements Chain 
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
		float totalPop = 0;
		if(structureCalc.getCalcResource() == "pop")
		{
			structures = structureCalc.getStructures();
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
					}
				}
			}
			return totalPop;
		}
		else
		{
			return nextResource.calculate(structureCalc);
		}
	}
}
