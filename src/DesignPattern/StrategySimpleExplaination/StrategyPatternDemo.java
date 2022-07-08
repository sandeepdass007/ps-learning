package DesignPattern.StrategySimpleExplaination;

public class StrategyPatternDemo {
	   public static void main(String[] args) {
	      Strategy s = new AddOperation();		
	      System.out.println("10 + 5 = " + s.doOperation(10, 5));
	      
	      s = new PowerOperation();
	      System.out.println("10 ^ 5 = " + s.doOperation(10, 5));
	      
	      s = new MultiplyOperation();
	      System.out.println("10 * 5 = " + s.doOperation(10, 5));
		
	      System.out.println("Just change the context");
	      Context context;
	      context = new Context(new AddOperation());
	      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
			 
	      context = new Context(new MultiplyOperation());
	      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
			 
	   }
	}