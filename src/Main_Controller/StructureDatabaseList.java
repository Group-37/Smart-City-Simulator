package Main_Controller;

import java.util.ArrayList;
import java.util.List;

public class StructureDatabaseList {
	List<StructureDatabase> structures;
	
	public List<StructureDatabase> getStructures() {
		return structures;
	}

	public void setStructures(List<StructureDatabase> structures) {
		this.structures = structures;
	}

	public StructureDatabaseList()
	{
		structures= new ArrayList<StructureDatabase>();
	}
}
