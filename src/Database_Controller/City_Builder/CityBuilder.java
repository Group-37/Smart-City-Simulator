package Database_Controller.City_Builder;
public interface  CityBuilder{

    public void buildCityApartment(int i, int j);

    public void buildCityFactory(int i, int j);
    
    public void buildCityGardaStation(int i, int j);
    
    public void buildCityHospital(int i, int j);
    
    public void buildCityHouse(int i, int j);
    
    public void buildCityPowerPlant(int i, int j);
    
    public void buildCityRoads(int i, int j);
    
    public void buildCitySchool(int i, int j);
    
    public void buildCityBlank(int i, int j);
    
    public City getCity();
}