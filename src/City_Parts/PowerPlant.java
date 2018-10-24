package City_Parts;

public class PowerPlant extends Building{
	public String getSymbol()
	{
		return "P";
	}

	public PowerPlant() {
		this.hoursOcc = 24;
		this.energyCost = 500.0f;
		this.residents = 30;
		this.heatingCost = 100.0f;
		this.uValue = 0.19f;
	}

	@Override
	public int getResidents() {
		return super.getResidents();
	}
}
