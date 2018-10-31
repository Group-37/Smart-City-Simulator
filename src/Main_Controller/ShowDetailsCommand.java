package Main_Controller;

public class ShowDetailsCommand implements Command{
	ShowDetails sD1;
	
	public ShowDetailsCommand(ShowDetails sD1)
	{
		this.sD1 = sD1;
	}
	
	@Override
	public void execute() {
		sD1.printTheDetails();
	}

}
