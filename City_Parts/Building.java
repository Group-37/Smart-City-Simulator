public class Building
{
	//Hours of Occupation
	public int hoursOcc;
	//Energy Consumption per Hour
	public float energyConsumption;
	//Amount of People per Building
	public int residents;
	//Heating Cost
	public float heatingCost;
	//U-Value
	public float uValue;
	
	public Building(int hoursOcc, float energyConsumption, int residents, float heatingCost, float uValue){
		this.hoursOcc = hoursOcc;
		this.energyConsumption = energyConsumption;
		this.residents = residents;
		this.heatingCost = heatingCost;
		this.uValue = uValue;
	}
	
	//Getters and Setters

	public int getHoursOcc() {
		return hoursOcc;
	}

	public void setHoursOcc(int hoursOcc) {
		this.hoursOcc = hoursOcc;
	}

	public float getEnergyConsumption() {
		return energyConsumption;
	}

	public void setEnergyConsumption(float energyConsumption) {
		this.energyConsumption = energyConsumption;
	}

	public int getResidents() {
		return residents;
	}

	public void setResidents(int residents) {
		this.residents = residents;
	}

	public float getHeatingCost() {
		return heatingCost;
	}

	public void setHeatingCost(float heatingCost) {
		this.heatingCost = heatingCost;
	}

	public float getuValue() {
		return uValue;
	}

	public void setuValue(float uValue) {
		this.uValue = uValue;
	}
	
}