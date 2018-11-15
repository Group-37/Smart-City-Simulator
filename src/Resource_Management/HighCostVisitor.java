package Resource_Management;

public class HighCostVisitor implements Visitor{

	public HighCostVisitor()
	{
		
	}
	
	//CALCULATIONS FOR HIGH COSTS
	
	public float visit(Electricity electricity)
	{
		System.out.println("found electricity");
		double hoursValue = electricity.getHoursOccupied() * 0.1;
		hoursValue = hoursValue - (0.25 * electricity.getNumPeople());
		double cost = hoursValue * 2.25;
		return (float)cost;
	}
	
	public float visit(Water water)
	{
		double cost = water.getHoursOccupied() * 0.25;
		cost = (cost * (water.getNumPeople() * 0.3));
		return (float)cost;
	}
	
	public float visit(Heat heat)
	{
		double hoursValue = heat.getHoursOccupied() * 0.3;
		double cost = hoursValue * 4.25;
		return (float)cost;
	}
}
