package Main_Controller.Memento;

import Database_Controller.*;
import Database_Controller.City_Builder.City;

public class Memento {

	private City city;
	
	public Memento(City citySave) { city = citySave; }
	
	public City getSavedCity() { return city; }
	
}
