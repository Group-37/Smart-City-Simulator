package Database_Controller;

import FileReadWrite.IFile;

public abstract class AbstractCRUD {
	protected IFile fileReaderWriter;
	
	public AbstractCRUD(IFile fileReaderWriter)
	{
		this.fileReaderWriter = fileReaderWriter;
	}
	
	public abstract String[][] readFile();
	public abstract void saveFile();
	public abstract void printContent();
}
