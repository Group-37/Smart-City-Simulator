package Main_Controller.Memento;

import Database_Controller.*;
import Database_Controller.City_Builder.City;

public class Originator {

	private City city;

	public void set(City newCity)
	{
		city = newCity;
	}
	
	public Memento storeInMemento()
	{
		return new Memento(city);
	}
	
	public City restoreFromMemento(Memento memento)
	{
		city = memento.getSavedCity();
		return city;
	}
}
