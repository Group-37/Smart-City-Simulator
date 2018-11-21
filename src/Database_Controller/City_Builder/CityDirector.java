package Database_Controller.City_Builder;
public class CityDirector {

    private CityBuilder cityBuilder;

    public CityDirector(CityBuilder cityBuilder){
        this.cityBuilder = cityBuilder;
    }

    public City getCity(){
        return this.cityBuilder.getCity();
    }

    public void makeCity(String [][] cityArray){

        for(int i = 0; i < cityArray.length; i++) {
            for (int j = 0; j < cityArray[i].length; j++) {

                if(cityArray[i][j].equalsIgnoreCase("a"))
                {
                	this.cityBuilder.buildCityApartment(i, j);
                }
                
                if(cityArray[i][j].equalsIgnoreCase("f"))
                {
                	this.cityBuilder.buildCityFactory(i, j);
                }
                
                if(cityArray[i][j].equalsIgnoreCase("r"))
                {
                	this.cityBuilder.buildCityRoads(i, j);
                }
                
                if(cityArray[i][j].equalsIgnoreCase("+"))
                {
                	this.cityBuilder.buildCityHospital(i, j);
                }
                
                if(cityArray[i][j].equalsIgnoreCase("h"))
                {
                	this.cityBuilder.buildCityHouse(i, j);
                }
                
                if(cityArray[i][j].equalsIgnoreCase("s"))
                {
                	this.cityBuilder.buildCitySchool(i, j);
                }
                
                if(cityArray[i][j].equalsIgnoreCase("g"))
                {
                	this.cityBuilder.buildCityGardaStation(i, j);
                }
                
                if(cityArray[i][j].equalsIgnoreCase("p"))
                {
                	this.cityBuilder.buildCityPowerPlant(i, j);
                }
                
                if(cityArray[i][j].equalsIgnoreCase("0"))
                {
                	this.cityBuilder.buildCityBlank(i, j);
                }
                
            }
        }
    }
}