package Database_Controller;
import City_Parts.*;
import java.io.File;
import java.util.Scanner;

public class CRUD {
	
	private Scanner x;
	private String[][] map;

	public void openFile()
	{
		try
		{
			x = new Scanner(new File("C:\\Users\\Michael\\Desktop\\Smart-City-Simulator-master\\src\\Resources\\Map.txt"));
		}
		catch(Exception e)
		{
			System.out.print("could not find file");
		}
	}

	public Structure[][] readFile()
	{
		openFile();
		int count = 0;
		Structure[][] structures = new Structure [13][33]; //13 33
		while (x.hasNext()) 
		{
			String line = x.next();	
			String [] splitLine = line.split(",");
			for(int i = 0; i < splitLine.length ; i++)
			{
				if(splitLine[i].equalsIgnoreCase("r"))
					structures[count][i] = new Roads();
				else if(splitLine[i].equalsIgnoreCase("h"))
					structures[count][i] = new House();
				else if(splitLine[i].equalsIgnoreCase("a"))
					structures[count][i] = new Apartment();
				else if(splitLine[i].equalsIgnoreCase("f"))
					structures[count][i] = new Factory();
				else if(splitLine[i].equalsIgnoreCase("p"))
					structures[count][i] = new PowerPlant();
				else if(splitLine[i].equalsIgnoreCase("s"))
					structures[count][i] = new School();
				else if(splitLine[i].equalsIgnoreCase("g"))
					structures[count][i] = new GardaStation();
				else if(splitLine[i].equalsIgnoreCase("+"))
					structures[count][i] = new Hospital();
				else if(splitLine[i].equalsIgnoreCase("0"))
					structures[count][i] = new Structure();
				else
					structures[count][i] = new Structure();
				
			}
			count++;
		}
		closeFile();
		return structures;
	}

	public void closeFile()
	{
		x.close();
	}
}
