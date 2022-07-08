package DesignPattern.StrategySimpleExplaination;

public class PowerOperation implements Strategy {

	@Override
	public int doOperation(int a, int b) {
		// TODO Auto-generated method stub
		return (int) Math.pow(a, b);
	}

}
