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
public class CityAdapterAus implements CityBuilder{

    
    AusCityBuilder city = new AusCityBuilder();
  
    @Override
    public void buildCityApartment(int i, int j) {
        city.buildCityUnit(i, j);
    }

    @Override
    public void buildCityFactory(int i, int j) {
       city.buildCityFactory(i, j);
    }

    @Override
    public void buildCityGardaStation(int i, int j) {
        city.buildCityPoliceStation(i, j);
    }

    @Override
    public void buildCityHospital(int i, int j) {
        city.buildCityHospital(i, j);
    }

    @Override
    public void buildCityHouse(int i, int j) {
        city.buildCityHouse(i, j);
    }

    @Override
    public void buildCityPowerPlant(int i, int j) {
        city.buildCityPowerPlant(i, j);
    }

    @Override
    public void buildCityRoads(int i, int j) {
       city.buildCityRoads(i, j);
    }

    @Override
    public void buildCitySchool(int i, int j) {
        city.buildCityCollege(i, j);
    }

    @Override
    public void buildCityBlank(int i, int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public City getCity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
