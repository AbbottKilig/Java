package design.pattern.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		Context context = new Context(new TouchCommand());
		context.executeCommand();
		
		context  = new Context(new RemoveCommand());
		context.executeCommand();
	}
}
