package City_Parts;

import Resource_Management.ResourceCost;
import java.util.ArrayList;

public class Structure {
	
    private ArrayList<ResourceCost> resourceCost = new ArrayList<ResourceCost>();
    
	public Structure()
	{
		
	}
	public String getSymbol()
	{
		return " ";
	}
        
        public void addResource(ResourceCost resourceCost)
        {
            this.resourceCost.add(resourceCost);
        }
}
