package Database_Controller;
public class SmartCityBuilder implements CityBuilder {
    private City city;

    public SmartCityBuilder(){
        this.city = new City();
    }
    @Override
    public void buildCityApartment(int i, int j){
        city.setCityApartment(i, j);
    }

    @Override
    public void buildCityFactory(int i, int j){
        city.setCityFactory(i, j);
    }
    
    @Override
	public void buildCityGardaStation(int i, int j) {
		
    	city.setCityGardaStation(i, j);
	}
	@Override
	public void buildCityHospital(int i, int j) {
		city.setCityHospital(i, j);
	}
	@Override
	public void buildCityHouse(int i, int j) {
		city.setCityHouse(i, j);
	}
	@Override
	public void buildCityPowerPlant(int i, int j) {
		city.setCityPowerPlant(i, j);
	}
	@Override
	public void buildCityRoads(int i, int j) {
		city.setCityRoad(i, j);
	}
	@Override
	public void buildCitySchool(int i, int j) {
		city.setCitySchool(i, j);
	}
    
	@Override
	public void buildCityBlank(int i, int j) {
		city.setCityBlank(i, j);
	}

    public City getCity(){
        return this.city;
    }
	
}