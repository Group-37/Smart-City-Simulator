package Main_Controller;
import Database_Controller.*;
import City_Parts.*;
public class Controller {
	
	public static void main(String [] args)
	{
		Structure[][] structures;
		CRUD c = new CRUD();
		structures = c.readFile();
		
		//temp [] t = structures[0];
		for(int i = 0; i < structures.length; i++)
		{
			for(int j = 0; j < structures[i].length; j++)
			{
				System.out.print(structures[i][j].getSymbol());
			}
			System.out.println();
		}
		
	}
}
