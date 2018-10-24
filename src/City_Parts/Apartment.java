package City_Parts;

public class Apartment extends Building{

	public Apartment() {
		this.hoursOcc = 7;
		this.energyCost = 22.0f;
		this.residents = 40;
		this.heatingCost = 17.0f;
		this.uValue = 0.19f;
	}
	public String getSymbol()
	{
		return "A";
	}

}
