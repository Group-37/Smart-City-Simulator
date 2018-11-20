package Main_Controller.Chain_Of_Responsibility;

import java.util.*;
import City_Parts.*;

public class StructureCalculation {

	private ArrayList<ArrayList<Structure>> structures;
	private String calcResource;
	
	public StructureCalculation(ArrayList<ArrayList<Structure>> structures, String calcResource)
	{
		this.structures = structures;
		this.calcResource = calcResource;
	}
	
	public ArrayList<ArrayList<Structure>> getStructures() { return structures; }
	public String getCalcResource() { return calcResource; }
	
}
