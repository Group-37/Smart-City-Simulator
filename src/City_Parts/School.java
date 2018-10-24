package City_Parts;

public class School extends Building{

	public String name;

	public School() {
		this.hoursOcc = 7;
		this.energyCost = 70.0f;
		this.residents = 130;
		this.heatingCost = 70.0f;
		this.uValue = 0.19f;
	}
	
	public School(String name, int hoursOcc, float energyConsumption, int residents, float heatingCost, float uValue){
		super(hoursOcc, energyConsumption, residents, heatingCost, uValue);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol()
	{
		return "S";
	}

}