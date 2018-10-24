package Resource_Management;

public abstract class ResourceCost {
    protected double hoursOccupied;
    protected int numPeople;
    
    public ResourceCost(double hoursOccupied, int numPeople)
    {
        this.hoursOccupied = hoursOccupied;
        this.numPeople = numPeople;
    }
    
    public abstract double calculateCost();
    
    public abstract String costInfo();
}
