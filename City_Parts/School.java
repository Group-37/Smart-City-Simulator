
public class School extends Building{

	public String name;
	
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
}