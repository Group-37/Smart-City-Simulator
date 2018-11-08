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
public class CityBuilderAdapter implements CityBuilder{

    
    SmartCityBuilder city = new SmartCityBuilder();
    @Override
    public void buildCityFlat(int i, int j) {
        city.buildCityApartment(i, j);
    }

    @Override
    public void buildCityOffice(int i, int j) {
        city.buildCityFactory(i, j);
    }

    @Override
    public void buildCityPoliceStation(int i, int j) {
        city.buildCityGardaStation(i, j);
    }

    @Override
    public void buildCityGP(int i, int j) {
        city.buildCityHospital(i, j);
    }

    @Override
    public void buildCityHut(int i, int j) {
        city.buildCityHouse(i, j);
    }

    @Override
    public void buildCityMuseum(int i, int j) {
        city.buildCityPowerPlant(i, j);
    }

    @Override
    public void buildCityStreet(int i, int j) {
        city.buildCityRoads(i, j);
    }

    @Override
    public void buildCityUniversity(int i, int j) {
       city.buildCitySchool(i, j);
    }

    @Override
    public void buildCityBlank(int i, int j) {
        city.buildCityBlank(i, j);
    }

    @Override
    public City getCity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
