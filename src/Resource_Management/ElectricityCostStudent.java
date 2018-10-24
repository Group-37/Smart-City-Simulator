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
public class ElectricityCostStudent extends ResourceCost {
    
    public ElectricityCostStudent(float hoursOccupied, int numPeople)
    {
        super(hoursOccupied, numPeople);
    }

    @Override
    public double calculateCost() {
        double hoursValue = hoursOccupied * 0.1;
        hoursValue = hoursValue - (0.25 * numPeople);
        double cost = hoursValue * 2.25;
        double studentCost = cost * 0.8;
        return studentCost;
    }

    @Override
    public String costInfo() {
        String costInfo = "Electricity cost is determined by: hours occupied * 0.1";
        costInfo += "\nThis figure is then reduced by: the number of people * 0.25";
        costInfo += "\nThis is then multiplied by 2.25";
        costInfo += "Because of your status as a student it is then reduced by 80%";
        costInfo += "\nThis means your cost is: ";
        costInfo += "\n€" + calculateCost();
        return costInfo;
    }
}
