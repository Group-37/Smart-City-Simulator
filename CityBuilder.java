package Database_Controller;
public interface  CityBuilder{

    public void buildCityFlat(int i, int j);

    public void buildCityOffice(int i, int j);
    
    public void buildCityPoliceStation(int i, int j);
    
    public void buildCityGP(int i, int j);
    
    public void buildCityHut(int i, int j);
    
    public void buildCityMuseum(int i, int j);
    
    public void buildCityStreet(int i, int j);
    
    public void buildCityUniversity(int i, int j);
    
    public void buildCityBlank(int i, int j);
    
    public City getCity();
}