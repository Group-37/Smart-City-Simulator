package City_Parts;


public class GardaStation extends Building{

	public String name;

	public GardaStation() {
		this.hoursOcc = 8;
		this.energyCost = 8.0f;
		this.residents = 10;
		this.heatingCost = 7.0f;
		this.uValue = 0.19f;
	}

	public GardaStation(String name, int hoursOcc, float energyConsumption, int residents, float heatingCost, float uValue){
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
		return "G";
	}

}

