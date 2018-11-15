package Main_Controller.Chain_Of_Responsibility;

public interface Chain {

	public void setNextChain(Chain nextChain);

	public float calculate(StructureCalculation structureCalc);

}
