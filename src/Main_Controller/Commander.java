package Main_Controller;

public class Commander {
	Command command;
	
	public Commander()
	{
		
	}
	
	public void setCommand(Command command)
	{
		this.command = command;
	}
	
	public void doCommand()
	{
		command.execute();
	}
	
}
