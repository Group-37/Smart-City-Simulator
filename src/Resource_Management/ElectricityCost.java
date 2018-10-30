package Resource_Management;

public class ElectricityCost extends ResourceCost {

    public ElectricityCost(double hoursOccupied, int numPeople) {
        super(hoursOccupied, numPeople);
    }

    @Override
    public double calculateCost() {
        double hoursValue = hoursOccupied * 0.1;
        hoursValue = hoursValue - (0.25 * numPeople);
        double cost = hoursValue * 2.25;
        return cost;
    }
    
    public String costInfo()
    {
        String costInfo = "Electricity cost is determined by: hours occupied * 0.1";
        costInfo += "\nThis figure is then reduced by: the number of people * 0.25";
        costInfo += "\nThis is then multiplied by 2.25";
        costInfo += "\nThis means your cost is: ";
        costInfo += "\n€" + calculateCost();
        return costInfo;
        
    }
}
