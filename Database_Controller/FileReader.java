package Database_Controller;

import java.io.*;
import java.nio.file.*;
import java.util.*;


public class FileReader
{
	private Scanner x;
	private String[][] map;

	public void openFile()
	{
		try
		{
			Path p1 = Paths.get("../Map.txt");
			x = new Scanner(new File(p1));
		}
		catch(Exception e)
		{
			System.out.print("could not find file");
		}
	}

	public void readFile()
	{
		while (x.hasNext()) 
		{
			String a = x.next();	
			String b = x.next();
			String c = x.next();
			
			System.out.printf("%s %s %s\n", a,b,c);
		}
	}

	public void closeFile()
	{
		x.close();
	}
}