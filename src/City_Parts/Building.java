package City_Parts;

public class Building extends Structure
{
	

	
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
		float totalCost = 0.0f;
		totalCost = (hoursOcc * energyCost) + (hoursOcc * heatingCost);
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

}
