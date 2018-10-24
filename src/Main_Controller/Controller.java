package Main_Controller;
import Database_Controller.*;
import City_Parts.*;
import FileReadWrite.*;
public class Controller {
	
	public static void main(String [] args)
	{
		Structure[][] structures;
                IFileFactory.addIFile("CSFile", new CSFile());
                IFileFactory.addIFile("SCFile", new SCFile());
                
                IFile fileReaderWriter = IFileFactory.getIFile("CSFile");
                fileReaderWriter.append(false);
		CRUD c = new CRUD(fileReaderWriter);
                c.openFile("C:\\Users\\Chris Mulcahy\\Documents\\GitHub\\Smart-City-Simulator\\src\\Resources\\Map.txt");
		structures = c.readFile();
		
                /*
                IFile fileWriterTest = IFileFactory.getIFile("SCFile");
                fileWriterTest.append(false);
                c.setFileReaderWriter(fileWriterTest);
                */
                
                System.out.println("<----------------------------------------->");
                c.printContent();
		System.out.println("<----------------------------------------->");
                //temp [] t = structures[0];
		/*
                for(int i = 0; i < structures.length; i++)
		{
			for(int j = 0; j < structures[i].length; j++)
			{
				System.out.print(structures[i][j].getSymbol());
			}
			System.out.println();
		}
                */
		
	}
}
