package Main_Controller;

public class Calculate_ResourcesPrintCityCommand implements Command{
	Calculate_Resources cR1;
	
	public Calculate_ResourcesPrintCityCommand(Calculate_Resources cR1)
	{
		this.cR1 = cR1;
	}

	@Override
	public void execute() {
		cR1.printTheCity();
	}
}
