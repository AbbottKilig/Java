package design.pattern.state;

public class OutageState implements State {

	@Override
	public void execute(Computer computer) {
		System.out.println("computer is shutdowning...");
		computer.setState(this);
	}
	
	@Override
	public String toString() {
		return "shutdowning";
	}

}
