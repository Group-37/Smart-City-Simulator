package City_Parts;

public class Hospital extends Building {
	public Hospital() {
		this.hoursOcc = 24;
		this.energyCost = 140.0f;
		this.residents = 300;
		this.heatingCost = 130.0f;
		this.uValue = 0.19f;
	}
	public String getSymbol()
	{
		return "+";
	}

}
