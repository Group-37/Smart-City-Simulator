package Resource_Management;

public class Heat extends ResourceCost implements Visitable {

	public Heat(double hoursOccupied, int numPeople) {
        super(hoursOccupied, numPeople);
    }
	
	@Override
	public float accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
	public double getHoursOccupied()
	{
		return hoursOccupied;
	}
	
	public int getNumPeople()
	{
		return numPeople;
	}
	
	public double getCost()
	{
		  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
