package City_Parts;

public class House extends Building{

	public House() {
		this.hoursOcc = 7;
		this.energyCost = 2.0f;
		this.residents = 4;
		this.heatingCost = 1.0f;
		this.uValue = 0.19f;
	}
	public String getSymbol()
	{
		return "H";
	}

}
