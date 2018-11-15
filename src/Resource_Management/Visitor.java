package Resource_Management;


public interface Visitor {
	public float visit(Electricity electricty);
	
	public float visit(Water water);
	
	public float visit(Heat heat);
}
