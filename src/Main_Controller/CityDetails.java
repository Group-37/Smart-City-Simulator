package Main_Controller;

public class CityDetails {
	int totalPop = 0;
	float totalEnergyConsumptionPerDay = 0.0f;
	float totalHeatCost = 0.0f;
	float totalEnergyCost = 0.0f;
	float totalEnergyCostPerDay = 0f;
	
	public CityDetails()
	{
		
	}
	
	public CityDetails(int totalPop, float totalEnergyConsumptionPerDay,
			float totalHeatCost,
			float totalEnergyCost,
			float totalEnergyCostPerDay)
	{
		this.totalPop = totalPop;
		this.totalEnergyConsumptionPerDay = totalEnergyConsumptionPerDay;
		this.totalHeatCost = totalHeatCost;
		this.totalEnergyCost = totalEnergyCost;
		this.totalEnergyCostPerDay = totalEnergyCostPerDay;
	}

	public int getTotalPop() {
		return totalPop;
	}

	public void setTotalPop(int totalPop) {
		this.totalPop = totalPop;
	}

	public float getTotalEnergyConsumptionPerDay() {
		return totalEnergyConsumptionPerDay;
	}

	public void setTotalEnergyConsumptionPerDay(float totalEnergyConsumptionPerDay) {
		this.totalEnergyConsumptionPerDay = totalEnergyConsumptionPerDay;
	}

	public float getTotalHeatCost() {
		return totalHeatCost;
	}

	public void setTotalHeatCost(float totalHeatCost) {
		this.totalHeatCost = totalHeatCost;
	}

	public float getTotalEnergyCost() {
		return totalEnergyCost;
	}

	public void setTotalEnergyCost(float totalEnergyCost) {
		this.totalEnergyCost = totalEnergyCost;
	}

	public float getTotalEnergyCostPerDay() {
		return totalEnergyCostPerDay;
	}

	public void setTotalEnergyCostPerDay(float totalEnergyCostPerDay) {
		this.totalEnergyCostPerDay = totalEnergyCostPerDay;
	}
}
