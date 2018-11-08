package Main_Controller;

import Database_Controller.*;

public class Memento {

	private City city;
	
	public Memento(City citySave) { city = citySave; }
	
	public City getSavedCity() { return city; }
	
}
