package City_Parts;

import Resource_Management.*;

public class Building extends Structure
{
	
	private Water waterCosts;
	private Electricity electricityCosts;
	private Heat heatCosts;
	
	
    float totalCost;
	//Hours of Occupation
	public int hoursOcc;
	//Energy Consumption per Hour
	public float energyCost;
	//Amount of People per Building
	public int residents;
	//Heating Cost
	public float heatingCost;
	//U-Value
	public float uValue;

	public float electricityTotal;
	public float waterTotal;
	public float heatTotal;
	
	public Building() {

	}

	public Building(int hoursOcc, float energyCost, int residents, float heatingCost, float uValue){
		this.hoursOcc = hoursOcc;
		this.energyCost = energyCost;
		this.residents = residents;
		this.heatingCost = heatingCost;
		this.uValue = uValue;
	}
	
	//Getters and Setters
	@Override
	public int getHoursOcc() {
		return hoursOcc;
	}

	public void setHoursOcc(int hoursOcc) {
		this.hoursOcc = hoursOcc;
	}
	@Override
	public float getEnergyConsumption() {
		return energyCost;
	}

	public void setEnergyConsumption(float energyConsumption) {
		this.energyCost = energyConsumption;
	}

	@Override
	public int getResidents() {
		return residents;
	}

	public void setResidents(int residents) {
		this.residents = residents;
	}

	@Override
	public float getHeatingCost() {
		return heatingCost;
	}

	public void setHeatingCost(float heatingCost) {
		this.heatingCost = heatingCost;
	}

	@Override
	public float getuValue() {
		return uValue;
	}

	public void setuValue(float uValue) {
		this.uValue = uValue;
	}
	
	public String getSymbol()
	{
		return "B";
	}

	@Override
	public float getTotalCost()
	{
		return totalCost;
	}

	@Override
	public float getHeatingCostPerDay()
	{
		float heatingCostPerDay = 0.0f;
		heatingCostPerDay = (hoursOcc * heatingCost);
		return heatingCostPerDay;
	}

	@Override
	public float getEnergyCostPerDay()
	{
		float energyCostPerDay = 0.0f;
		energyCostPerDay = (hoursOcc * energyCost);
		return energyCostPerDay;
	}
	
	public Water getWaterCosts() {
		return waterCosts;
	}

	public void setWaterCosts(Water waterCosts) {
		this.waterCosts = waterCosts;
	}

	public Electricity getElectricityCosts() {
		return electricityCosts;
	}

	public void setElectricityCosts(Electricity electricityCosts) {
		this.electricityCosts = electricityCosts;
	}

	public Heat getHeatCosts() {
		return heatCosts;
	}

	public void setHeatCosts(Heat heatCosts) {
		this.heatCosts = heatCosts;
	}
	
	public void setTotalCost()
	{
		if (waterCosts != null)	
			totalCost += waterTotal;
		if (electricityCosts != null)
			totalCost += electricityTotal;
		if (heatCosts != null)
			totalCost += heatTotal;
		//totalCost = (hoursOcc * energyCost) + (hoursOcc * heatingCost);
	}
	
	public void setElectricityTotal(Visitor visitor)
	{
		electricityTotal = electricityCosts.accept(visitor);
	}

	public void setWaterTotal(Visitor visitor)
	{
		waterTotal = waterCosts.accept(visitor);
	}
	
	public void setHeatTotal(Visitor visitor)
	{
		heatTotal = heatCosts.accept(visitor);
	}
	
	public double getElectricityTotal()
	{
		return electricityTotal;
	}

	public double getWaterTotal()
	{
		return waterTotal;
	}
	
	public double getHeatTotal()
	{
		return heatTotal;
	}
}
