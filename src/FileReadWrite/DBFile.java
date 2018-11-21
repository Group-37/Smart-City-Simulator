package FileReadWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import Main_Controller.StructureDatabase;
import Main_Controller.StructureDatabaseList;

public class DBFile implements IFile {

	private String writeFileName = "";
    private String readFileName = "";
    
    @Override
    public String [][] read() {
    	RestTemplate restTemplate = new RestTemplate();
    	ResponseEntity<StructureDatabase[]> list = restTemplate.getForEntity("http://localhost:8080/structureDatabase/all", StructureDatabase[].class);
    	StructureDatabase[] array = list.getBody();
    	//List<StructureDatabase> forLoopList = list.getStructures();
    	int maxX = 0, maxY = 0;
    	for (int i = 0; i < array.length; i++)
    	{
    		if (array[i].getxPos() > maxX)
    			maxX = array[i].getxPos();
    		if (array[i].getyPos() > maxY)
    			maxY = array[i].getyPos(); 
    	}
    	String [][] returnArray = new String[maxX+1][maxY+1];
    	for (int i = 0; i < array.length; i++)
    	{
    		returnArray[array[i].getxPos()][array[i].getyPos()] = array[i].getSymbol();
    	}
    	return returnArray;
    	/*
        File newFile = new File(readFileName);
        Scanner in = null;
        try {
            in = new Scanner(newFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SCFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(readFileName);
        String [][] returnString;
        int numRows = 0;
        int numColumns = 0;
        String line = "";
        if (newFile.exists())
        {
	        while (in.hasNextLine())
	        {
	            line = in.nextLine();
	            if (!line.isEmpty())
	            {
	                numRows++;
	                //finding largest number of columns and using for init
	                int thisNumColumns = line.split(delimiter).length;
	                if (thisNumColumns > numColumns)
	                    numColumns = thisNumColumns;
	            }
	        }
	        try {
	            in = new Scanner(newFile);
	        } catch (FileNotFoundException ex) {
	            Logger.getLogger(SCFile.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        if (numRows != 0)
	        {
	            returnString = new String[numRows][numColumns];
	            for (int i = 0; i < numRows;i++ )
	            {
	                line = in.nextLine();
	                returnString[i] = line.split(delimiter);
	            }
	            in.close();
	            return returnString;
	        }
	        in.close();
        }
        return null;
        */
    }

    @Override
    public void write(String[][] write) {
    	RestTemplate restTemplate = new RestTemplate();
    	for (int i = 0; i < write.length; i++)
    	{
    		for (int j = 0; j < write[i].length; j++)
    		{
    			StructureDatabase structure = new StructureDatabase();
    			structure.setSymbol(write[i][j]);
    			System.out.println(write[i][j]);
    			structure.setxPos(i);
    			structure.setyPos(j);
    			restTemplate.postForObject("http://localhost:8080/structureDatabase", structure, StructureDatabase.class);
    		}
    	}
        /*
    	FileWriter fw = null;
        try {
            
            fw = new FileWriter(writeFileName, canAppend);
            int largestColumn = 0;
            for (int i = 0; i < write.length;i++)
            {
                int numColumn = write[i].length;
                if (numColumn > largestColumn)
                    largestColumn = numColumn;
            }
            for (int i = 0; i < write.length; i++)
            {
                for (int j = 0; j < write[i].length; j++)
                {
                    if (j < (write[i].length - 1))
                        fw.write(write[i][j] + delimiter);
                    else {
                        System.out.println("write[i][j] = " + write[i][j]);
                        fw.write(write[i][j]);
                    }
                }
                fw.write("\r\n");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File not found!");
        }
        finally
        {
            try {
                fw.close();
            } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Could not close FileWriter");
            }
        }
        */
    }

    @Override
    public void get(String filepath) {
        this.readFileName = filepath;
    }

    @Override
    public void put(String filepath) {
        this.writeFileName = filepath;
    }

	@Override
	public void append(boolean canAppend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDelimiter() {
		// TODO Auto-generated method stub
		return null;
	}
}
