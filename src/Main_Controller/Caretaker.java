package Main_Controller;
import Database_Controller.*;
import java.util.*;

public class Caretaker {

	ArrayList<Memento> savedCities = new ArrayList<Memento>();
	
	public void addMemento(Memento m){ savedCities.add(m); }
	
	public Memento getMemento(int index){ return savedCities.get(index); }

}