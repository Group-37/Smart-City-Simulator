/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database_Controller;

/**
 *
 * @author user1
 */
class AusCityBuilder extends CityAdapterAus {
    private City city;

    public AusCityBuilder(){
        this.city = new City();
    }
    
    public void buildCityUnit(int i, int j){
        city.setCityApartment(i, j);
    }

    @Override
    public void buildCityFactory(int i, int j){
        city.setCityFactory(i, j);
    }
    
   
	public void buildCityPoliceStation(int i, int j) {
		
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
	
	public void buildCityCollege(int i, int j) {
		city.setCitySchool(i, j);
	}
    
	
	public void buildCityBlank(int i, int j) {
		city.setCityBlank(i, j);
	}

    public City getCity(){
        return this.city;
    }
    
}
