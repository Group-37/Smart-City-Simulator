package Main_Controller;

public class ShowDetails {
	CityDetails cityDetails;
	
	public ShowDetails(CityDetails cityDetails)
	{
		this.cityDetails = cityDetails;
	}
	
	public void printTheDetails()
	{
		System.out.println("\nTotal population: " + cityDetails.getTotalPop());
		System.out.println("Total cost of energy per day: " + cityDetails.getTotalEnergyCost());
		System.out.println("Total cost of heat per day: " + cityDetails.getTotalHeatCost());
		System.out.println("Total Cost per day: " + cityDetails.getTotalEnergyCostPerDay());
		int costPerYear = (int)cityDetails.getTotalEnergyCostPerDay() * 365;
		System.out.println("Total Cost per year: " + costPerYear);
	}
}
