package Resource_Management;

public class LowConsumerWater extends ResourceCost {

    public LowConsumerWater(double hoursOccupied, int numPeople) {
        super(hoursOccupied, numPeople);
    }

    @Override
    public double calculateCost() {
        double cost = hoursOccupied * 0.1;
        cost = cost * (numPeople * 0.1);
        return cost;
    }

    @Override
    public String costInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
