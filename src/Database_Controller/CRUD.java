package Database_Controller;
import City_Parts.*;
import java.io.File;
import java.util.Scanner;
import FileReadWrite.IFile;
//import Resources.*;
public class CRUD {
	
	private Scanner x;
	private IFile fileReaderWriter;
        private Structure [][] structures = null;
        private String[][] map;
        
        public CRUD(IFile fileReaderWriter)
        {
            this.fileReaderWriter = fileReaderWriter;
        }

        public void setFileReaderWriter(IFile fileReaderWriter)
        {
            this.fileReaderWriter = fileReaderWriter;
        }
        
	public void openFile(String fileName)
	{
            this.fileReaderWriter.get(fileName);
            this.fileReaderWriter.put(fileName);
	}
        
        
        
        public void saveFile(String fileName)
        {
            this.fileReaderWriter.put(fileName);
            if (structures != null)
            {
                String [][] output = new String[structures.length][structures[0].length];
                for (int i = 0; i < structures.length; i++)
                {
                    for (int j = 0; j < structures[0].length; j++)
                    {
                        if (!structures[i][j].getSymbol().equals(" "))
                            output[i][j] = structures[i][j].getSymbol().toLowerCase();
                        else
                            output[i][j] = "0";
                    }
                }
                this.fileReaderWriter.write(output);
            }
            else
            {
                String [][] output = new String[1][1];
                output[0][0] = "Could not find content for output :(";
                this.fileReaderWriter.write(output);
            }
        }
                
	public Structure[][] readFile()
	{
		/*
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
                */
            String [][] fileContent = fileReaderWriter.read();
            structures = new Structure [fileContent.length][fileContent[0].length];
            int count = 0;
            for (int i = 0; i < fileContent.length; i++)
            {
                for (int j = 0; j < fileContent[i].length; j++)
                {
                    if(fileContent[i][j].equalsIgnoreCase("r"))
                        structures[count][j] = new Roads();
                    else if(fileContent[i][j].equalsIgnoreCase("h"))
			structures[count][j] = new House();
                    else if(fileContent[i][j].equalsIgnoreCase("a"))
			structures[count][j] = new Apartment();
                    else if(fileContent[i][j].equalsIgnoreCase("f"))
			structures[count][j] = new Factory();
                    else if(fileContent[i][j].equalsIgnoreCase("p"))
                        structures[count][j] = new PowerPlant();
                    else if(fileContent[i][j].equalsIgnoreCase("s"))
                        structures[count][j] = new School();
                    else if(fileContent[i][j].equalsIgnoreCase("g"))
                        structures[count][j] = new GardaStation();
                    else if(fileContent[i][j].equalsIgnoreCase("+"))
                        structures[count][j] = new Hospital();
                    else if(fileContent[i][j].equalsIgnoreCase("0"))
                        structures[count][j] = new Structure();
                    else
                        structures[count][j] = new Structure();
                }
                count++;
            }
            return structures;
	}
        
        public void saveFile()
        {
            if (structures != null)
            {
                String [][] output = new String[structures.length][structures[0].length];
                for (int i = 0; i < structures.length; i++)
                {
                    for (int j = 0; j < structures[0].length; j++)
                    {
                        if (!structures[i][j].getSymbol().equals(" "))
                            output[i][j] = structures[i][j].getSymbol().toLowerCase();
                        else
                            output[i][j] = "0";
                    }
                }
                this.fileReaderWriter.write(output);
            }
            else
            {
                String [][] output = new String[1][1];
                output[0][0] = "Could not find content for output :(";
                this.fileReaderWriter.write(output);
            }
        }
        
        public void printContent()
        {
            for (int i = 0; i < structures.length; i++)
            {
                for (int j = 0; j < structures[0].length; j++)
                {
                    System.out.print(structures[i][j].getSymbol().toLowerCase() + fileReaderWriter.getDelimiter());
                }
                System.out.println();
            }
        }

	public void closeFile()
	{
		x.close();
	}
}
