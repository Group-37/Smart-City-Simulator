/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resource_Management;

/**
 *
 * @author Chris Mulcahy
 */
public class HighConsumerWater extends ResourceCost implements WaterCost {

    public HighConsumerWater(double hoursOccupied, int numPeople) {
        super(hoursOccupied, numPeople);
    }

    @Override
    public double calculateCost() {
        double cost = hoursOccupied * 0.25;
        cost = cost * (numPeople * 0.3);
        return cost;
    }

    @Override
    public String costInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
