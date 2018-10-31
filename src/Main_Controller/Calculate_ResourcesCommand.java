package Main_Controller;

public class Calculate_ResourcesCommand implements Command{
	Calculate_Resources cR1;
	
	public Calculate_ResourcesCommand(Calculate_Resources cR1)
	{
		this.cR1 = cR1;
	}

	@Override
	public void execute() {
		cR1.calculateTheResources();
	}
	
}
