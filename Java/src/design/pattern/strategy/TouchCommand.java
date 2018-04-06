package design.pattern.strategy;

public class TouchCommand implements Command {

	@Override
	public void doSomething() {
		System.out.println("create doucment...");
	}

}
