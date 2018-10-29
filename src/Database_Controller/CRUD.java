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
			x = new Scanner(new File("D:\\SmartCitySim\\src\\Resources\\Map.txt"));
		}
		catch(Exception e)
		{
			System.out.print("could not find file");
		}
	}

	public String [][] readFile()
	{
		openFile();
		int count = 0;
		String[][] map = new String [13][33]; //13 33
		while (x.hasNext()) 
		{
			String line = x.next();	
			String [] splitLine = line.split(",");
			map[count] = splitLine;
			
			count++;
		}
		closeFile();
		return map;
	}
	
	public void closeFile()
	{
		x.close();
	}
}
