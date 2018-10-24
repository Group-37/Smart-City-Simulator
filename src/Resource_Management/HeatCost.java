package Resource_Management;

public class HeatCost extends ResourceCost {

    public HeatCost(double hoursOccupied, int numPeople) {
        super(hoursOccupied, numPeople);
    }

    @Override
    public double calculateCost() {
        double hoursValue = hoursOccupied * 0.3;
        double cost = hoursValue * 4.25;
        return cost;
    }

    @Override
    public String costInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
