package design.pattern.strategy;

public class RemoveCommand implements Command {

	@Override
	public void doSomething() {
		System.out.println("delete document...");
	}

}
