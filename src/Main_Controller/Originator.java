package Main_Controller;

import Database_Controller.*;

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
