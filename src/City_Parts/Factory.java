package City_Parts;

public class Factory extends Building{

	public Factory() {
		this.hoursOcc = 8;
		this.energyCost = 100.0f;
		this.residents = 50;
		this.heatingCost = 60.0f;
		this.uValue = 0.19f;
	}
	public String getSymbol()
	{
		return "F";
	}

}
