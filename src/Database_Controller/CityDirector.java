package Database_Controller;
public class CityDirector {

    private CityBuilder cityBuilder;
    private BuildingFactory buildFactory = new BuildingFactory();
    
    public CityDirector(CityBuilder cityBuilder){
        this.cityBuilder = cityBuilder;
    }

    public City getCity(){
        return this.cityBuilder.getCity();
    }

    public void makeCity(String [][] cityArray){

        for(int i = 0; i < cityArray.length; i++) {
            for (int j = 0; j < cityArray[i].length; j++) {
                
                cityBuilder = buildFactory.Build(cityArray[i][j], this.cityBuilder, i, j );
          }
    }
}
}