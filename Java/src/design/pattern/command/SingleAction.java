package design.pattern.command;

public class SingleAction implements Action {

	@Override
	public void action() {
		System.out.println("single action...");
	}

}
