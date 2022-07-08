package DesignPattern.StrategySimpleExplaination;

public class Context {
	Strategy s;
	public Context(Strategy s) {
		this.s = s;
	}
	public int executeStrategy(int a, int b) {
		return s.doOperation(a, b);
	}
}
