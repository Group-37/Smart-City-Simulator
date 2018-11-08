package Database_Controller;
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
                	this.cityBuilder.buildCityFlat(i, j);
                }
                
                if(cityArray[i][j].equalsIgnoreCase("f"))
                {
                	this.cityBuilder.buildCityOffice(i, j);
                }
                
                if(cityArray[i][j].equalsIgnoreCase("r"))
                {
                	this.cityBuilder.buildCityStreet(i, j);
                }
                
                if(cityArray[i][j].equalsIgnoreCase("+"))
                {
                	this.cityBuilder.buildCityGP(i, j);
                }
                
                if(cityArray[i][j].equalsIgnoreCase("h"))
                {
                	this.cityBuilder.buildCityHut(i, j);
                }
                
                if(cityArray[i][j].equalsIgnoreCase("s"))
                {
                	this.cityBuilder.buildCityUniversity(i, j);
                }
                
                if(cityArray[i][j].equalsIgnoreCase("g"))
                {
                	this.cityBuilder.buildCityPoliceStation(i, j);
                }
                
                if(cityArray[i][j].equalsIgnoreCase("p"))
                {
                	this.cityBuilder.buildCityMuseum(i, j);
                }
                
                if(cityArray[i][j].equalsIgnoreCase("0"))
                {
                	this.cityBuilder.buildCityBlank(i, j);
                }
                
            }
        }
    }
}