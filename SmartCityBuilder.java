package Database_Controller;
public class SmartCityBuilder extends CityBuilderAdapter {
    private City city;

    public SmartCityBuilder(){
        this.city = new City();
    }
    
    public void buildCityApartment(int i, int j){
        city.setCityApartment(i, j);
    }

    
    public void buildCityFactory(int i, int j){
        city.setCityFactory(i, j);
    }
    
    
	public void buildCityGardaStation(int i, int j) {
		
    	city.setCityGardaStation(i, j);
	}
	
	public void buildCityHospital(int i, int j) {
		city.setCityHospital(i, j);
	}
	
	public void buildCityHouse(int i, int j) {
		city.setCityHouse(i, j);
	}
	
	public void buildCityPowerPlant(int i, int j) {
		city.setCityPowerPlant(i, j);
	}
	
	public void buildCityRoads(int i, int j) {
		city.setCityRoad(i, j);
	}
	
	public void buildCitySchool(int i, int j) {
		city.setCitySchool(i, j);
	}
    
	
	public void buildCityBlank(int i, int j) {
		city.setCityBlank(i, j);
	}

    public City getCity(){
        return this.city;
    }
	
}